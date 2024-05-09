package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String arm;

    public Excavator() {
    }

    public Excavator(String arm) {
        this.arm = arm;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
