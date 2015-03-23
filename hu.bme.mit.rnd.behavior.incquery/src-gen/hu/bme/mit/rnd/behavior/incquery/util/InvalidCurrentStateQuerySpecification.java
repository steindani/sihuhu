package hu.bme.mit.rnd.behavior.incquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.rnd.behavior.incquery.InvalidCurrentStateMatch;
import hu.bme.mit.rnd.behavior.incquery.InvalidCurrentStateMatcher;
import hu.bme.mit.rnd.behavior.incquery.util.ComponentStatesQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate InvalidCurrentStateMatcher in a type-safe way.
 * 
 * @see InvalidCurrentStateMatcher
 * @see InvalidCurrentStateMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidCurrentStateQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidCurrentStateMatcher> {
  private InvalidCurrentStateQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidCurrentStateQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidCurrentStateMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidCurrentStateMatcher.on(engine);
  }
  
  @Override
  public InvalidCurrentStateMatch newEmptyMatch() {
    return InvalidCurrentStateMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidCurrentStateMatch newMatch(final Object... parameters) {
    return InvalidCurrentStateMatch.newMatch((Behavior.Component) parameters[0], (Behavior.State) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static InvalidCurrentStateQuerySpecification INSTANCE = make();
    
    public static InvalidCurrentStateQuerySpecification make() {
      return new InvalidCurrentStateQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidCurrentStateQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.rnd.behavior.incquery.invalidCurrentState";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("C","S");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("C", "Behavior.Component"),new PParameter("S", "Behavior.State"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	PVariable var_S = body.getOrCreateVariableByName("S");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_C, "C"),
      				
      		new ExportedParameter(body, var_S, "S")
      	));
      	new TypeBinary(body, CONTEXT, var_C, var_S, getFeatureLiteral("hu.bme.mit.rnd.behavior", "Component", "currentState"), "hu.bme.mit.rnd.behavior/Component.currentState");
      	new NegativePatternCall(body, new FlatTuple(var_C, var_S), ComponentStatesQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("Constraint");
      	annotation.addAttribute("severity", "error");
      	annotation.addAttribute("location", new ParameterReference("C"));
      	annotation.addAttribute("message", "Current state have to be one of the components states");
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
