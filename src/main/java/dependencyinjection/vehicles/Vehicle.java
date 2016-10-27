package dependencyinjection.vehicles;

import dependencyinjection.parts.Engine;

/**
 * Created by fouli on 10/26/2016.
 */
public class Vehicle {

    private Engine myEngine;

    public Vehicle(Engine myEngine) {
        this.myEngine = myEngine;
    }

    public void crankIgnition(){
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
