package oooprinciples.singleresponsibility.domain.dao;

import oooprinciples.singleresponsibility.database.DatabaseConnectionManager;
import oooprinciples.singleresponsibility.domain.Employee;

/**
 * Created by fouli on 10/11/2016.
 */
public class EmployeeDAO {
    DatabaseConnectionManager connectionManager;

    public void saveEmployee(Employee emp) {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
        connectionManager.connect();
        // TODO add query
        connectionManager.getConnectionObject();
        connectionManager.disconnect();
        System.out.println("save employee to the database " + emp);
    }

    public void deleteEmploye(Employee emp) {
        System.out.println("delete employee from the database " + emp );

    }
}
