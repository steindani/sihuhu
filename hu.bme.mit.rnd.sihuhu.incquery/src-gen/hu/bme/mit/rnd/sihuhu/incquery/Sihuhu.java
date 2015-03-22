package hu.bme.mit.rnd.sihuhu.incquery;

import hu.bme.mit.rnd.sihuhu.incquery.TracksWithNameMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.util.TracksWithNameQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in sihuhu.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file sihuhu.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.rnd.sihuhu.incquery, the group contains the definition of the following patterns: <ul>
 * <li>tracksWithName</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Sihuhu extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Sihuhu instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Sihuhu();
    }
    return INSTANCE;
  }
  
  private static Sihuhu INSTANCE;
  
  private Sihuhu() throws IncQueryException {
    querySpecifications.add(TracksWithNameQuerySpecification.instance());
  }
  
  public TracksWithNameQuerySpecification getTracksWithName() throws IncQueryException {
    return TracksWithNameQuerySpecification.instance();
  }
  
  public TracksWithNameMatcher getTracksWithName(final IncQueryEngine engine) throws IncQueryException {
    return TracksWithNameMatcher.on(engine);
  }
}
