package hu.bme.mit.rnd.sihuhu.incquery.util;

import hu.bme.mit.rnd.sihuhu.incquery.TracksWithNameMatch;
import hu.bme.mit.rnd.sihuhu.sihuhu.Track;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.rnd.sihuhu.incquery.tracksWithName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TracksWithNameProcessor implements IMatchProcessor<TracksWithNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * @param pName the value of pattern parameter name in the currently processed match
   * 
   */
  public abstract void process(final Track pT, final String pName);
  
  @Override
  public void process(final TracksWithNameMatch match) {
    process(match.getT(), match.getName());
  }
}
