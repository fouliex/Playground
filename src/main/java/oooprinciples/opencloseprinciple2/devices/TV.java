package oooprinciples.opencloseprinciple2.devices;

/**
 * Created by fouli on 10/15/2016.
 */
public class TV implements Device {


    @Override
    public void turnOn() {
        switchToFavoriteChannel();
        System.out.println("TV has been turned on");
    }

    @Override
    public void turnOff() {
        turnOnTVAlarm();
        System.out.println("Tv has been turned off");
    }

    /**
     * Below are additional steps that are specific to the device
     */
    private void switchToFavoriteChannel() {
        System.out.println("Switched to your favorite Channel");
    }

    private void turnOnTVAlarm() {
        System.out.println("TV Alarm set for you to wake up in the morning");
    }

    @Override
    public String toString() {
        return "TV";
    }
}
