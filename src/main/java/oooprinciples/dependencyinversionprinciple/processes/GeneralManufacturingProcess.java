package oooprinciples.dependencyinversionprinciple.processes;

/**
 * Created by fouli on 10/16/2016.
 */
public abstract class GeneralManufacturingProcess {
    String processName;

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }

    protected abstract void assembleDevice();

    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();

    //Template method
    public void lauchProcess() {
        if (processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("no process name was specified");
        }
    }
}
