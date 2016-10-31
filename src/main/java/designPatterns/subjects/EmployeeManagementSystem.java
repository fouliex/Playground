package designPatterns.subjects;


import designPatterns.domain.EmployeeDAO;
import designPatterns.domain.Employee;
import designPatterns.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fouli on 10/30/2016.
 */
public class EmployeeManagementSystem implements ISubject {
    private Employee employee;
    private String msg;
    private EmployeeDAO employeeDAO;
    private List<IObserver> observers;
    private List<Employee> employees;


    public EmployeeManagementSystem() {
        observers = new ArrayList<>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    public void modifyEmployeeName(int id, String newName) {
        boolean notify = false;
        for (Employee emp : employees) {
            if (id == emp.employeeID) {
                emp.setName(newName);
                employee = emp;
                msg = "Employee Name Changed";
                notify = true;
            }
        }
        if (notify) {
            notifyObservers();
        }
    }

    public void hireNewEmployee(Employee emp) {
        employee = emp;
        msg = "New Hire";
        notifyObservers();
    }

    @Override
    public void registerObserver(IObserver addMe) {
        observers.add(addMe);
    }

    @Override
    public void removeObserver(IObserver removeMe) {
        int removeIndex = observers.indexOf(removeMe);
        observers.remove(removeIndex);
    }

    

    @Override
    public void notifyObservers() {

    }
}
