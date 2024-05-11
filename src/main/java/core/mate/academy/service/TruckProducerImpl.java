package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List list = new ArrayList();
        list.add(new Truck("truck1", "green", "big"));
        list.add(new Truck("truck2", "yellow", "small"));
        list.add(new Truck("truck3", "black", "long"));
        return list;
    }
}
