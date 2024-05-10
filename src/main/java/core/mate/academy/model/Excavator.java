package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String arm;

    public Excavator() {
        super();
    }

    public Excavator(String arm) {
        super();
        this.arm = arm;
    }

    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
