package oooprinciples.liskovsubstitutionprinciple;

/**
 * Created by George Fouche on 10/18/16.
 */
public class School {
    public static void main(String[] args) {
        MathTeacher stephane = new MathTeacher();
        stephane.teach();
        stephane.performOtherResponsibilities();

        System.out.println("");
        SchoolStaff stephanie = new SubstituteTeacher();
        stephanie.performOtherResponsibilities();
    }
}
