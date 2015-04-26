package hu.bme.mit.rnd.behavior.incquery;

import Behavior.Transition;
import hu.bme.mit.rnd.behavior.incquery.util.InvalidGeneratedEventQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.rnd.behavior.incquery.invalidGeneratedEvent pattern,
 * to be used in conjunction with {@link InvalidGeneratedEventMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidGeneratedEventMatcher
 * @see InvalidGeneratedEventProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidGeneratedEventMatch extends BasePatternMatch {
  private Transition fT;
  
  private static List<String> parameterNames = makeImmutableList("T");
  
  private InvalidGeneratedEventMatch(final Transition pT) {
    this.fT = pT;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    return null;
  }
  
  public Transition getT() {
    return this.fT;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("T".equals(parameterName) ) {
    	this.fT = (Behavior.Transition) newValue;
    	return true;
    }
    return false;
  }
  
  public void setT(final Transition pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.rnd.behavior.incquery.invalidGeneratedEvent";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidGeneratedEventMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT};
  }
  
  @Override
  public InvalidGeneratedEventMatch toImmutable() {
    return isMutable() ? newMatch(fT) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidGeneratedEventMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    InvalidGeneratedEventMatch other = (InvalidGeneratedEventMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    return true;
  }
  
  @Override
  public InvalidGeneratedEventQuerySpecification specification() {
    try {
    	return InvalidGeneratedEventQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static InvalidGeneratedEventMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidGeneratedEventMatch newMutableMatch(final Transition pT) {
    return new Mutable(pT);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidGeneratedEventMatch newMatch(final Transition pT) {
    return new Immutable(pT);
  }
  
  private static final class Mutable extends InvalidGeneratedEventMatch {
    Mutable(final Transition pT) {
      super(pT);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidGeneratedEventMatch {
    Immutable(final Transition pT) {
      super(pT);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
