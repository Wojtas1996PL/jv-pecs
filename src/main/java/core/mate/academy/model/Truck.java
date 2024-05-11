package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String wheel;

    public Truck() {

    }

    public Truck(String name, String color, String wheel) {
        super(name, color);
        this.wheel = wheel;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
