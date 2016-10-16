package oooprinciples.opencloseprinciple2.user;

import oooprinciples.opencloseprinciple2.devices.Projector;
import oooprinciples.opencloseprinciple2.devices.TV;
import oooprinciples.opencloseprinciple2.remotes.RemoteControl;

/**
 * Created by fouli on 10/15/2016.
 */
public class Person {
    public static void main(String[] args) {
        //Devices in the home
       RemoteControl remoteControl =RemoteControl.getInstance();
        remoteControl.connectToDevice(new Projector());

        remoteControl.clickOnButton();
        remoteControl.clickOffButton();
    }
}
