package oooprinciples.singleresponsibility.clients;

import oooprinciples.singleresponsibility.reporting.EmployeeReportFormatter;
import oooprinciples.singleresponsibility.domain.Employee;
import oooprinciples.singleresponsibility.domain.dao.EmployeeDAO;

/**
 * Created by fouli on 10/11/2016.
 */
public class ClientModule {
    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee emplpyee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmploye(emplpyee);
    }

    public static void printEmployeeReport(Employee employee){
        EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter();
        employeeReportFormatter.getFormattedEmployee();
    }

    public static void main(String[] args) {
        Employee george = new Employee(1, "George", "Software", true);
        ClientModule.hireNewEmployee(george);
        ClientModule.terminateEmployee(george);

    }
}
