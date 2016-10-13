package oooprinciples.singleresponsibility.reporting;

/**
 * Created by fouli on 10/11/2016.
 */
public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case XML:
                this.formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                this.formattedOutput = convertObjectToCSV(object);
                break;
        }
    }

    private String convertObjectToXML(Object object) {
        return "XML:<title>" + object.toString() + "</title";
    }

    private String convertObjectToCSV(Object object) {
        return "CSV: ,,, " + object.toString() + ",,,";
    }

    public String getFormattedValue() {
        return formattedOutput;
    }
}
