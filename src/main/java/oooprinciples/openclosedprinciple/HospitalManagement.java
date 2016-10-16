package oooprinciples.openclosedprinciple;

import oooprinciples.openclosedprinciple.domain.Employee;

/**
 * This class is now conforming with OCP
 * <p>
 * Created by fouli on 10/15/2016.
 */
public class HospitalManagement {

    public void callUpon(Employee employee) {
        employee.performDuties();
    }



}
