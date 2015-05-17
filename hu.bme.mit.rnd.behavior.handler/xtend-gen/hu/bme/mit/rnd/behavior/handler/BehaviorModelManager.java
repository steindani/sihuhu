package hu.bme.mit.rnd.behavior.handler;

import Behavior.BehaviorFactory;
import Behavior.Component;
import Behavior.Event;
import Behavior.State;
import Behavior.Transition;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import sihuhu.Rail;
import sihuhu.Signal;
import sihuhu.Switch;
import sihuhu.SwitchConnection;
import sihuhu.Track;
import sihuhu.TrackElement;
import sihuhu.Train;
import sihuhu.World;

@SuppressWarnings("all")
public class BehaviorModelManager {
  @Extension
  private static BehaviorFactory factory = BehaviorFactory.eINSTANCE;
  
  public static Behavior.System getBehaviorModel(final World world) {
    Behavior.System sys = BehaviorModelManager.factory.createSystem();
    ArrayList<Rail> allRails = new ArrayList<Rail>();
    ArrayList<Switch> allSwitches = new ArrayList<Switch>();
    EList<Track> _tracks = world.getTracks();
    for (final Track t : _tracks) {
      {
        EList<Rail> _rails = t.getRails();
        allRails.addAll(_rails);
        EList<Switch> _switches = t.getSwitches();
        allSwitches.addAll(_switches);
      }
    }
    for (final Rail r : allRails) {
      {
        final Event e1 = BehaviorModelManager.factory.createEvent();
        String _name = r.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        String _plus = ("trainIn" + _firstUpper);
        e1.setName(_plus);
        EList<Event> _events = sys.getEvents();
        _events.add(e1);
        final Event e2 = BehaviorModelManager.factory.createEvent();
        String _name_1 = r.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        String _plus_1 = ("trainOut" + _firstUpper_1);
        e2.setName(_plus_1);
        EList<Event> _events_1 = sys.getEvents();
        _events_1.add(e2);
        final Event e3 = BehaviorModelManager.factory.createEvent();
        String _name_2 = r.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
        String _plus_2 = ("railOccupied" + _firstUpper_2);
        e3.setName(_plus_2);
        EList<Event> _events_2 = sys.getEvents();
        _events_2.add(e3);
        final Event e4 = BehaviorModelManager.factory.createEvent();
        String _name_3 = r.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
        String _plus_3 = ("railFree" + _firstUpper_3);
        e4.setName(_plus_3);
        EList<Event> _events_3 = sys.getEvents();
        _events_3.add(e4);
        final Component c = BehaviorModelManager.factory.createComponent();
        String _name_4 = r.getName();
        String _firstUpper_4 = StringExtensions.toFirstUpper(_name_4);
        String _plus_4 = ("rail" + _firstUpper_4);
        c.setName(_plus_4);
        EList<Component> _components = sys.getComponents();
        _components.add(c);
        final State occState = BehaviorModelManager.factory.createState();
        String _name_5 = c.getName();
        String _plus_5 = (_name_5 + "Occupied");
        occState.setName(_plus_5);
        EList<State> _states = c.getStates();
        _states.add(occState);
        final State freeState = BehaviorModelManager.factory.createState();
        String _name_6 = c.getName();
        String _plus_6 = (_name_6 + "Free");
        freeState.setName(_plus_6);
        EList<State> _states_1 = c.getStates();
        _states_1.add(freeState);
        Train _train = r.getTrain();
        boolean _equals = Objects.equal(_train, null);
        if (_equals) {
          c.setCurrentState(freeState);
        } else {
          c.setCurrentState(occState);
        }
        final Transition t1 = BehaviorModelManager.factory.createTransition();
        EList<Transition> _transitions = c.getTransitions();
        _transitions.add(t1);
        t1.setName("trainComesIn");
        t1.setFromState(freeState);
        t1.setToState(occState);
        t1.setTriggeringEvent(e1);
        t1.setGeneratedEvent(e3);
        final Transition t2 = BehaviorModelManager.factory.createTransition();
        EList<Transition> _transitions_1 = c.getTransitions();
        _transitions_1.add(t2);
        t2.setName("trainGoesOut");
        t2.setFromState(occState);
        t2.setToState(freeState);
        t2.setTriggeringEvent(e2);
        t2.setGeneratedEvent(e4);
      }
    }
    for (final Switch s : allSwitches) {
      {
        final Event e1 = BehaviorModelManager.factory.createEvent();
        String _name = s.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        String _plus = ("trainIn" + _firstUpper);
        e1.setName(_plus);
        EList<Event> _events = sys.getEvents();
        _events.add(e1);
        final Event e2 = BehaviorModelManager.factory.createEvent();
        String _name_1 = s.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        String _plus_1 = ("trainOut" + _firstUpper_1);
        e2.setName(_plus_1);
        EList<Event> _events_1 = sys.getEvents();
        _events_1.add(e2);
        final Event e6 = BehaviorModelManager.factory.createEvent();
        String _name_2 = s.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
        String _plus_2 = ("switch" + _firstUpper_2);
        String _plus_3 = (_plus_2 + "Off");
        e6.setName(_plus_3);
        EList<Event> _events_2 = sys.getEvents();
        _events_2.add(e6);
        final HashMap<SwitchConnection, Component> scToCmp = new HashMap<SwitchConnection, Component>();
        EList<SwitchConnection> _connections = s.getConnections();
        for (final SwitchConnection sc : _connections) {
          {
            final Event e3 = BehaviorModelManager.factory.createEvent();
            String _name_3 = sc.getName();
            String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
            String _plus_4 = ("railOccupied" + _firstUpper_3);
            e3.setName(_plus_4);
            EList<Event> _events_3 = sys.getEvents();
            _events_3.add(e3);
            final Event e4 = BehaviorModelManager.factory.createEvent();
            String _name_4 = sc.getName();
            String _firstUpper_4 = StringExtensions.toFirstUpper(_name_4);
            String _plus_5 = ("railFree" + _firstUpper_4);
            e4.setName(_plus_5);
            EList<Event> _events_4 = sys.getEvents();
            _events_4.add(e4);
            final Event e5 = BehaviorModelManager.factory.createEvent();
            String _name_5 = s.getName();
            String _firstUpper_5 = StringExtensions.toFirstUpper(_name_5);
            String _plus_6 = ("switch" + _firstUpper_5);
            String _name_6 = sc.getName();
            String _firstUpper_6 = StringExtensions.toFirstUpper(_name_6);
            String _plus_7 = (_plus_6 + _firstUpper_6);
            e5.setName(_plus_7);
            EList<Event> _events_5 = sys.getEvents();
            _events_5.add(e5);
            final Component c = BehaviorModelManager.factory.createComponent();
            scToCmp.put(sc, c);
            String _name_7 = sc.getName();
            String _plus_8 = ("rail" + _name_7);
            c.setName(_plus_8);
            EList<Component> _components = sys.getComponents();
            _components.add(c);
            final State occState = BehaviorModelManager.factory.createState();
            String _name_8 = c.getName();
            String _plus_9 = (_name_8 + "Occupied");
            occState.setName(_plus_9);
            EList<State> _states = c.getStates();
            _states.add(occState);
            final State freeState = BehaviorModelManager.factory.createState();
            String _name_9 = c.getName();
            String _plus_10 = (_name_9 + "Free");
            freeState.setName(_plus_10);
            EList<State> _states_1 = c.getStates();
            _states_1.add(freeState);
            final State neState = BehaviorModelManager.factory.createState();
            String _name_10 = c.getName();
            String _plus_11 = (_name_10 + "NonEx");
            neState.setName(_plus_11);
            EList<State> _states_2 = c.getStates();
            _states_2.add(neState);
            c.setCurrentState(neState);
            final Transition t1 = BehaviorModelManager.factory.createTransition();
            EList<Transition> _transitions = c.getTransitions();
            _transitions.add(t1);
            t1.setName("trainComesIn");
            t1.setFromState(freeState);
            t1.setToState(occState);
            t1.setTriggeringEvent(e1);
            t1.setGeneratedEvent(e3);
            final Transition t2 = BehaviorModelManager.factory.createTransition();
            EList<Transition> _transitions_1 = c.getTransitions();
            _transitions_1.add(t2);
            t2.setName("trainGoesOut");
            t2.setFromState(occState);
            t2.setToState(freeState);
            t2.setTriggeringEvent(e2);
            t2.setGeneratedEvent(e4);
            final Transition t3 = BehaviorModelManager.factory.createTransition();
            EList<Transition> _transitions_2 = c.getTransitions();
            _transitions_2.add(t3);
            t3.setName("switchOff");
            t2.setFromState(freeState);
            t2.setToState(neState);
            t2.setTriggeringEvent(e6);
          }
        }
        EList<SwitchConnection> _connections_1 = s.getConnections();
        for (final SwitchConnection sc_1 : _connections_1) {
          EList<SwitchConnection> _connections_2 = s.getConnections();
          for (final SwitchConnection conn : _connections_2) {
            {
              final Component c = scToCmp.get(sc_1);
              final Transition t_1 = BehaviorModelManager.factory.createTransition();
              EList<Transition> _transitions = c.getTransitions();
              _transitions.add(t_1);
              String _name_3 = conn.getName();
              String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
              String _plus_4 = ("switchTo" + _firstUpper_3);
              t_1.setName(_plus_4);
              EList<State> _states = c.getStates();
              final Function1<State, Boolean> _function = new Function1<State, Boolean>() {
                public Boolean apply(final State it) {
                  String _name = it.getName();
                  String _name_1 = c.getName();
                  String _plus = (_name_1 + "NonEx");
                  return Boolean.valueOf(_name.equals(_plus));
                }
              };
              Iterable<State> _filter = IterableExtensions.<State>filter(_states, _function);
              final State neState = ((State[])Conversions.unwrapArray(_filter, State.class))[0];
              EList<State> _states_1 = c.getStates();
              final Function1<State, Boolean> _function_1 = new Function1<State, Boolean>() {
                public Boolean apply(final State it) {
                  String _name = it.getName();
                  String _name_1 = c.getName();
                  String _plus = (_name_1 + "Free");
                  return Boolean.valueOf(_name.equals(_plus));
                }
              };
              Iterable<State> _filter_1 = IterableExtensions.<State>filter(_states_1, _function_1);
              final State freeState = ((State[])Conversions.unwrapArray(_filter_1, State.class))[0];
              boolean _equals = Objects.equal(sc_1, conn);
              if (_equals) {
                t_1.setFromState(neState);
                t_1.setToState(freeState);
              } else {
                t_1.setFromState(freeState);
                t_1.setToState(neState);
              }
            }
          }
        }
      }
    }
    for (final Switch s_1 : allSwitches) {
      EList<SwitchConnection> _connections = s_1.getConnections();
      allRails.addAll(_connections);
    }
    for (final Rail r_1 : allRails) {
      {
        final Component c = BehaviorModelManager.factory.createComponent();
        String _name = r_1.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        String _plus = ("signal" + _firstUpper);
        String _plus_1 = (_plus + "To");
        TrackElement _from = r_1.getFrom();
        String _name_1 = _from.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        String _plus_2 = (_plus_1 + _firstUpper_1);
        c.setName(_plus_2);
        EList<Component> _components = sys.getComponents();
        _components.add(c);
        final State greenState = BehaviorModelManager.factory.createState();
        final State redState = BehaviorModelManager.factory.createState();
        EList<State> _states = c.getStates();
        _states.add(greenState);
        EList<State> _states_1 = c.getStates();
        _states_1.add(redState);
        Signal _allowedFrom = r_1.getAllowedFrom();
        boolean _isEnabled = _allowedFrom.isEnabled();
        if (_isEnabled) {
          c.setCurrentState(greenState);
        } else {
          c.setCurrentState(redState);
        }
        TrackElement _from_1 = r_1.getFrom();
        if ((_from_1 instanceof Switch)) {
          TrackElement _from_2 = r_1.getFrom();
          final Switch sw = ((Switch) _from_2);
          final Transition toff = BehaviorModelManager.factory.createTransition();
          EList<Transition> _transitions = c.getTransitions();
          _transitions.add(toff);
          String _name_2 = sw.getName();
          String _plus_3 = (_name_2 + "Off");
          toff.setName(_plus_3);
          toff.setFromState(greenState);
          toff.setToState(redState);
          EList<Event> _events = sys.getEvents();
          final Function1<Event, Boolean> _function = new Function1<Event, Boolean>() {
            public Boolean apply(final Event it) {
              String _name = it.getName();
              String _name_1 = sw.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_1);
              String _plus = ("switch" + _firstUpper);
              String _plus_1 = (_plus + "Off");
              return Boolean.valueOf(_name.equals(_plus_1));
            }
          };
          Iterable<Event> _filter = IterableExtensions.<Event>filter(_events, _function);
          Event _get = ((Event[])Conversions.unwrapArray(_filter, Event.class))[0];
          toff.setTriggeringEvent(_get);
          EList<SwitchConnection> _connections_1 = sw.getConnections();
          for (final SwitchConnection sc : _connections_1) {
            boolean _or = false;
            TrackElement _from_3 = sc.getFrom();
            boolean _equals = Objects.equal(_from_3, r_1);
            if (_equals) {
              _or = true;
            } else {
              TrackElement _to = sc.getTo();
              boolean _equals_1 = Objects.equal(_to, r_1);
              _or = _equals_1;
            }
            if (_or) {
              final Transition tocc = BehaviorModelManager.factory.createTransition();
              EList<Transition> _transitions_1 = c.getTransitions();
              _transitions_1.add(tocc);
              String _name_3 = sc.getName();
              String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
              String _plus_4 = ("trainComesIn" + _firstUpper_2);
              tocc.setName(_plus_4);
              tocc.setFromState(greenState);
              tocc.setToState(redState);
              EList<Event> _events_1 = sys.getEvents();
              final Function1<Event, Boolean> _function_1 = new Function1<Event, Boolean>() {
                public Boolean apply(final Event it) {
                  String _name = it.getName();
                  String _name_1 = sc.getName();
                  String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                  String _plus = ("railOccupied" + _firstUpper);
                  return Boolean.valueOf(_name.equals(_plus));
                }
              };
              Iterable<Event> _filter_1 = IterableExtensions.<Event>filter(_events_1, _function_1);
              Event _get_1 = ((Event[])Conversions.unwrapArray(_filter_1, Event.class))[0];
              tocc.setTriggeringEvent(_get_1);
              final Transition tfree = BehaviorModelManager.factory.createTransition();
              EList<Transition> _transitions_2 = c.getTransitions();
              _transitions_2.add(tfree);
              String _name_4 = sc.getName();
              String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
              String _plus_5 = ("trainGoesOut" + _firstUpper_3);
              tfree.setName(_plus_5);
              tocc.setFromState(redState);
              tocc.setToState(greenState);
              EList<Event> _events_2 = sys.getEvents();
              final Function1<Event, Boolean> _function_2 = new Function1<Event, Boolean>() {
                public Boolean apply(final Event it) {
                  String _name = it.getName();
                  String _name_1 = sc.getName();
                  String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                  String _plus = ("railFreed" + _firstUpper);
                  return Boolean.valueOf(_name.equals(_plus));
                }
              };
              Iterable<Event> _filter_2 = IterableExtensions.<Event>filter(_events_2, _function_2);
              Event _get_2 = ((Event[])Conversions.unwrapArray(_filter_2, Event.class))[0];
              tocc.setTriggeringEvent(_get_2);
              final Transition tsw = BehaviorModelManager.factory.createTransition();
              EList<Transition> _transitions_3 = c.getTransitions();
              _transitions_3.add(tsw);
              String _name_5 = sc.getName();
              String _firstUpper_4 = StringExtensions.toFirstUpper(_name_5);
              String _plus_6 = ("switchTo" + _firstUpper_4);
              tsw.setName(_plus_6);
              tsw.setFromState(redState);
              tsw.setToState(greenState);
              EList<Event> _events_3 = sys.getEvents();
              final Function1<Event, Boolean> _function_3 = new Function1<Event, Boolean>() {
                public Boolean apply(final Event it) {
                  String _name = it.getName();
                  String _name_1 = sw.getName();
                  String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                  String _plus = ("switch" + _firstUpper);
                  String _name_2 = sc.getName();
                  String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
                  String _plus_1 = (_plus + _firstUpper_1);
                  return Boolean.valueOf(_name.equals(_plus_1));
                }
              };
              Iterable<Event> _filter_3 = IterableExtensions.<Event>filter(_events_3, _function_3);
              Event _get_3 = ((Event[])Conversions.unwrapArray(_filter_3, Event.class))[0];
              tsw.setTriggeringEvent(_get_3);
            } else {
              final Transition tsw_1 = BehaviorModelManager.factory.createTransition();
              EList<Transition> _transitions_4 = c.getTransitions();
              _transitions_4.add(tsw_1);
              String _name_6 = sc.getName();
              String _firstUpper_5 = StringExtensions.toFirstUpper(_name_6);
              String _plus_7 = ("switchTo" + _firstUpper_5);
              tsw_1.setName(_plus_7);
              tsw_1.setFromState(greenState);
              tsw_1.setToState(redState);
              EList<Event> _events_4 = sys.getEvents();
              final Function1<Event, Boolean> _function_4 = new Function1<Event, Boolean>() {
                public Boolean apply(final Event it) {
                  String _name = it.getName();
                  String _name_1 = sw.getName();
                  String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                  String _plus = ("switch" + _firstUpper);
                  String _name_2 = sc.getName();
                  String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
                  String _plus_1 = (_plus + _firstUpper_1);
                  return Boolean.valueOf(_name.equals(_plus_1));
                }
              };
              Iterable<Event> _filter_4 = IterableExtensions.<Event>filter(_events_4, _function_4);
              Event _get_4 = ((Event[])Conversions.unwrapArray(_filter_4, Event.class))[0];
              tsw_1.setTriggeringEvent(_get_4);
            }
          }
        } else {
          TrackElement _from_4 = r_1.getFrom();
          final Rail rail = ((Rail) _from_4);
          final Transition tocc_1 = BehaviorModelManager.factory.createTransition();
          EList<Transition> _transitions_5 = c.getTransitions();
          _transitions_5.add(tocc_1);
          String _name_7 = rail.getName();
          String _firstUpper_6 = StringExtensions.toFirstUpper(_name_7);
          String _plus_8 = ("trainComesIn" + _firstUpper_6);
          tocc_1.setName(_plus_8);
          tocc_1.setFromState(greenState);
          tocc_1.setToState(redState);
          EList<Event> _events_5 = sys.getEvents();
          final Function1<Event, Boolean> _function_5 = new Function1<Event, Boolean>() {
            public Boolean apply(final Event it) {
              String _name = it.getName();
              String _name_1 = rail.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_1);
              String _plus = ("railOccupied" + _firstUpper);
              return Boolean.valueOf(_name.equals(_plus));
            }
          };
          Iterable<Event> _filter_5 = IterableExtensions.<Event>filter(_events_5, _function_5);
          Event _get_5 = ((Event[])Conversions.unwrapArray(_filter_5, Event.class))[0];
          tocc_1.setTriggeringEvent(_get_5);
          final Transition tfree_1 = BehaviorModelManager.factory.createTransition();
          EList<Transition> _transitions_6 = c.getTransitions();
          _transitions_6.add(tfree_1);
          String _name_8 = rail.getName();
          String _firstUpper_7 = StringExtensions.toFirstUpper(_name_8);
          String _plus_9 = ("trainGoesOut" + _firstUpper_7);
          tfree_1.setName(_plus_9);
          tocc_1.setFromState(redState);
          tocc_1.setToState(greenState);
          EList<Event> _events_6 = sys.getEvents();
          final Function1<Event, Boolean> _function_6 = new Function1<Event, Boolean>() {
            public Boolean apply(final Event it) {
              String _name = it.getName();
              String _name_1 = rail.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_1);
              String _plus = ("railFreed" + _firstUpper);
              return Boolean.valueOf(_name.equals(_plus));
            }
          };
          Iterable<Event> _filter_6 = IterableExtensions.<Event>filter(_events_6, _function_6);
          Event _get_6 = ((Event[])Conversions.unwrapArray(_filter_6, Event.class))[0];
          tocc_1.setTriggeringEvent(_get_6);
        }
      }
    }
    return sys;
  }
}
