package hu.bme.mit.rnd.behavior.incquery.util;

import Behavior.State;
import Behavior.Transition;
import hu.bme.mit.rnd.behavior.incquery.InvalidGuardStateMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.rnd.behavior.incquery.invalidGuardState pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidGuardStateProcessor implements IMatchProcessor<InvalidGuardStateMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * @param pS the value of pattern parameter S in the currently processed match
   * 
   */
  public abstract void process(final Transition pT, final State pS);
  
  @Override
  public void process(final InvalidGuardStateMatch match) {
    process(match.getT(), match.getS());
  }
}
