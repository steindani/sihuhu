package hu.bme.mit.rnd.behavior.incquery;

import hu.bme.mit.rnd.behavior.incquery.ComponentStatesMatcher;
import hu.bme.mit.rnd.behavior.incquery.InvalidCurrentStateMatcher;
import hu.bme.mit.rnd.behavior.incquery.InvalidGeneratedEventMatcher;
import hu.bme.mit.rnd.behavior.incquery.InvalidGuardStateMatcher;
import hu.bme.mit.rnd.behavior.incquery.util.ComponentStatesQuerySpecification;
import hu.bme.mit.rnd.behavior.incquery.util.InvalidCurrentStateQuerySpecification;
import hu.bme.mit.rnd.behavior.incquery.util.InvalidGeneratedEventQuerySpecification;
import hu.bme.mit.rnd.behavior.incquery.util.InvalidGuardStateQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in behavior.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file behavior.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.rnd.behavior.incquery, the group contains the definition of the following patterns: <ul>
 * <li>componentStates</li>
 * <li>invalidCurrentState</li>
 * <li>invalidGuardState</li>
 * <li>invalidGeneratedEvent</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Behavior extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Behavior instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Behavior();
    }
    return INSTANCE;
  }
  
  private static Behavior INSTANCE;
  
  private Behavior() throws IncQueryException {
    querySpecifications.add(ComponentStatesQuerySpecification.instance());
    querySpecifications.add(InvalidCurrentStateQuerySpecification.instance());
    querySpecifications.add(InvalidGuardStateQuerySpecification.instance());
    querySpecifications.add(InvalidGeneratedEventQuerySpecification.instance());
  }
  
  public ComponentStatesQuerySpecification getComponentStates() throws IncQueryException {
    return ComponentStatesQuerySpecification.instance();
  }
  
  public ComponentStatesMatcher getComponentStates(final IncQueryEngine engine) throws IncQueryException {
    return ComponentStatesMatcher.on(engine);
  }
  
  public InvalidCurrentStateQuerySpecification getInvalidCurrentState() throws IncQueryException {
    return InvalidCurrentStateQuerySpecification.instance();
  }
  
  public InvalidCurrentStateMatcher getInvalidCurrentState(final IncQueryEngine engine) throws IncQueryException {
    return InvalidCurrentStateMatcher.on(engine);
  }
  
  public InvalidGuardStateQuerySpecification getInvalidGuardState() throws IncQueryException {
    return InvalidGuardStateQuerySpecification.instance();
  }
  
  public InvalidGuardStateMatcher getInvalidGuardState(final IncQueryEngine engine) throws IncQueryException {
    return InvalidGuardStateMatcher.on(engine);
  }
  
  public InvalidGeneratedEventQuerySpecification getInvalidGeneratedEvent() throws IncQueryException {
    return InvalidGeneratedEventQuerySpecification.instance();
  }
  
  public InvalidGeneratedEventMatcher getInvalidGeneratedEvent(final IncQueryEngine engine) throws IncQueryException {
    return InvalidGeneratedEventMatcher.on(engine);
  }
}
