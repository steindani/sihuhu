package hu.bme.mit.rnd.behavior.incquery.util;

import Behavior.Transition;
import hu.bme.mit.rnd.behavior.incquery.InvalidGeneratedEventMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.rnd.behavior.incquery.invalidGeneratedEvent pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidGeneratedEventProcessor implements IMatchProcessor<InvalidGeneratedEventMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * 
   */
  public abstract void process(final Transition pT);
  
  @Override
  public void process(final InvalidGeneratedEventMatch match) {
    process(match.getT());
  }
}
