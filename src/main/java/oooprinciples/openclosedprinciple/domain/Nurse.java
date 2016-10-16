package oooprinciples.openclosedprinciple.domain;

import oooprinciples.openclosedprinciple.domain.Employee;

/**
 * Created by fouli on 10/15/2016.
 */
public class Nurse extends Employee {

    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurser in action...");
    }
}
