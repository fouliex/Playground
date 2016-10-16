package oooprinciples.opencloseprinciple2.user;

import oooprinciples.opencloseprinciple2.devices.Projector;
import oooprinciples.opencloseprinciple2.devices.SurroundSoundSystem;
import oooprinciples.opencloseprinciple2.devices.TV;
import oooprinciples.opencloseprinciple2.remotes.RemoteControl;

/**
 * Created by fouli on 10/15/2016.
 */
public class Person {
    public static void main(String[] args) {
        //Devices in the home

        Projector benQProjector = new Projector();
        TV samsungTV = new TV();
        SurroundSoundSystem logitechSurroudSoundSystem = new SurroundSoundSystem();
        RemoteControl remoteControl = RemoteControl.getInstance();


        System.out.println("");
        remoteControl.connectToDevice(benQProjector);
        remoteControl.clickOnButton();
        remoteControl.clickOffButton();

        System.out.println("");
        remoteControl.connectToDevice(samsungTV);
        remoteControl.clickOnButton();
        remoteControl.clickOnButton();


        System.out.println("");
        remoteControl.connectToDevice(logitechSurroudSoundSystem);
        remoteControl.clickOnButton();
        remoteControl.clickOnButton();


    }
}
