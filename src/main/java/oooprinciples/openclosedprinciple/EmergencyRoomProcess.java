package oooprinciples.openclosedprinciple;

import oooprinciples.openclosedprinciple.domain.Doctor;
import oooprinciples.openclosedprinciple.domain.Employee;
import oooprinciples.openclosedprinciple.domain.Nurse;
import oooprinciples.openclosedprinciple.domain.Technician;

/**
 * Created by fouli on 10/15/2016.
 */
public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse(1, "Peggy", "emergency", true);

        ERDirector.callUpon(peggy);

        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        ERDirector.callUpon(suzan);

        System.out.println("GEORGE + TEJ");
        Employee Tej = new Technician(2,"Tej","emergency",true);
        ERDirector.callUpon(Tej);
    }
}
