package hu.bme.mit.rnd.behavior.incquery;

import Behavior.Component;
import Behavior.State;
import hu.bme.mit.rnd.behavior.incquery.ComponentStatesMatch;
import hu.bme.mit.rnd.behavior.incquery.util.ComponentStatesQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.rnd.behavior.incquery.componentStates pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ComponentStatesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //------------------------------- // Support //-------------------------------
 * 
 * pattern componentStates(C:Component, S:State) {
 * 	Component.states(C,S);
 * }
 * </pre></code>
 * 
 * @see ComponentStatesMatch
 * @see ComponentStatesProcessor
 * @see ComponentStatesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ComponentStatesMatcher extends BaseMatcher<ComponentStatesMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ComponentStatesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ComponentStatesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ComponentStatesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_C = 0;
  
  private final static int POSITION_S = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ComponentStatesMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public ComponentStatesMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public ComponentStatesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return matches represented as a ComponentStatesMatch object.
   * 
   */
  public Collection<ComponentStatesMatch> getAllMatches(final Component pC, final State pS) {
    return rawGetAllMatches(new Object[]{pC, pS});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return a match represented as a ComponentStatesMatch object, or null if no match is found.
   * 
   */
  public ComponentStatesMatch getOneArbitraryMatch(final Component pC, final State pS) {
    return rawGetOneArbitraryMatch(new Object[]{pC, pS});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Component pC, final State pS) {
    return rawHasMatch(new Object[]{pC, pS});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Component pC, final State pS) {
    return rawCountMatches(new Object[]{pC, pS});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Component pC, final State pS, final IMatchProcessor<? super ComponentStatesMatch> processor) {
    rawForEachMatch(new Object[]{pC, pS}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Component pC, final State pS, final IMatchProcessor<? super ComponentStatesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pC, pS}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ComponentStatesMatch newMatch(final Component pC, final State pS) {
    return ComponentStatesMatch.newMatch(pC, pS);
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Component> rawAccumulateAllValuesOfC(final Object[] parameters) {
    Set<Component> results = new HashSet<Component>();
    rawAccumulateAllValues(POSITION_C, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Component> getAllValuesOfC() {
    return rawAccumulateAllValuesOfC(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Component> getAllValuesOfC(final ComponentStatesMatch partialMatch) {
    return rawAccumulateAllValuesOfC(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Component> getAllValuesOfC(final State pS) {
    return rawAccumulateAllValuesOfC(new Object[]{
    null, 
    pS
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<State> rawAccumulateAllValuesOfS(final Object[] parameters) {
    Set<State> results = new HashSet<State>();
    rawAccumulateAllValues(POSITION_S, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfS() {
    return rawAccumulateAllValuesOfS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfS(final ComponentStatesMatch partialMatch) {
    return rawAccumulateAllValuesOfS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfS(final Component pC) {
    return rawAccumulateAllValuesOfS(new Object[]{
    pC, 
    null
    });
  }
  
  @Override
  protected ComponentStatesMatch tupleToMatch(final Tuple t) {
    try {
    	return ComponentStatesMatch.newMatch((Behavior.Component) t.get(POSITION_C), (Behavior.State) t.get(POSITION_S));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ComponentStatesMatch arrayToMatch(final Object[] match) {
    try {
    	return ComponentStatesMatch.newMatch((Behavior.Component) match[POSITION_C], (Behavior.State) match[POSITION_S]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ComponentStatesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ComponentStatesMatch.newMutableMatch((Behavior.Component) match[POSITION_C], (Behavior.State) match[POSITION_S]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ComponentStatesMatcher> querySpecification() throws IncQueryException {
    return ComponentStatesQuerySpecification.instance();
  }
}
