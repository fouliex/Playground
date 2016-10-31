package designPatterns.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fouli on 10/30/2016.
 */
public class EmployeeDAO {

    //Fake data
    Employee emp1 = new Employee("Mike", null, 5000, 1, false);
    Employee emp2 = new Employee("Steve", null, 4500, 2, false);
    Employee emp3 = new Employee("John", null, 7000, 3, false);
    Employee emp4 = new Employee("Pat", null, 6000, 4, false);

    List<Employee> employees;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp3);
        employees.add(emp4);
        return employees;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}
