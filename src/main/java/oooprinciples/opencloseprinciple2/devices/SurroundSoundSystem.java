package oooprinciples.opencloseprinciple2.devices;

/**
 * Created by fouli on 10/15/2016.
 */
public class SurroundSoundSystem implements Device {
    @Override
    public void turnOn() {
        increaseVolume();
        switchToFavoriteCD();
        System.out.println("Surround sound system has been turned on");

    }

    @Override
    public void turnOff() {
        lowerVolume();
        System.out.println("Surround sound system has been turned off");
    }

    /**
     * Below are additional steps that are specific to the device
     */
    private void increaseVolume() {
        System.out.println("Volume has increased to a comfortable level on startup");
    }

    private void switchToFavoriteCD() {
        System.out.println("Jason Derulo-Ridin' Solo is now playing");
    }

    private void lowerVolume() {
        System.out.println("Lowering surround sound volume before closing system");
    }

    @Override
    public String toString() {
        return "SurroundSoundSystem";
    }
}
