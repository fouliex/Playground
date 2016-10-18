package oooprinciples.liskovsubstitutionprinciple;

/**
 * Created by George Fouche on 10/18/16.
 */
public class SchoolStaff {
    private void makeAnnouncements() {
        System.out.println("made announcements..");
    }

    private void takeAttendence() {
        System.out.println("took attendence..");
    }

    private void collectPaperWork() {
        System.out.println("collected paperwork..");
    }

    private void conductHallwayDuties() {
        System.out.println("conducted hallway duties..");
    }

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
    }

}
