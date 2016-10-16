package oooprinciples.opencloseprinciple2.remotes;

import oooprinciples.opencloseprinciple2.devices.Device;

/**
 * Created by fouli on 10/15/2016.
 */
public class RemoteControl {
    private Device device;
    private static final RemoteControl INSTANCE = new RemoteControl();

    private RemoteControl() {

    }

    public static RemoteControl getInstance() {
        return INSTANCE;
    }

    public void connectToDevice(Device aDevice) {
        this.device = aDevice;
        System.out.println("--- connected to: " + device + "---");
    }

    public void clickOffButton() {
        device.turnOff();
    }

    public void clickOnButton() {
        device.turnOn();
    }

}
