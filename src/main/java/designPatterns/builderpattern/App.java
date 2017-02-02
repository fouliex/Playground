package designPatterns.builderpattern;

/**
 * Created by fouli on 11/6/2016.
 */
public class App {
    public static void main(String[] args) {
        User websiteUser = new User.Builder("bobMax", "bobMax@gmail.com").
                firstName("Bob").
                lastName("Max").
                phoneNumber(5555).
                address("Haiti").
                build();

        System.out.println(websiteUser);
    }
}
