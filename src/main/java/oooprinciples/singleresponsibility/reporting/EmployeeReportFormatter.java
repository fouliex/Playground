package oooprinciples.singleresponsibility.reporting;

import oooprinciples.singleresponsibility.domain.Employee;

/**
 * Created by fouli on 10/11/2016.
 */
public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
