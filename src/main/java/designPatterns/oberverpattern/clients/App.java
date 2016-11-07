package designPatterns.oberverpattern.clients;

import designPatterns.oberverpattern.domain.Employee;
import designPatterns.oberverpattern.observers.HRDepartment;
import designPatterns.oberverpattern.observers.IObserver;
import designPatterns.oberverpattern.observers.PayrollDepartment;
import designPatterns.oberverpattern.subjects.EmployeeManagementSystem;

import java.util.Date;

/**
 * Created by fouli on 10/30/2016.
 */
public class App {
    public static void main(String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee george = new Employee("George",new Date(),35000,7,true);
        ems.hireNewEmployee(george);


        ems.modifyEmployeeName(7,"Erol");
        ems.modifyEmployeeName(1,"Stephane");
    }
}
