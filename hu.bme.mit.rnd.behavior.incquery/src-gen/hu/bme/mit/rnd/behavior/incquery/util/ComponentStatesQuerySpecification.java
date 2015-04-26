package hu.bme.mit.rnd.behavior.incquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.rnd.behavior.incquery.ComponentStatesMatch;
import hu.bme.mit.rnd.behavior.incquery.ComponentStatesMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate ComponentStatesMatcher in a type-safe way.
 * 
 * @see ComponentStatesMatcher
 * @see ComponentStatesMatch
 * 
 */
@SuppressWarnings("all")
public final class ComponentStatesQuerySpecification extends BaseGeneratedEMFQuerySpecification<ComponentStatesMatcher> {
  private ComponentStatesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ComponentStatesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ComponentStatesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ComponentStatesMatcher.on(engine);
  }
  
  @Override
  public ComponentStatesMatch newEmptyMatch() {
    return ComponentStatesMatch.newEmptyMatch();
  }
  
  @Override
  public ComponentStatesMatch newMatch(final Object... parameters) {
    return ComponentStatesMatch.newMatch((Behavior.Component) parameters[0], (Behavior.State) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ComponentStatesQuerySpecification INSTANCE = make();
    
    public static ComponentStatesQuerySpecification make() {
      return new ComponentStatesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ComponentStatesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.rnd.behavior.incquery.componentStates";
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
      	new TypeBinary(body, CONTEXT, var_C, var_S, getFeatureLiteral("hu.bme.mit.rnd.behavior", "Component", "states"), "hu.bme.mit.rnd.behavior/Component.states");
      	bodies.add(body);
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
