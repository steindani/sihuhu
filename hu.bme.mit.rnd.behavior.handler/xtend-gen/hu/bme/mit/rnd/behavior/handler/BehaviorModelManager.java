package hu.bme.mit.rnd.behavior.handler;

import Behavior.BehaviorFactory;
import Behavior.Component;
import Behavior.Event;
import Behavior.State;
import Behavior.Transition;
import com.google.common.base.Objects;
import hu.bme.mit.rnd.sihuhu.sihuhu.Rail;
import hu.bme.mit.rnd.sihuhu.sihuhu.Signal;
import hu.bme.mit.rnd.sihuhu.sihuhu.Switch;
import hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection;
import hu.bme.mit.rnd.sihuhu.sihuhu.Track;
import hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement;
import hu.bme.mit.rnd.sihuhu.sihuhu.Train;
import hu.bme.mit.rnd.sihuhu.sihuhu.World;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
    final HashMap<Rail, Event> rToRoe = new HashMap<Rail, Event>();
    final HashMap<Rail, Event> rToRfe = new HashMap<Rail, Event>();
    for (final Rail r : allRails) {
      {
        final Event tie = BehaviorModelManager.createTrainInEvent(r);
        EList<Event> _events = sys.getEvents();
        _events.add(tie);
        final Event toe = BehaviorModelManager.createTrainOutEvent(r);
        EList<Event> _events_1 = sys.getEvents();
        _events_1.add(toe);
        final Event roe = BehaviorModelManager.createRailOccupiedEvent(r);
        EList<Event> _events_2 = sys.getEvents();
        _events_2.add(roe);
        rToRoe.put(r, roe);
        final Event rfe = BehaviorModelManager.createRailFreedEvent(r);
        EList<Event> _events_3 = sys.getEvents();
        _events_3.add(rfe);
        rToRfe.put(r, rfe);
        final Component c = BehaviorModelManager.createComponent(r);
        EList<Component> _components = sys.getComponents();
        _components.add(c);
        EList<State> _states = c.getStates();
        State _get = _states.get(1);
        EList<State> _states_1 = c.getStates();
        State _get_1 = _states_1.get(0);
        final Transition tcit = BehaviorModelManager.createTransition("trainComesIn", _get, _get_1, tie, roe);
        EList<Transition> _transitions = c.getTransitions();
        _transitions.add(tcit);
        EList<State> _states_2 = c.getStates();
        State _get_2 = _states_2.get(0);
        EList<State> _states_3 = c.getStates();
        State _get_3 = _states_3.get(1);
        final Transition tgot = BehaviorModelManager.createTransition("trainGoesOut", _get_2, _get_3, toe, rfe);
        EList<Transition> _transitions_1 = c.getTransitions();
        _transitions_1.add(tgot);
      }
    }
    final HashMap<Switch, Event> sToOff = new HashMap<Switch, Event>();
    final HashMap<Switch, HashMap<SwitchConnection, Event>> sToEvt = new HashMap<Switch, HashMap<SwitchConnection, Event>>();
    final HashMap<SwitchConnection, Event> scToRfe = new HashMap<SwitchConnection, Event>();
    final HashMap<SwitchConnection, Event> scToRoe = new HashMap<SwitchConnection, Event>();
    for (final Switch s : allSwitches) {
      {
        final Event tie = BehaviorModelManager.createTrainInEvent(s);
        EList<Event> _events = sys.getEvents();
        _events.add(tie);
        final Event toe = BehaviorModelManager.createTrainOutEvent(s);
        EList<Event> _events_1 = sys.getEvents();
        _events_1.add(toe);
        final Event soe = BehaviorModelManager.factory.createEvent();
        String _name = s.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        String _plus = ("switch" + _firstUpper);
        String _plus_1 = (_plus + "Off");
        soe.setName(_plus_1);
        EList<Event> _events_2 = sys.getEvents();
        _events_2.add(soe);
        sToOff.put(s, soe);
        final Event tsoe = BehaviorModelManager.factory.createEvent();
        String _name_1 = s.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        String _plus_2 = ("trySwitch" + _firstUpper_1);
        String _plus_3 = (_plus_2 + "Off");
        tsoe.setName(_plus_3);
        EList<Event> _events_3 = sys.getEvents();
        _events_3.add(tsoe);
        final Component sComp = BehaviorModelManager.createComponent(s);
        EList<Component> _components = sys.getComponents();
        _components.add(sComp);
        final HashMap<SwitchConnection, State> scToState = new HashMap<SwitchConnection, State>();
        EList<SwitchConnection> _connections = s.getConnections();
        for (final SwitchConnection sc : _connections) {
          {
            String _name_2 = sc.getName();
            final State scState = BehaviorModelManager.createState(s, _name_2);
            EList<State> _states = sComp.getStates();
            _states.add(scState);
            scToState.put(sc, scState);
            SwitchConnection _activeConnection = s.getActiveConnection();
            boolean _equals = Objects.equal(_activeConnection, sc);
            if (_equals) {
              sComp.setCurrentState(scState);
            }
          }
        }
        final State offState = BehaviorModelManager.createState(s, "Off");
        EList<State> _states = sComp.getStates();
        _states.add(offState);
        SwitchConnection _activeConnection = s.getActiveConnection();
        boolean _equals = Objects.equal(_activeConnection, null);
        if (_equals) {
          sComp.setCurrentState(offState);
        }
        final HashMap<SwitchConnection, Event> scToEvt = new HashMap<SwitchConnection, Event>();
        final HashMap<SwitchConnection, Event> scToTry = new HashMap<SwitchConnection, Event>();
        EList<SwitchConnection> _connections_1 = s.getConnections();
        for (final SwitchConnection sc_1 : _connections_1) {
          {
            final Event stce = BehaviorModelManager.factory.createEvent();
            String _name_2 = s.getName();
            String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
            String _plus_4 = ("switch" + _firstUpper_2);
            String _plus_5 = (_plus_4 + "To");
            String _name_3 = sc_1.getName();
            String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
            String _plus_6 = (_plus_5 + _firstUpper_3);
            stce.setName(_plus_6);
            EList<Event> _events_4 = sys.getEvents();
            _events_4.add(stce);
            scToEvt.put(sc_1, stce);
            final Event tse = BehaviorModelManager.factory.createEvent();
            String _name_4 = s.getName();
            String _firstUpper_4 = StringExtensions.toFirstUpper(_name_4);
            String _plus_7 = ("trySwitch" + _firstUpper_4);
            String _plus_8 = (_plus_7 + "To");
            String _name_5 = sc_1.getName();
            String _firstUpper_5 = StringExtensions.toFirstUpper(_name_5);
            String _plus_9 = (_plus_8 + _firstUpper_5);
            tse.setName(_plus_9);
            scToTry.put(sc_1, tse);
          }
        }
        sToEvt.put(s, scToEvt);
        final HashMap<SwitchConnection, Component> scToComp = new HashMap<SwitchConnection, Component>();
        final HashMap<SwitchConnection, State> scToFreeState = new HashMap<SwitchConnection, State>();
        final HashMap<SwitchConnection, State> scToOccState = new HashMap<SwitchConnection, State>();
        final HashMap<SwitchConnection, State> scToNeState = new HashMap<SwitchConnection, State>();
        EList<SwitchConnection> _connections_2 = s.getConnections();
        for (final SwitchConnection sc_2 : _connections_2) {
          {
            final Component c = BehaviorModelManager.createComponent(sc_2);
            EList<Component> _components_1 = sys.getComponents();
            _components_1.add(c);
            scToComp.put(sc_2, c);
            final State occState = BehaviorModelManager.createState(sc_2, "Occupied");
            EList<State> _states_1 = c.getStates();
            _states_1.add(occState);
            scToOccState.put(sc_2, occState);
            final State freeState = BehaviorModelManager.createState(sc_2, "Free");
            EList<State> _states_2 = c.getStates();
            _states_2.add(freeState);
            scToFreeState.put(sc_2, freeState);
            final State neState = BehaviorModelManager.createState(sc_2, "NonExistent");
            EList<State> _states_3 = c.getStates();
            _states_3.add(neState);
            scToNeState.put(sc_2, neState);
            EObject _eContainer = sc_2.eContainer();
            SwitchConnection _activeConnection_1 = ((Switch) _eContainer).getActiveConnection();
            boolean _equals_1 = Objects.equal(_activeConnection_1, sc_2);
            if (_equals_1) {
              Train _train = sc_2.getTrain();
              boolean _equals_2 = Objects.equal(_train, null);
              if (_equals_2) {
                c.setCurrentState(freeState);
              } else {
                c.setCurrentState(occState);
              }
            } else {
              c.setCurrentState(neState);
            }
          }
        }
        EList<SwitchConnection> _connections_3 = s.getConnections();
        for (final SwitchConnection sc_3 : _connections_3) {
          {
            String _name_2 = sc_3.getName();
            String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
            String _plus_4 = ("switchOnTo" + _firstUpper_2);
            State _get = scToState.get(sc_3);
            Event _get_1 = scToTry.get(sc_3);
            Event _get_2 = scToEvt.get(sc_3);
            final Transition ton = BehaviorModelManager.createTransition(_plus_4, offState, _get, _get_1, _get_2);
            EList<Transition> _transitions = sComp.getTransitions();
            _transitions.add(ton);
            String _name_3 = sc_3.getName();
            String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
            String _plus_5 = ("switchOffFrom" + _firstUpper_3);
            State _get_3 = scToState.get(sc_3);
            final Transition toff = BehaviorModelManager.createTransition(_plus_5, _get_3, offState, tsoe, soe);
            EList<Transition> _transitions_1 = sComp.getTransitions();
            _transitions_1.add(toff);
            EList<State> _guardStates = toff.getGuardStates();
            State _get_4 = scToFreeState.get(sc_3);
            _guardStates.add(_get_4);
          }
        }
        EList<SwitchConnection> _connections_4 = s.getConnections();
        for (final SwitchConnection from : _connections_4) {
          EList<SwitchConnection> _connections_5 = s.getConnections();
          for (final SwitchConnection to : _connections_5) {
            {
              String _name_2 = from.getName();
              String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
              String _plus_4 = ("from" + _firstUpper_2);
              String _plus_5 = (_plus_4 + "To");
              String _name_3 = to.getName();
              String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
              String _plus_6 = (_plus_5 + _firstUpper_3);
              State _get = scToState.get(from);
              State _get_1 = scToState.get(to);
              Event _get_2 = scToTry.get(to);
              Event _get_3 = scToEvt.get(to);
              final Transition t_1 = BehaviorModelManager.createTransition(_plus_6, _get, _get_1, _get_2, _get_3);
              EList<Transition> _transitions = sComp.getTransitions();
              _transitions.add(t_1);
              EList<State> _guardStates = t_1.getGuardStates();
              State _get_4 = scToFreeState.get(from);
              _guardStates.add(_get_4);
            }
          }
        }
        final HashMap<SwitchConnection, Event> scToTie = new HashMap<SwitchConnection, Event>();
        final HashMap<SwitchConnection, Event> scToToe = new HashMap<SwitchConnection, Event>();
        EList<SwitchConnection> _connections_6 = s.getConnections();
        for (final SwitchConnection sc_4 : _connections_6) {
          {
            final Event sctie = BehaviorModelManager.createTrainInEvent(sc_4);
            EList<Event> _events_4 = sys.getEvents();
            _events_4.add(sctie);
            scToTie.put(sc_4, sctie);
            final Event sctoe = BehaviorModelManager.createTrainOutEvent(sc_4);
            EList<Event> _events_5 = sys.getEvents();
            _events_5.add(sctoe);
            scToToe.put(sc_4, sctoe);
            final Event scroe = BehaviorModelManager.createRailOccupiedEvent(sc_4);
            EList<Event> _events_6 = sys.getEvents();
            _events_6.add(scroe);
            scToRoe.put(sc_4, scroe);
            final Event scrfe = BehaviorModelManager.createRailFreedEvent(sc_4);
            EList<Event> _events_7 = sys.getEvents();
            _events_7.add(scrfe);
            scToRfe.put(sc_4, scrfe);
          }
        }
        EList<SwitchConnection> _connections_7 = s.getConnections();
        for (final SwitchConnection sc_5 : _connections_7) {
          {
            final State scState = scToState.get(sc_5);
            String _name_2 = sc_5.getName();
            String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
            String _plus_4 = ("trainIn" + _firstUpper_2);
            String _plus_5 = (_plus_4 + "Active");
            Event _get = scToTie.get(sc_5);
            final Transition tin = BehaviorModelManager.createTransition(_plus_5, scState, scState, tie, _get);
            EList<Transition> _transitions = sComp.getTransitions();
            _transitions.add(tin);
            EList<State> _guardStates = tin.getGuardStates();
            State _get_1 = scToFreeState.get(sc_5);
            _guardStates.add(_get_1);
            String _name_3 = sc_5.getName();
            String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
            String _plus_6 = ("trainOut" + _firstUpper_3);
            String _plus_7 = (_plus_6 + "Active");
            Event _get_2 = scToToe.get(sc_5);
            final Transition tout = BehaviorModelManager.createTransition(_plus_7, scState, scState, toe, _get_2);
            EList<Transition> _transitions_1 = sComp.getTransitions();
            _transitions_1.add(tout);
          }
        }
        EList<SwitchConnection> _connections_8 = s.getConnections();
        for (final SwitchConnection sc_6 : _connections_8) {
          {
            final Component c = scToComp.get(sc_6);
            final State freeState = scToFreeState.get(sc_6);
            final State occState = scToOccState.get(sc_6);
            final State neState = scToNeState.get(sc_6);
            final Event railOcc = scToRoe.get(sc_6);
            final Event railFree = scToRfe.get(sc_6);
            Event _get = scToTie.get(sc_6);
            final Transition tin = BehaviorModelManager.createTransition("trainIn", freeState, occState, _get, railOcc);
            EList<Transition> _transitions = c.getTransitions();
            _transitions.add(tin);
            Event _get_1 = scToToe.get(sc_6);
            final Transition tout = BehaviorModelManager.createTransition("trainOut", occState, freeState, _get_1, railFree);
            EList<Transition> _transitions_1 = c.getTransitions();
            _transitions_1.add(tout);
            final Transition toff = BehaviorModelManager.createTransition("deactivate", freeState, neState, soe, null);
            EList<Transition> _transitions_2 = c.getTransitions();
            _transitions_2.add(toff);
            EList<SwitchConnection> _connections_9 = s.getConnections();
            for (final SwitchConnection to_1 : _connections_9) {
              {
                final Event evt = scToEvt.get(to_1);
                boolean _equals_1 = Objects.equal(sc_6, to_1);
                if (_equals_1) {
                  final Transition tact = BehaviorModelManager.createTransition("activate", neState, freeState, evt, null);
                  EList<Transition> _transitions_3 = c.getTransitions();
                  _transitions_3.add(tact);
                } else {
                  String _name_2 = to_1.getName();
                  String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
                  String _plus_4 = ("switchTo" + _firstUpper_2);
                  final Transition tto = BehaviorModelManager.createTransition(_plus_4, freeState, neState, evt, null);
                  EList<Transition> _transitions_4 = c.getTransitions();
                  _transitions_4.add(tto);
                }
              }
            }
          }
        }
      }
    }
    for (final Rail r_1 : allRails) {
      {
        final ArrayList<Signal> signals = new ArrayList<Signal>();
        TrackElement _to = r_1.getTo();
        boolean _notEquals = (!Objects.equal(_to, null));
        if (_notEquals) {
          TrackElement _to_1 = r_1.getTo();
          List<Signal> _signalsToRail = BehaviorModelManager.getSignalsToRail(r_1, _to_1);
          signals.addAll(_signalsToRail);
        }
        TrackElement _from = r_1.getFrom();
        boolean _notEquals_1 = (!Objects.equal(_from, null));
        if (_notEquals_1) {
          TrackElement _from_1 = r_1.getFrom();
          List<Signal> _signalsToRail_1 = BehaviorModelManager.getSignalsToRail(r_1, _from_1);
          signals.addAll(_signalsToRail_1);
        }
        final Event roe = rToRoe.get(r_1);
        final Event rfe = rToRfe.get(r_1);
        for (final Signal s_1 : signals) {
          {
            final Component c = BehaviorModelManager.factory.createComponent();
            EObject _eContainer = s_1.eContainer();
            String _name = ((Rail) _eContainer).getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name);
            String _plus = ("signal" + _firstUpper);
            String _plus_1 = (_plus + "To");
            String _name_1 = r_1.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
            String _plus_2 = (_plus_1 + _firstUpper_1);
            c.setName(_plus_2);
            EList<Component> _components = sys.getComponents();
            _components.add(c);
            final State greenState = BehaviorModelManager.factory.createState();
            String _name_2 = c.getName();
            String _plus_3 = (_name_2 + "Green");
            greenState.setName(_plus_3);
            EList<State> _states = c.getStates();
            _states.add(greenState);
            final State redState = BehaviorModelManager.factory.createState();
            String _name_3 = c.getName();
            String _plus_4 = (_name_3 + "Red");
            redState.setName(_plus_4);
            EList<State> _states_1 = c.getStates();
            _states_1.add(redState);
            Train _train = r_1.getTrain();
            boolean _equals = Objects.equal(_train, null);
            if (_equals) {
              c.setCurrentState(greenState);
            } else {
              c.setCurrentState(redState);
            }
            final Transition tall = BehaviorModelManager.createTransition("goesGreen", redState, greenState, rfe, null);
            EList<Transition> _transitions = c.getTransitions();
            _transitions.add(tall);
            final Transition tden = BehaviorModelManager.createTransition("goesRed", greenState, redState, roe, null);
            EList<Transition> _transitions_1 = c.getTransitions();
            _transitions_1.add(tden);
          }
        }
      }
    }
    for (final Switch s_1 : allSwitches) {
      {
        final HashMap<SwitchConnection, Event> scToEvt = sToEvt.get(s_1);
        final HashMap<Rail, Signal> rToS = new HashMap<Rail, Signal>();
        final HashMap<Rail, List<SwitchConnection>> rToSc = new HashMap<Rail, List<SwitchConnection>>();
        final HashSet<Rail> connRails = new HashSet<Rail>();
        EList<SwitchConnection> _connections = s_1.getConnections();
        for (final SwitchConnection sc : _connections) {
          {
            TrackElement _from = sc.getFrom();
            List<Rail> _allRails = BehaviorModelManager.getAllRails(_from);
            connRails.addAll(_allRails);
            TrackElement _to = sc.getTo();
            List<Rail> _allRails_1 = BehaviorModelManager.getAllRails(_to);
            connRails.addAll(_allRails_1);
          }
        }
        for (final Rail r_2 : connRails) {
          {
            TrackElement _to = r_2.getTo();
            boolean _equals = Objects.equal(_to, s_1);
            if (_equals) {
              Signal _allowedTo = r_2.getAllowedTo();
              rToS.put(r_2, _allowedTo);
            }
            TrackElement _from = r_2.getFrom();
            boolean _equals_1 = Objects.equal(_from, s_1);
            if (_equals_1) {
              Signal _allowedFrom = r_2.getAllowedFrom();
              rToS.put(r_2, _allowedFrom);
            }
            ArrayList<SwitchConnection> _arrayList = new ArrayList<SwitchConnection>();
            rToSc.put(r_2, _arrayList);
          }
        }
        EList<SwitchConnection> _connections_1 = s_1.getConnections();
        for (final SwitchConnection sc_1 : _connections_1) {
          {
            TrackElement _from = sc_1.getFrom();
            List<SwitchConnection> _get = rToSc.get(_from);
            _get.add(sc_1);
            TrackElement _to = sc_1.getTo();
            List<SwitchConnection> _get_1 = rToSc.get(_to);
            _get_1.add(sc_1);
          }
        }
        Set<Rail> _keySet = rToS.keySet();
        for (final Rail r_3 : _keySet) {
          {
            final Component c = BehaviorModelManager.factory.createComponent();
            String _name = r_3.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name);
            String _plus = ("signal" + _firstUpper);
            String _plus_1 = (_plus + "To");
            String _name_1 = s_1.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
            String _plus_2 = (_plus_1 + _firstUpper_1);
            c.setName(_plus_2);
            EList<Component> _components = sys.getComponents();
            _components.add(c);
            final State greenState = BehaviorModelManager.factory.createState();
            String _name_2 = c.getName();
            String _plus_3 = (_name_2 + "Green");
            greenState.setName(_plus_3);
            EList<State> _states = c.getStates();
            _states.add(greenState);
            final State redState = BehaviorModelManager.factory.createState();
            String _name_3 = c.getName();
            String _plus_4 = (_name_3 + "Red");
            redState.setName(_plus_4);
            EList<State> _states_1 = c.getStates();
            _states_1.add(redState);
            c.setCurrentState(redState);
            boolean _and = false;
            List<SwitchConnection> _get = rToSc.get(r_3);
            SwitchConnection _activeConnection = s_1.getActiveConnection();
            boolean _contains = _get.contains(_activeConnection);
            if (!_contains) {
              _and = false;
            } else {
              SwitchConnection _activeConnection_1 = s_1.getActiveConnection();
              Train _train = _activeConnection_1.getTrain();
              boolean _equals = Objects.equal(_train, null);
              _and = _equals;
            }
            if (_and) {
              c.setCurrentState(greenState);
            }
            Event _get_1 = sToOff.get(s_1);
            final Transition toff = BehaviorModelManager.createTransition("off", greenState, redState, _get_1, null);
            EList<Transition> _transitions = c.getTransitions();
            _transitions.add(toff);
            EList<SwitchConnection> _connections_2 = s_1.getConnections();
            for (final SwitchConnection sc_2 : _connections_2) {
              List<SwitchConnection> _get_2 = rToSc.get(r_3);
              boolean _contains_1 = _get_2.contains(sc_2);
              if (_contains_1) {
                String _name_4 = sc_2.getName();
                String _firstUpper_2 = StringExtensions.toFirstUpper(_name_4);
                String _plus_5 = ("switchedTo" + _firstUpper_2);
                Event _get_3 = scToEvt.get(sc_2);
                final Transition tall = BehaviorModelManager.createTransition(_plus_5, redState, greenState, _get_3, null);
                EList<Transition> _transitions_1 = c.getTransitions();
                _transitions_1.add(tall);
              } else {
                String _name_5 = sc_2.getName();
                String _firstUpper_3 = StringExtensions.toFirstUpper(_name_5);
                String _plus_6 = ("switchedTo" + _firstUpper_3);
                Event _get_4 = scToEvt.get(sc_2);
                final Transition tden = BehaviorModelManager.createTransition(_plus_6, greenState, redState, _get_4, null);
                EList<Transition> _transitions_2 = c.getTransitions();
                _transitions_2.add(tden);
              }
            }
            List<SwitchConnection> _get_5 = rToSc.get(r_3);
            for (final SwitchConnection sc_3 : _get_5) {
              {
                Event _get_6 = scToRfe.get(sc_3);
                final Transition tall_1 = BehaviorModelManager.createTransition("goesGreen", redState, greenState, _get_6, null);
                EList<Transition> _transitions_3 = c.getTransitions();
                _transitions_3.add(tall_1);
                Event _get_7 = scToRoe.get(sc_3);
                final Transition tden_1 = BehaviorModelManager.createTransition("goesRed", greenState, redState, _get_7, null);
                EList<Transition> _transitions_4 = c.getTransitions();
                _transitions_4.add(tden_1);
              }
            }
          }
        }
      }
    }
    return sys;
  }
  
  protected static List<Rail> _getAllRails(final Rail r) {
    final ArrayList<Rail> l = new ArrayList<Rail>();
    l.add(r);
    return l;
  }
  
  protected static List<Rail> _getAllRails(final Switch s) {
    final ArrayList<Rail> l = new ArrayList<Rail>();
    EList<SwitchConnection> _connections = s.getConnections();
    for (final SwitchConnection sc : _connections) {
      l.add(sc);
    }
    return l;
  }
  
  private static Event createTrainInEvent(final TrackElement te) {
    final Event ev = BehaviorModelManager.factory.createEvent();
    String _name = te.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("trainIn" + _firstUpper);
    ev.setName(_plus);
    return ev;
  }
  
  private static Event createTrainOutEvent(final TrackElement te) {
    final Event ev = BehaviorModelManager.factory.createEvent();
    String _name = te.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("trainOut" + _firstUpper);
    ev.setName(_plus);
    return ev;
  }
  
  private static Event createRailOccupiedEvent(final TrackElement te) {
    final Event ev = BehaviorModelManager.factory.createEvent();
    String _name = te.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("railOccupied" + _firstUpper);
    ev.setName(_plus);
    return ev;
  }
  
  private static Event createRailFreedEvent(final TrackElement te) {
    final Event ev = BehaviorModelManager.factory.createEvent();
    String _name = te.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("railFreed" + _firstUpper);
    ev.setName(_plus);
    return ev;
  }
  
  private static Component _createComponent(final Rail r) {
    final Component c = BehaviorModelManager.factory.createComponent();
    String _name = r.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("rail" + _firstUpper);
    c.setName(_plus);
    final State occState = BehaviorModelManager.createState(r, "Occupied");
    EList<State> _states = c.getStates();
    _states.add(occState);
    final State freeState = BehaviorModelManager.createState(r, "Free");
    EList<State> _states_1 = c.getStates();
    _states_1.add(freeState);
    Train _train = r.getTrain();
    boolean _equals = Objects.equal(_train, null);
    if (_equals) {
      c.setCurrentState(freeState);
    } else {
      c.setCurrentState(occState);
    }
    return c;
  }
  
  private static Component _createComponent(final Switch s) {
    final Component c = BehaviorModelManager.factory.createComponent();
    String _name = s.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("switch" + _firstUpper);
    c.setName(_plus);
    return c;
  }
  
  private static Component _createComponent(final SwitchConnection sc) {
    final Component c = BehaviorModelManager.factory.createComponent();
    String _name = sc.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("rail" + _firstUpper);
    c.setName(_plus);
    return c;
  }
  
  private static State createState(final TrackElement te, final String name) {
    final State s = BehaviorModelManager.factory.createState();
    String _name = te.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    String _firstUpper = StringExtensions.toFirstUpper(name);
    String _plus = (_firstLower + _firstUpper);
    s.setName(_plus);
    return s;
  }
  
  private static Transition createTransition(final String name, final State from, final State to, final Event trig, final Event gen) {
    final Transition t = BehaviorModelManager.factory.createTransition();
    t.setName(name);
    t.setFromState(from);
    t.setToState(to);
    t.setTriggeringEvent(trig);
    t.setGeneratedEvent(gen);
    return t;
  }
  
  private static List<Signal> _getSignalsToRail(final Rail r, final Switch s) {
    final ArrayList<Signal> signals = new ArrayList<Signal>();
    EList<SwitchConnection> _connections = s.getConnections();
    for (final SwitchConnection sc : _connections) {
      {
        TrackElement _to = sc.getTo();
        boolean _equals = Objects.equal(_to, r);
        if (_equals) {
          Signal _allowedTo = sc.getAllowedTo();
          signals.add(_allowedTo);
        }
        TrackElement _from = sc.getFrom();
        boolean _equals_1 = Objects.equal(_from, r);
        if (_equals_1) {
          Signal _allowedFrom = sc.getAllowedFrom();
          signals.add(_allowedFrom);
        }
      }
    }
    return signals;
  }
  
  private static List<Signal> _getSignalsToRail(final Rail r, final Rail n) {
    final ArrayList<Signal> signals = new ArrayList<Signal>();
    TrackElement _to = n.getTo();
    boolean _equals = Objects.equal(_to, r);
    if (_equals) {
      Signal _allowedTo = n.getAllowedTo();
      signals.add(_allowedTo);
    }
    TrackElement _from = n.getFrom();
    boolean _equals_1 = Objects.equal(_from, r);
    if (_equals_1) {
      Signal _allowedFrom = n.getAllowedFrom();
      signals.add(_allowedFrom);
    }
    return signals;
  }
  
  public static boolean eventComesIn(final Behavior.System sys, final Event event) {
    String _name = event.getName();
    final Event e = BehaviorModelManager.getEventByName(sys, _name);
    boolean _equals = Objects.equal(e, null);
    if (_equals) {
      return false;
    }
    boolean fired = false;
    final ArrayList<Event> genEvents = new ArrayList<Event>();
    EList<Component> _components = sys.getComponents();
    for (final Component c : _components) {
      EList<Transition> _transitions = c.getTransitions();
      for (final Transition t : _transitions) {
        Event _triggeringEvent = t.getTriggeringEvent();
        boolean _equals_1 = Objects.equal(_triggeringEvent, e);
        if (_equals_1) {
          final boolean enabled = BehaviorModelManager.isEnabled(sys, c, t);
          if (enabled) {
            fired = true;
            final Event genEv = BehaviorModelManager.fire(c, t);
            boolean _notEquals = (!Objects.equal(genEv, null));
            if (_notEquals) {
              genEvents.add(genEv);
            }
          }
        }
      }
    }
    if ((!fired)) {
      return false;
    }
    for (final Event ev : genEvents) {
      BehaviorModelManager.eventComesIn(sys, ev);
    }
    return true;
  }
  
  private static Event fire(final Component comp, final Transition transition) {
    State _toState = transition.getToState();
    comp.setCurrentState(_toState);
    return transition.getGeneratedEvent();
  }
  
  private static boolean isEnabled(final Behavior.System sys, final Component comp, final Transition tran) {
    State _currentState = comp.getCurrentState();
    State _fromState = tran.getFromState();
    boolean _notEquals = (!Objects.equal(_currentState, _fromState));
    if (_notEquals) {
      return false;
    }
    EList<State> _guardStates = tran.getGuardStates();
    for (final State s : _guardStates) {
      {
        EObject _eContainer = s.eContainer();
        final Component c = ((Component) _eContainer);
        State _currentState_1 = c.getCurrentState();
        boolean _notEquals_1 = (!Objects.equal(_currentState_1, s));
        if (_notEquals_1) {
          return false;
        }
      }
    }
    return true;
  }
  
  private static Event getEventByName(final Behavior.System system, final String string) {
    EList<Event> _events = system.getEvents();
    for (final Event e : _events) {
      String _name = e.getName();
      boolean _equals = _name.equals(string);
      if (_equals) {
        return e;
      }
    }
    return null;
  }
  
  public static List<Rail> getAllRails(final TrackElement r) {
    if (r instanceof Rail) {
      return _getAllRails((Rail)r);
    } else if (r instanceof Switch) {
      return _getAllRails((Switch)r);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r).toString());
    }
  }
  
  private static Component createComponent(final TrackElement sc) {
    if (sc instanceof SwitchConnection) {
      return _createComponent((SwitchConnection)sc);
    } else if (sc instanceof Rail) {
      return _createComponent((Rail)sc);
    } else if (sc instanceof Switch) {
      return _createComponent((Switch)sc);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(sc).toString());
    }
  }
  
  private static List<Signal> getSignalsToRail(final Rail r, final TrackElement n) {
    if (n instanceof Rail) {
      return _getSignalsToRail(r, (Rail)n);
    } else if (n instanceof Switch) {
      return _getSignalsToRail(r, (Switch)n);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, n).toString());
    }
  }
}
