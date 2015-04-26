package hu.bme.mit.rnd.sihuhu.incquery;

import hu.bme.mit.rnd.sihuhu.incquery.ConnectedRailMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.HalfConnectedElementMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.InvalidActiveConnectionMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.InvalidRailConnectionMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.InvalidSwitchConnectionMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.NeighborOfRailMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.NormalRailMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.PossibleNeighborOfElementMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.SwitchConnectionMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.SwitchWithoutConnectionMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.TracksWithNameMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.UnconnectedRailMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.ValidSwitchConnectionMatcher;
import hu.bme.mit.rnd.sihuhu.incquery.util.ConnectedRailQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.HalfConnectedElementQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.InvalidActiveConnectionQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.InvalidRailConnectionQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.InvalidSwitchConnectionQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.NeighborOfRailQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.NormalRailQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.PossibleNeighborOfElementQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.SwitchConnectionQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.SwitchWithoutConnectionQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.TracksWithNameQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.UnconnectedRailQuerySpecification;
import hu.bme.mit.rnd.sihuhu.incquery.util.ValidSwitchConnectionQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in sihuhu.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file sihuhu.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.rnd.sihuhu.incquery, the group contains the definition of the following patterns: <ul>
 * <li>tracksWithName</li>
 * <li>switchConnection</li>
 * <li>normalRail</li>
 * <li>neighborOfRail</li>
 * <li>possibleNeighborOfElement</li>
 * <li>connectedRail</li>
 * <li>validSwitchConnection</li>
 * <li>invalidSwitchConnection</li>
 * <li>switchWithoutConnection</li>
 * <li>invalidActiveConnection</li>
 * <li>invalidRailConnection</li>
 * <li>halfConnectedElement</li>
 * <li>unconnectedRail</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Sihuhu extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Sihuhu instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Sihuhu();
    }
    return INSTANCE;
  }
  
  private static Sihuhu INSTANCE;
  
  private Sihuhu() throws IncQueryException {
    querySpecifications.add(TracksWithNameQuerySpecification.instance());
    querySpecifications.add(SwitchConnectionQuerySpecification.instance());
    querySpecifications.add(NormalRailQuerySpecification.instance());
    querySpecifications.add(NeighborOfRailQuerySpecification.instance());
    querySpecifications.add(PossibleNeighborOfElementQuerySpecification.instance());
    querySpecifications.add(ConnectedRailQuerySpecification.instance());
    querySpecifications.add(ValidSwitchConnectionQuerySpecification.instance());
    querySpecifications.add(InvalidSwitchConnectionQuerySpecification.instance());
    querySpecifications.add(SwitchWithoutConnectionQuerySpecification.instance());
    querySpecifications.add(InvalidActiveConnectionQuerySpecification.instance());
    querySpecifications.add(InvalidRailConnectionQuerySpecification.instance());
    querySpecifications.add(HalfConnectedElementQuerySpecification.instance());
    querySpecifications.add(UnconnectedRailQuerySpecification.instance());
  }
  
  public TracksWithNameQuerySpecification getTracksWithName() throws IncQueryException {
    return TracksWithNameQuerySpecification.instance();
  }
  
  public TracksWithNameMatcher getTracksWithName(final IncQueryEngine engine) throws IncQueryException {
    return TracksWithNameMatcher.on(engine);
  }
  
  public SwitchConnectionQuerySpecification getSwitchConnection() throws IncQueryException {
    return SwitchConnectionQuerySpecification.instance();
  }
  
  public SwitchConnectionMatcher getSwitchConnection(final IncQueryEngine engine) throws IncQueryException {
    return SwitchConnectionMatcher.on(engine);
  }
  
  public NormalRailQuerySpecification getNormalRail() throws IncQueryException {
    return NormalRailQuerySpecification.instance();
  }
  
  public NormalRailMatcher getNormalRail(final IncQueryEngine engine) throws IncQueryException {
    return NormalRailMatcher.on(engine);
  }
  
  public NeighborOfRailQuerySpecification getNeighborOfRail() throws IncQueryException {
    return NeighborOfRailQuerySpecification.instance();
  }
  
  public NeighborOfRailMatcher getNeighborOfRail(final IncQueryEngine engine) throws IncQueryException {
    return NeighborOfRailMatcher.on(engine);
  }
  
  public PossibleNeighborOfElementQuerySpecification getPossibleNeighborOfElement() throws IncQueryException {
    return PossibleNeighborOfElementQuerySpecification.instance();
  }
  
  public PossibleNeighborOfElementMatcher getPossibleNeighborOfElement(final IncQueryEngine engine) throws IncQueryException {
    return PossibleNeighborOfElementMatcher.on(engine);
  }
  
  public ConnectedRailQuerySpecification getConnectedRail() throws IncQueryException {
    return ConnectedRailQuerySpecification.instance();
  }
  
  public ConnectedRailMatcher getConnectedRail(final IncQueryEngine engine) throws IncQueryException {
    return ConnectedRailMatcher.on(engine);
  }
  
  public ValidSwitchConnectionQuerySpecification getValidSwitchConnection() throws IncQueryException {
    return ValidSwitchConnectionQuerySpecification.instance();
  }
  
  public ValidSwitchConnectionMatcher getValidSwitchConnection(final IncQueryEngine engine) throws IncQueryException {
    return ValidSwitchConnectionMatcher.on(engine);
  }
  
  public InvalidSwitchConnectionQuerySpecification getInvalidSwitchConnection() throws IncQueryException {
    return InvalidSwitchConnectionQuerySpecification.instance();
  }
  
  public InvalidSwitchConnectionMatcher getInvalidSwitchConnection(final IncQueryEngine engine) throws IncQueryException {
    return InvalidSwitchConnectionMatcher.on(engine);
  }
  
  public SwitchWithoutConnectionQuerySpecification getSwitchWithoutConnection() throws IncQueryException {
    return SwitchWithoutConnectionQuerySpecification.instance();
  }
  
  public SwitchWithoutConnectionMatcher getSwitchWithoutConnection(final IncQueryEngine engine) throws IncQueryException {
    return SwitchWithoutConnectionMatcher.on(engine);
  }
  
  public InvalidActiveConnectionQuerySpecification getInvalidActiveConnection() throws IncQueryException {
    return InvalidActiveConnectionQuerySpecification.instance();
  }
  
  public InvalidActiveConnectionMatcher getInvalidActiveConnection(final IncQueryEngine engine) throws IncQueryException {
    return InvalidActiveConnectionMatcher.on(engine);
  }
  
  public InvalidRailConnectionQuerySpecification getInvalidRailConnection() throws IncQueryException {
    return InvalidRailConnectionQuerySpecification.instance();
  }
  
  public InvalidRailConnectionMatcher getInvalidRailConnection(final IncQueryEngine engine) throws IncQueryException {
    return InvalidRailConnectionMatcher.on(engine);
  }
  
  public HalfConnectedElementQuerySpecification getHalfConnectedElement() throws IncQueryException {
    return HalfConnectedElementQuerySpecification.instance();
  }
  
  public HalfConnectedElementMatcher getHalfConnectedElement(final IncQueryEngine engine) throws IncQueryException {
    return HalfConnectedElementMatcher.on(engine);
  }
  
  public UnconnectedRailQuerySpecification getUnconnectedRail() throws IncQueryException {
    return UnconnectedRailQuerySpecification.instance();
  }
  
  public UnconnectedRailMatcher getUnconnectedRail(final IncQueryEngine engine) throws IncQueryException {
    return UnconnectedRailMatcher.on(engine);
  }
}
