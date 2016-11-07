package designPatterns.oberverpattern.domain;

import java.util.Date;

/**
 * Created by fouli on 10/30/2016.
 */
public class Employee {
    private String name;
    private Date hireDate;
    private int salary;
    public int employeeID;
    private boolean working = false;

    private static int COUNTER;


    public Employee(String name, Date hireDate, int salary, int employeeID, boolean working) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.employeeID = employeeID;
        this.working = working;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getEmployeeID() {
        return employeeID;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                ", working=" + working +
                '}';
    }
}
