package hu.bme.mit.rnd.behavior.incquery;

import Behavior.State;
import Behavior.Transition;
import hu.bme.mit.rnd.behavior.incquery.util.InvalidGuardStateQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.rnd.behavior.incquery.invalidGuardState pattern,
 * to be used in conjunction with {@link InvalidGuardStateMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InvalidGuardStateMatcher
 * @see InvalidGuardStateProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidGuardStateMatch extends BasePatternMatch {
  private Transition fT;
  
  private State fS;
  
  private static List<String> parameterNames = makeImmutableList("T", "S");
  
  private InvalidGuardStateMatch(final Transition pT, final State pS) {
    this.fT = pT;
    this.fS = pS;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    if ("S".equals(parameterName)) return this.fS;
    return null;
  }
  
  public Transition getT() {
    return this.fT;
  }
  
  public State getS() {
    return this.fS;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("T".equals(parameterName) ) {
    	this.fT = (Behavior.Transition) newValue;
    	return true;
    }
    if ("S".equals(parameterName) ) {
    	this.fS = (Behavior.State) newValue;
    	return true;
    }
    return false;
  }
  
  public void setT(final Transition pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
  }
  
  public void setS(final State pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.rnd.behavior.incquery.invalidGuardState";
  }
  
  @Override
  public List<String> parameterNames() {
    return InvalidGuardStateMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fS};
  }
  
  @Override
  public InvalidGuardStateMatch toImmutable() {
    return isMutable() ? newMatch(fT, fS) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    
    result.append("\"S\"=" + prettyPrintValue(fS)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    result = prime * result + ((fS == null) ? 0 : fS.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InvalidGuardStateMatch)) { // this should be infrequent
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
    InvalidGuardStateMatch other = (InvalidGuardStateMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    return true;
  }
  
  @Override
  public InvalidGuardStateQuerySpecification specification() {
    try {
    	return InvalidGuardStateQuerySpecification.instance();
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
  public static InvalidGuardStateMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static InvalidGuardStateMatch newMutableMatch(final Transition pT, final State pS) {
    return new Mutable(pT, pS);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static InvalidGuardStateMatch newMatch(final Transition pT, final State pS) {
    return new Immutable(pT, pS);
  }
  
  private static final class Mutable extends InvalidGuardStateMatch {
    Mutable(final Transition pT, final State pS) {
      super(pT, pS);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends InvalidGuardStateMatch {
    Immutable(final Transition pT, final State pS) {
      super(pT, pS);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
