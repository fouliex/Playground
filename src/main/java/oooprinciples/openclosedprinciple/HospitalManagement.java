package oooprinciples.openclosedprinciple;

import oooprinciples.openclosedprinciple.domain.Doctor;
import oooprinciples.openclosedprinciple.domain.Employee;
import oooprinciples.openclosedprinciple.domain.Nurse;

/**
 * This class violate SRP which make it unbearable to look at and violate OCP
 * <p>
 * Created by fouli on 10/15/2016.
 */
public class HospitalManagement {

    public void callUpon(Employee employee) {
        if (employee instanceof Nurse) {
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();
        } else if (employee instanceof Doctor) {
            prescribeMedicine();
            diagnosePatients();
        }

    }

    /**
     *  Junk Drawer below
     */

    //Nurses
    private void checkVitalSigns() {
        System.out.println("Checking Vital signs");
    }

    private void drawBlood() {
        System.out.println("drawing blood");
    }

    private void cleanPatientArea(){
        System.out.println("Cleaning Patient area");
    }

    //Doctors
    private void prescribeMedicine() {
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients() {
        System.out.println("Diagnosing Patient");
    }
}
