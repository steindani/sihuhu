package hu.bme.mit.rnd.behavior.incquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.rnd.behavior.incquery.InvalidGeneratedEventMatch;
import hu.bme.mit.rnd.behavior.incquery.InvalidGeneratedEventMatcher;
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
 * A pattern-specific query specification that can instantiate InvalidGeneratedEventMatcher in a type-safe way.
 * 
 * @see InvalidGeneratedEventMatcher
 * @see InvalidGeneratedEventMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidGeneratedEventQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidGeneratedEventMatcher> {
  private InvalidGeneratedEventQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidGeneratedEventQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidGeneratedEventMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidGeneratedEventMatcher.on(engine);
  }
  
  @Override
  public InvalidGeneratedEventMatch newEmptyMatch() {
    return InvalidGeneratedEventMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidGeneratedEventMatch newMatch(final Object... parameters) {
    return InvalidGeneratedEventMatch.newMatch((Behavior.Transition) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static InvalidGeneratedEventQuerySpecification INSTANCE = make();
    
    public static InvalidGeneratedEventQuerySpecification make() {
      return new InvalidGeneratedEventQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidGeneratedEventQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.rnd.behavior.incquery.invalidGeneratedEvent";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("T", "Behavior.Transition"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_E = body.getOrCreateVariableByName("E");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_T, "T")
      	));
      	new TypeBinary(body, CONTEXT, var_T, var_E, getFeatureLiteral("hu.bme.mit.rnd.behavior", "Transition", "triggeringEvent"), "hu.bme.mit.rnd.behavior/Transition.triggeringEvent");
      	new TypeBinary(body, CONTEXT, var_T, var_E, getFeatureLiteral("hu.bme.mit.rnd.behavior", "Transition", "generatedEvent"), "hu.bme.mit.rnd.behavior/Transition.generatedEvent");
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("Constraint");
      	annotation.addAttribute("severity", "error");
      	annotation.addAttribute("location", new ParameterReference("T"));
      	annotation.addAttribute("message", "A transitions Triggering and Generated event have to be different");
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
