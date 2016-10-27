package oooprinciples.liskovsubtitutionprinciple;

/**
 * Created by fouli on 10/16/2016.
 */
public abstract class Teacher {

    public abstract void teach();

    private void makeAnnouncements() {
        System.out.println("made annoucnements..");
    }

    private void takeAttendence() {
        System.out.println("took attendence..");
    }

    private void collectPaperWork() {
        System.out.println("collected paperwork..");
    }
    private void conducHallwayDuties(){
        System.out.println("conducted hallway duties..");
    }

    private void perfomotherResponsabilites() {
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conducHallwayDuties();

    }
}
