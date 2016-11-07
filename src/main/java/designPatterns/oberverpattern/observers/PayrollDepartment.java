package designPatterns.oberverpattern.observers;

import designPatterns.oberverpattern.domain.Employee;

/**
 * Created by fouli on 10/30/2016.
 */
public class PayrollDepartment implements IObserver {

    @Override
    public void callMe(Employee employee, String msg) {
        System.out.println("Payroll department notified...");
        System.out.println(msg + ": " + employee.getName());

    }
}
