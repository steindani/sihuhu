/**
 */
package hu.bme.mit.rnd.sihuhu.sihuhu;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SihuhuFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface SihuhuPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sihuhu";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.rnd.sihuhu";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.rnd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SihuhuPackage eINSTANCE = hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.NamedElementImpl
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.WorldImpl <em>World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.WorldImpl
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getWorld()
	 * @generated
	 */
	int WORLD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__TRACKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__TRAINS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrackImpl
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__RAILS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__SWITCHES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrackElementImpl <em>Track Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrackElementImpl
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getTrackElement()
	 * @generated
	 */
	int TRACK_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__TRAIN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.RailImpl <em>Rail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.RailImpl
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getRail()
	 * @generated
	 */
	int RAIL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__NAME = TRACK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__TRAIN = TRACK_ELEMENT__TRAIN;

	/**
	 * The feature id for the '<em><b>Allowed To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__ALLOWED_TO = TRACK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allowed From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__ALLOWED_FROM = TRACK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__FROM = TRACK_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL__TO = TRACK_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_FEATURE_COUNT = TRACK_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_OPERATION_COUNT = TRACK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchImpl
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = TRACK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__TRAIN = TRACK_ELEMENT__TRAIN;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CONNECTIONS = TRACK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected Rails</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CONNECTED_RAILS = TRACK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ACTIVE_CONNECTION = TRACK_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = TRACK_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = TRACK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchConnectionImpl <em>Switch Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchConnectionImpl
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getSwitchConnection()
	 * @generated
	 */
	int SWITCH_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CONNECTION__NAME = RAIL__NAME;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CONNECTION__TRAIN = RAIL__TRAIN;

	/**
	 * The feature id for the '<em><b>Allowed To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CONNECTION__ALLOWED_TO = RAIL__ALLOWED_TO;

	/**
	 * The feature id for the '<em><b>Allowed From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CONNECTION__ALLOWED_FROM = RAIL__ALLOWED_FROM;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CONNECTION__FROM = RAIL__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CONNECTION__TO = RAIL__TO;

	/**
	 * The number of structural features of the '<em>Switch Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CONNECTION_FEATURE_COUNT = RAIL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Switch Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CONNECTION_OPERATION_COUNT = RAIL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrainImpl
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NEXT_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Tracks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ON_TRACKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SignalImpl
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next Rail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NEXT_RAIL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ENABLED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.rnd.sihuhu.sihuhu.World <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.World
	 * @generated
	 */
	EClass getWorld();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.rnd.sihuhu.sihuhu.World#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.World#getTracks()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Tracks();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.rnd.sihuhu.sihuhu.World#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.World#getTrains()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Trains();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Track#getRails <em>Rails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rails</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Track#getRails()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Rails();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Track#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switches</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Track#getSwitches()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Switches();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement <em>Track Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Element</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement
	 * @generated
	 */
	EClass getTrackElement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.TrackElement#getTrain()
	 * @see #getTrackElement()
	 * @generated
	 */
	EReference getTrackElement_Train();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail <em>Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Rail
	 * @generated
	 */
	EClass getRail();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getAllowedTo <em>Allowed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed To</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getAllowedTo()
	 * @see #getRail()
	 * @generated
	 */
	EReference getRail_AllowedTo();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getAllowedFrom <em>Allowed From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed From</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getAllowedFrom()
	 * @see #getRail()
	 * @generated
	 */
	EReference getRail_AllowedFrom();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getFrom()
	 * @see #getRail()
	 * @generated
	 */
	EReference getRail_From();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Rail#getTo()
	 * @see #getRail()
	 * @generated
	 */
	EReference getRail_To();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getConnections()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Connections();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getConnectedRails <em>Connected Rails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Rails</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getConnectedRails()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_ConnectedRails();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getActiveConnection <em>Active Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Connection</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Switch#getActiveConnection()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_ActiveConnection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection <em>Switch Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Connection</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.SwitchConnection
	 * @generated
	 */
	EClass getSwitchConnection();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Train#getNextElement <em>Next Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Element</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Train#getNextElement()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_NextElement();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Train#getOnTracks <em>On Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Tracks</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Train#getOnTracks()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_OnTracks();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Signal#getNextRail <em>Next Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Rail</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Signal#getNextRail()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_NextRail();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.rnd.sihuhu.sihuhu.Signal#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.Signal#isEnabled()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Enabled();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.rnd.sihuhu.sihuhu.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.rnd.sihuhu.sihuhu.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.rnd.sihuhu.sihuhu.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SihuhuFactory getSihuhuFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.WorldImpl <em>World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.WorldImpl
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getWorld()
		 * @generated
		 */
		EClass WORLD = eINSTANCE.getWorld();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__TRACKS = eINSTANCE.getWorld_Tracks();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__TRAINS = eINSTANCE.getWorld_Trains();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrackImpl
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Rails</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__RAILS = eINSTANCE.getTrack_Rails();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__SWITCHES = eINSTANCE.getTrack_Switches();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrackElementImpl <em>Track Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrackElementImpl
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getTrackElement()
		 * @generated
		 */
		EClass TRACK_ELEMENT = eINSTANCE.getTrackElement();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_ELEMENT__TRAIN = eINSTANCE.getTrackElement_Train();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.RailImpl <em>Rail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.RailImpl
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getRail()
		 * @generated
		 */
		EClass RAIL = eINSTANCE.getRail();

		/**
		 * The meta object literal for the '<em><b>Allowed To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL__ALLOWED_TO = eINSTANCE.getRail_AllowedTo();

		/**
		 * The meta object literal for the '<em><b>Allowed From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL__ALLOWED_FROM = eINSTANCE.getRail_AllowedFrom();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL__FROM = eINSTANCE.getRail_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL__TO = eINSTANCE.getRail_To();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchImpl
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__CONNECTIONS = eINSTANCE.getSwitch_Connections();

		/**
		 * The meta object literal for the '<em><b>Connected Rails</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__CONNECTED_RAILS = eINSTANCE.getSwitch_ConnectedRails();

		/**
		 * The meta object literal for the '<em><b>Active Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__ACTIVE_CONNECTION = eINSTANCE.getSwitch_ActiveConnection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchConnectionImpl <em>Switch Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SwitchConnectionImpl
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getSwitchConnection()
		 * @generated
		 */
		EClass SWITCH_CONNECTION = eINSTANCE.getSwitchConnection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.TrainImpl
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>Next Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__NEXT_ELEMENT = eINSTANCE.getTrain_NextElement();

		/**
		 * The meta object literal for the '<em><b>On Tracks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__ON_TRACKS = eINSTANCE.getTrain_OnTracks();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SignalImpl
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Next Rail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__NEXT_RAIL = eINSTANCE.getSignal_NextRail();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__ENABLED = eINSTANCE.getSignal_Enabled();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.rnd.sihuhu.sihuhu.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.NamedElementImpl
		 * @see hu.bme.mit.rnd.sihuhu.sihuhu.impl.SihuhuPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //SihuhuPackage
