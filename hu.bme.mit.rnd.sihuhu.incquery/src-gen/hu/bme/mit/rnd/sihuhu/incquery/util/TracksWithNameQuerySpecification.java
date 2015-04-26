package hu.bme.mit.rnd.sihuhu.incquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.rnd.sihuhu.incquery.TracksWithNameMatch;
import hu.bme.mit.rnd.sihuhu.incquery.TracksWithNameMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate TracksWithNameMatcher in a type-safe way.
 * 
 * @see TracksWithNameMatcher
 * @see TracksWithNameMatch
 * 
 */
@SuppressWarnings("all")
public final class TracksWithNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<TracksWithNameMatcher> {
  private TracksWithNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TracksWithNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TracksWithNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TracksWithNameMatcher.on(engine);
  }
  
  @Override
  public TracksWithNameMatch newEmptyMatch() {
    return TracksWithNameMatch.newEmptyMatch();
  }
  
  @Override
  public TracksWithNameMatch newMatch(final Object... parameters) {
    return TracksWithNameMatch.newMatch((hu.bme.mit.rnd.sihuhu.sihuhu.Track) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TracksWithNameQuerySpecification INSTANCE = make();
    
    public static TracksWithNameQuerySpecification make() {
      return new TracksWithNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TracksWithNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.rnd.sihuhu.incquery.tracksWithName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T","name");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("T", "hu.bme.mit.rnd.sihuhu.sihuhu.Track"),new PParameter("name", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_name = body.getOrCreateVariableByName("name");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_T, "T"),
      				
      		new ExportedParameter(body, var_name, "name")
      	));
      	new TypeUnary(body, var_T, getClassifierLiteral("hu.bme.mit.rnd.sihuhu", "Track"), "hu.bme.mit.rnd.sihuhu/Track");
      	new TypeBinary(body, CONTEXT, var_T, var_name, getFeatureLiteral("hu.bme.mit.rnd.sihuhu", "NamedElement", "name"), "hu.bme.mit.rnd.sihuhu/NamedElement.name");
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
