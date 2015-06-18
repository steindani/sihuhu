# Sihuhu
*Sihuhu* was made within the Model Driven Software Development course of Budapest University of Technology and Economics. It was developed for modeling and simulation of railway models. This page provides the most important information on the project, followed by a brief explanation of *Sihuhu*'s structure and functions, a short description of how to use the tools provided, demonstrated on the departure's railway model, and finally some ideas on future work.

## Dependencies
 - Eclipse Modeling Tools 4.4.2
 - EMF IncQuery 0.9.1
 - Xtext Complete IDE 2.7.3
 - Xtend IDE 2.7.3
 - Sirius 2.0

## Related Sites
 - [Fault Tolerant Systems Research Group](https://inf.mit.bme.hu/en)
 - [Hungarian text of the homework](https://inf.mit.bme.hu/edu/courses/mdsd/homework) !!!
 - [Solution of the GoMRP team](https://github.com/benedekh/gomrp/)



## Quick Facts about *Sihuhu*
### Name
*Sihuhu* is the Hungarian term for the sound of the train (like *choo-choo* in English).

### Developers
The project was developed by the **R&D** (or *RnD*) team. The members of the team are the following.

- Rebeka FARKAS, responsible for creating and managing the behavioral model.
- Richárd PALINCZA, responsible for simulation.
- Dániel STEIN, responsible for the structural model and some features.

Also it is important to mention Professor Dániel VARRÓ, Csaba DEBRECENI and András Szabolcs NAGY who all provided a lot of help.

### Purpose
The goal was to create a modeling language and a simulation tool for modeling and analyzing railway systems. We restricted the scope and decided to create tools only for railway models.

### Main Tools and Features
- Metamodels for both the structural and behavioral models of a railway models, completed with IncQuery patterns to check well-formedness.
- Editors for creating and modifying both kinds of models.
- A simulation framework to simulate a model that includes generating a behavioral model based on the structural one and using it for event-handling. The simulation is integrated with the editor, so the events can be visualized.
- The system also provides safety; the signals of the railway are maintained so that no accident can occur.

## The Structural Model
This part presents the syntactics and the semantics used to represent a railway model,  and a quick guide to use the editor.

### The Metamodel
[Kép] !!!

The figure shows the structural metamodel. The root of the containment hierarchy is the so-called `World` element that can be regarded as a room containing lots of model railways, that are fix, but the trains can be moved between them.

A `Track` represents a railway, that consists of different types of `TrackElement`s. A `TrackElement` is either a `Rail` or a `Switch`.
- A `Rail` represents a simple segment of the `Track`, on which the train can move smoothly.
- Each rail has a `Signal` on both ends, indicating whether the train on that segment can move forward in that direction. (Thus, a rail's signal controls entering the *next* segment.)
- `Rail`s are connected by `Switch`es. `Switch`es are usual switches, that are used to change which segments are reachable from  a certain segment.
 - The different positions of a switch are called `SwitchConnection`s, and they are also `Rail`s (inheritance).

#### Constraints

 - The train can be on multiple `TrackElement`s, but only one train can occupy a track element at a time. To determine the train's direction, the `nextElement` property indicates the next track element the train will try to occupy.
 - All rails have a `to` and a `from` neighbor track element, but the trains can go both ways on them, and any of them can mean any side. The signals, however must conform to these names, so a rail's `fromSignal` must control entry to the `from` neighbor of the rail. The signals also have a property indicating which rail they guard.
 - Switches have multiple switch connections of witch at most one is active (this could be changed, but why complicate it even more).
 - The signals' color, next rail and the switches connected rails are derived. This is made via IncQuery patterns.

Well-formedness constraints include the following. (Mostly trivial constraints.)

   - `SwitchConnection` must be part of a `Switch`
   - A `Switch`'s active connection must be part of that switch.
   - A `Train` can't be on an inactive `SwitchConnection`.
   - A `Rail`'s neighbor can't be a `SwitchConnection` (in that case it has to be the `Switch`).
   - If a `Rail`'s neighbor is another `Rail`, then the first rail is neighbor to that rail. (This works on other elements, too.)
   - A `Track` must be connected (every `Rail` is reachable with some switch positioning).
   - If a `Train` occupies multiple track elements, then those are next to each other.
   - A `Train`'s next element must be a neighbor of one of elements it's currently occupying.


### Creating an Instance Model
When creating the model of a real railway (or railway model), the upper descriptions describe how to model the different real world objects. An interesting question can be the granularity (how many connected rails to use for modeling a long straight rail). *Remember: There are signals at both ends of every rail.*

A minor difficulty might occur when designing complex switches.  The solution is to collect all possible scenarios like "a train might get from A rail to B rail", and map each of these to switch connections.

#### Editor
To create and modify the structural model, the framework provides a graphical editor created with Sirius. It is special in a way, that it consists of two views: one to create and modify the model and an other that correctly represents the real structure of it. This way it is possible to efficiently create models.

#### Example
As a simple example we have created our own little railway model. The following pictures show what it's real structure looks like, how it is turned into a model and how it looks in the editor.

[1. kép - ppt-ben szereplő model
2. kép - tree view
3.  kép - editor] !!!

For a more complex model we have created a model of the department's railway model. It also contains a double slip switch, and a dead end as well.

[Kép] !!!

## The Behavioral Model
This part describes the behavior model we designed to control the railway model's behavior.

### The Metamodel
The following figure shows the behavior model's metamodel.

[Kép] !!!

The behavior model is a simple state-transition system, except every component has its own state graph to describe its behavior. This behavior can depend on another component's state.

In the metamodel `System` and `Component` is as discussed. A `Component` has different states—of which one is the current state—, and `Transitions` between them. A `Transition` transitions from a state to another (or the same) one. This statechange is triggered by an `Event`, but only if the `Guards` allow it, and may generate a new event. Events are simple object described  in the system. An event may trigger multiple transitions but transitions can only generate one event. A guard is a simple reference to a state of another component and the component can transition into its next state only if the guard states are active - i.e. they are the current state of their container components.

Well-formedness constraints are very obvious  - constraints like  the guard must be another component's event, etc.

### The Editor
There is a textual editor for describing a behavioral model using the language created with Xtext. The language is rather simple. Starting with
```
System mySystemName {
```

first you describe events, like
```
Event myEventName;
```

then components, in a similar way as you described the system. You start with
```
Component myComponentName {
```

first you describe states like
```
State myStateName;
```

then you chose the initial (current) state by entering a star and repeating the state's name, like
```
*myInitialStateName
```

then you can describe transitions, like
```
Transition myTransitionName: fromStateName -> toStateName on onEventName guard: guardEventName generates generatedEventName;
```

*Note: you can add more guard events, but you have to put the keyword in plural (```guards:```). Don't forget the closing brackets!*

### The Handler
For generating and managing the behavior model we have created a handler class with static functions to call when needed. This is how we generate the behavior model from the structural and manage it during the simulation.

#### Structural to Behavioral Model Transformation
Generating the behavioral model from the structural is actually a model transformation.

- For every `Rail` a component is generated, with *free* and *occupied* states, and transitions between.
- For every `SwitchConnection` *nonexistent* state is also generated. The nonexistent state is only reachable from the off state, and vice versa.
- For every `Switch` a component is generated with as many states as many connections it has, and one more (off state). Many transitions are defined in between, all with the proper guards and actions.
-  For every `Signal` a component is generated with a green and red state that behave properly.

The events can be the following.

 - A `Train` arrives/leaves a track element - the track element should be referred by ID, but the train doesn't have to.
 - A `Switch` is switched - both the switch and the position should be referred.
 - Inner  generated events - e.g. if a *trainToRail1* event occurs, Rail1's component can transition from free to occupied generating a *rail1Occupied* event that triggers transitions that set the appropriate signals to red.

If a train enters or leaves a simple rail, the generated event sequence can easily executed. But if a switch is involved, it becomes more difficult to decide what should happen. This is why the switch component gets the events from the outside and the appropriate transitions generate the inner events that execute the changes in the switch connections, signals, etc.

#### Event Processing
There is an event handling function that can transition the behavior model to the next stable state. It identifies the event, executes it, collects the generated events, executes them, etc. It has a boolean return value indicating whether the event was valid (if there is no corresponding event or no transitions to trigger in this state of the system, it will return false).

## Simulation
This part shows how the simulation of the railway system is parametrized and executed.

### The Simulation Framework
The simulation is done by parametrization of a DESMO-J (a Java based, Discrete Event Simulation framework) simulation with a structural and a dynamic model.

A simulation can be started with initializing a `SihuhuSimulationModel` with the desired structural and dynamic model. If there is no given dynamic model, a default can be generated with the above mentioned Structural to Dynamic transformation.

The simulation is done by creating (DESMO-J) events triggering each other later on. There are 1+3 main type of events:

- `RandomTrainEvent`:
Sheduled by the system periodically on a random train. Its purpose is to try to move the train in its direction.
Depending on the Train's current state (how many segments is it in & what is the next element) it generates one of
the following 3 event types.

- `TrainInEvent`:
It happens when a train is in only 1 segment and it goes to the next one (which is a Switch or a Rail).
The Event asks the Dynamic model (using the handler) to update the state according to the Train's movement. It also updates the structural model.

- `TrainOutEvent`:
This event is generated when a train is on multiple segments and then it leaves the one which was least recently visited. It works similarly to TrainInEvent.

- `ChangeSwitchEvent`:
This happens when a train arrives to a Switch and scheduled to step on it. It switches the switch to a random direction connected to the trains current element.
It also updates the dynamic model (with handlers) and schedules a `TrainInEvent` to the (already switched) switch.

Each of the last 3 events come in two "flavors": one is when a train is scheduled to do something, the another is when it is successfully done.
When trying, the `Try...Event` is scheduled and it checks for the conditions of the transition (eg. are the signals free). If the transition can be fired successfully it fires a "Trace...Event" which is used for DESMO-J reporting and creating statistics of the actual events.

### Additional Features
We have also added extra features to make the simulation visible in the Sirius editor. By defining an extension point in the structural editor, any extension can be connected to the currently edited model. By a push of a button, the connected extension gets the loaded instance model as a Resource, that can be modified outside of the editor.

When running the simulation from the editor there are extra (real time) waits in the simulation to see the trains moving with observable speed.

To be able to update the (structural) model while using it in the editor as well we had to make all modifications in EMF transactions with RecordingCommands.
This also made possible to have undo-redo support so the simulation steps could be undoed/redoed from the editor (with a 20 step limit).

