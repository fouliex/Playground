package umlinfo.association.aggregation;

import java.util.ArrayList;
import java.util.List;

/**
 * There's more to the Association relationship.Because we are noo discussing state,
 * it may be necessary to define the lifetime of the instances that make up the dependent object's state,
 * and how many of the associated class instances there are.
 * <p>
 * These modeling techniques refer to:
 * Aggregation/Composition
 * Multiplicity
 * <p>
 * <p>
 * Aggregation and Composition
 * A clear diamond adornment has been added to the source side of the relationship.This means that A1 aggregates a B1.
 * Aggregation describes an association where an instance of A1 contains a reference to an instance of B1 as part of the A1's state,
 * but the use of the specific instance of B1 is or may be shared among other aggregators.
 * <p>
 * A shared association means that the lifetime of the aggregated object, the instance of B1 in this case, is outside the scope of the referencing object.
 * Therefore, when  a specific instance of A1 goes out of scope(e.g. garbage collected),the instance of B1 does not(of necessity) go out of scope.
 * <p>
 * Aggregation implies a relationship where the child can exist independently of the parent
 * Example 1: Class(parent) and Student(child). Delete the Class and the Students still exist.
 * Example 2 : car -> Tires
 * The Tires can be taken off of the Car object and installed on a different one.
 * Also, if the car get totaled, the ries do not necessarily have to be destroyed.
 * <p>
 * <p>
 * Composition on the other hand defines a relationship where the scope of the containing object (an A1) and the contained object (a B1) is related.
 * When the containing object goes out of scope, then the contained object also goes out of scope.
 * The composition adornment looks like the aggregation adornment, except the composition adornment is darkened.
 * <p>
 * Composition implies a relationship where the child cannot exist independent of the parent.
 * Example 1: House(parent) and Room(Child). Rooms don't exist separate to a House.
 * Example 2: Body -> Blood Cell
 * When the Body object is destroyed the Blood Cells get destroyed with it
 * <p>
 * <p>
 * Multiplicity
 * The numeric adornments next to the association arrow indicate the number of instance involved in the association.
 * <p>
 * The example below says that one instance of Class A1 will always contain(state) references to many instances of class B1.
 * There is a range of available mutiplicity adornments that can be used, for example 0,1 ,0..1, 0..*,1..3, 1..*, and so forth.
 * <p>
 * Multiplicity may also be used when an association relationship shows aggregation or composition.
 * <p>
 * Created by fouli on 2/4/2017.
 */
public class A1 {
    private List b1List;

    public A1() {
        this.b1List = new ArrayList();
    }
    //...
}
