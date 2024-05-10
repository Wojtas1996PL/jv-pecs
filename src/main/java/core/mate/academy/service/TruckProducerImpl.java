package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private List list = new ArrayList();

    @Override
    public List<Truck> get() {
        list.add(new Truck("big"));
        list.add(new Truck("small"));
        list.add(new Truck("long"));
        return list;
    }
}
