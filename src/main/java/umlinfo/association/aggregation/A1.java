package umlinfo.association.aggregation;

/**
 * There's more to the Association relationship.Because we are noo discussing state,
 * it may be necessary to define the lifetime of the instances that make up the dependent object's state,
 * and how many of the associated class instances there are.
 * <p>
 * These modeling techniques refer to:
 * Aggregation/Composition
 * Multiplicity
 * <p>
 *
 *Aggregation
 * A clear diamond adornment has been added to the source side of the relationship.This means that A1 aggregates a B1.
 * Aggregation describes an association where an instance of A1 contains a reference to an instance of B1 as part of the A1's state,
 * but the use of the specific instance of B1 is or may be shared among other aggregators.
 *
 * A shared association means that the lifetime of the aggregated object, the instance of B1 in this case, is outside the scope of the referencing object.
 * Therefore, when  a specific instance of A1 goes out of scope(e.g. garbage collected),the instance of B1 does not(of necessity) go out of scope.
 *
 * 
 *
 * Created by fouli on 2/4/2017.
 */
public class A1 {
}
