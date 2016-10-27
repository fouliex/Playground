package dependencyinjection.parts;

/**
 * Created by fouli on 10/26/2016.
 */
public class SmallEngine implements Engine {

    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("started small " + horsePower + "hp engine");

    }
}
