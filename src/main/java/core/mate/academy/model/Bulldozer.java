package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String blade;

    public Bulldozer() {
        super();
    }

    public Bulldozer(String blade) {
        super();
        this.blade = blade;
    }

    public String getBlade() {
        return blade;
    }

    public void setBlade(String blade) {
        this.blade = blade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
