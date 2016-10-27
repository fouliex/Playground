package oooprinciples.liskovsubtitutionprinciple;

/**
 * Created by fouli on 10/16/2016.
 */
public class EnglishTeacher  extends Teacher{
    @Override
    public void teach() {
        System.out.println("Taught Math");
    }
}
