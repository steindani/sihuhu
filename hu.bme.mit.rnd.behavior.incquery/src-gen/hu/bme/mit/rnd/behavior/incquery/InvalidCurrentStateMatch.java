package hu.bme.mit.rnd.behavior.incquery;

import Behavior.Component;
import Behavior.State;
import hu.bme.mit.rnd.behavior.incquery.util.InvalidCurrentStateQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.rnd.behavior.incquery.invalidCurrentState pattern,
 * to be used in conjunction with {@link InvalidCurrentStateMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidCurrentStateMatcher
 * @see InvalidCurrentStateProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidCurrentStateMatch extends BasePatternMatch {
  private Component fC;
  
  private State fS;
  
  private static List<String> parameterNames = makeImmutableList("C", "S");
  
  private InvalidCurrentStateMatch(final Component pC, final State pS) {
    this.fC = pC;
    this.fS = pS;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("C".equals(parameterName)) return this.fC;
    if ("S".equals(parameterName)) return this.fS;
    return null;
  }
  
  public Component getC() {
    return this.fC;
  }
  
  public State getS() {
    return this.fS;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("C".equals(parameterName) ) {
    	this.fC = (Behavior.Component) newValue;
    	return true;
    }
    if ("S".equals(parameterName) ) {
    	this.fS = (Behavior.State) newValue;
    	return true;
    }
    return false;
  }
  
  public void setC(final Component pC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fC = pC;
  }
  
  public void setS(final State pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.rnd.behavior.incquery.invalidCurrentState";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidCurrentStateMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fC, fS};
  }
  
  @Override
  public InvalidCurrentStateMatch toImmutable() {
    return isMutable() ? newMatch(fC, fS) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"C\"=" + prettyPrintValue(fC) + ", ");
    
    result.append("\"S\"=" + prettyPrintValue(fS)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fC == null) ? 0 : fC.hashCode());
    result = prime * result + ((fS == null) ? 0 : fS.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidCurrentStateMatch)) { // this should be infrequent
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
    InvalidCurrentStateMatch other = (InvalidCurrentStateMatch) obj;
    if (fC == null) {if (other.fC != null) return false;}
    else if (!fC.equals(other.fC)) return false;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    return true;
  }
  
  @Override
  public InvalidCurrentStateQuerySpecification specification() {
    try {
    	return InvalidCurrentStateQuerySpecification.instance();
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
  public static InvalidCurrentStateMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidCurrentStateMatch newMutableMatch(final Component pC, final State pS) {
    return new Mutable(pC, pS);
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
  public static InvalidCurrentStateMatch newMatch(final Component pC, final State pS) {
    return new Immutable(pC, pS);
  }
  
  private static final class Mutable extends InvalidCurrentStateMatch {
    Mutable(final Component pC, final State pS) {
      super(pC, pS);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidCurrentStateMatch {
    Immutable(final Component pC, final State pS) {
      super(pC, pS);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
