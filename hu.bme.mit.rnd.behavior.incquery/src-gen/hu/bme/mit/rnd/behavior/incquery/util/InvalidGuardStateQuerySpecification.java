package hu.bme.mit.rnd.behavior.incquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.rnd.behavior.incquery.InvalidGuardStateMatch;
import hu.bme.mit.rnd.behavior.incquery.InvalidGuardStateMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate InvalidGuardStateMatcher in a type-safe way.
 * 
 * @see InvalidGuardStateMatcher
 * @see InvalidGuardStateMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidGuardStateQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidGuardStateMatcher> {
  private InvalidGuardStateQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidGuardStateQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidGuardStateMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidGuardStateMatcher.on(engine);
  }
  
  @Override
  public InvalidGuardStateMatch newEmptyMatch() {
    return InvalidGuardStateMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidGuardStateMatch newMatch(final Object... parameters) {
    return InvalidGuardStateMatch.newMatch((Behavior.Transition) parameters[0], (Behavior.State) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static InvalidGuardStateQuerySpecification INSTANCE = make();
    
    public static InvalidGuardStateQuerySpecification make() {
      return new InvalidGuardStateQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidGuardStateQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.rnd.behavior.incquery.invalidGuardState";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T","S");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("T", "Behavior.Transition"),new PParameter("S", "Behavior.State"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_S = body.getOrCreateVariableByName("S");
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_T, "T"),
      				
      		new ExportedParameter(body, var_S, "S")
      	));
      	new TypeBinary(body, CONTEXT, var_C, var_T, getFeatureLiteral("hu.bme.mit.rnd.behavior", "Component", "transitions"), "hu.bme.mit.rnd.behavior/Component.transitions");
      	new TypeBinary(body, CONTEXT, var_T, var_S, getFeatureLiteral("hu.bme.mit.rnd.behavior", "Transition", "guardStates"), "hu.bme.mit.rnd.behavior/Transition.guardStates");
      	new TypeBinary(body, CONTEXT, var_C, var_S, getFeatureLiteral("hu.bme.mit.rnd.behavior", "Component", "states"), "hu.bme.mit.rnd.behavior/Component.states");
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("Constraint");
      	annotation.addAttribute("severity", "error");
      	annotation.addAttribute("location", new ParameterReference("T"));
      	annotation.addAttribute("message", "A transitions Guard state have to be another component's state");
      	annotation.addAttribute("targetEditorId", "*");
      	addAnnotation(annotation);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
