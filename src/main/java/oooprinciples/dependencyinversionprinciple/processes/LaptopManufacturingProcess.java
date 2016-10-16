package oooprinciples.dependencyinversionprinciple.processes;

/**
 * Created by fouli on 10/16/2016.
 */
public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored laptop");
    }
}
