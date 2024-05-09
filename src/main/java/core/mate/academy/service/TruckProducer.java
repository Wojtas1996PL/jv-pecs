package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck("big");
    private Truck truck2 = new Truck("small");
    private Truck truck3 = new Truck("long");
    private List list = new ArrayList();

    @Override
    public List<Truck> get() {
        list.add(truck1);
        list.add(truck2);
        list.add(truck3);
        return list;
    }
}
