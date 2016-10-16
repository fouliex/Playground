package oooprinciples.opencloseprinciple2.devices;

/**
 * Created by fouli on 10/15/2016.
 */
public class Projector implements Device {

    @Override
    public String toString() {
        return "Projector ";
    }

    @Override
    public void turnOn() {
      pullDownProjectorScreen();
        System.out.println("Projector has been turned on.");
    }

    @Override
    public void turnOff() {
        pullUpProjectorScreen();
        System.out.println("Projector has been turn off.");
    }

    /**
     * Below are additional steps that may be required for you to operate your device
     */
    private void pullDownProjectorScreen() {
        System.out.println("Screen has been lowered for viewing");
    }

    private void pullUpProjectorScreen() {
        System.out.println("Screen raised back up to close");
    }


}
