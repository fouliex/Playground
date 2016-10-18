package oooprinciples.liskovsubstitutionprinciple;

/**
 * Created by George Fouche on 10/18/16.
 */
public class MathTeacher extends SchoolStaff implements CourseInstructor {
    @Override
    public void teach() {
        System.out.println("Taught Math");
    }
}
