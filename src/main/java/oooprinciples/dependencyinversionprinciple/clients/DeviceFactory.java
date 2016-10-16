package oooprinciples.dependencyinversionprinciple.clients;

import oooprinciples.dependencyinversionprinciple.processes.GeneralManufacturingProcess;
import oooprinciples.dependencyinversionprinciple.processes.LaptopManufacturingProcess;
import oooprinciples.dependencyinversionprinciple.processes.SmartphoneManufacturingProcess;

/**
 * Created by fouli on 10/16/2016.
 */
public class DeviceFactory  {

    public static void main(String[] args) {
        GeneralManufacturingProcess iphoneManufacturer = new SmartphoneManufacturingProcess("Iphone Process");
        iphoneManufacturer.lauchProcess();

        System.out.println("");
        GeneralManufacturingProcess manufacturer = new LaptopManufacturingProcess("Apple Mack Book");
        manufacturer.lauchProcess();
    }
}
