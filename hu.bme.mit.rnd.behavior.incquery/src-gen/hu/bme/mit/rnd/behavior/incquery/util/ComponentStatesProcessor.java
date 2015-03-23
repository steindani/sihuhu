package hu.bme.mit.rnd.behavior.incquery.util;

import Behavior.Component;
import Behavior.State;
import hu.bme.mit.rnd.behavior.incquery.ComponentStatesMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.rnd.behavior.incquery.componentStates pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ComponentStatesProcessor implements IMatchProcessor<ComponentStatesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter C in the currently processed match
   * @param pS the value of pattern parameter S in the currently processed match
   * 
   */
  public abstract void process(final Component pC, final State pS);
  
  @Override
  public void process(final ComponentStatesMatch match) {
    process(match.getC(), match.getS());
  }
}
