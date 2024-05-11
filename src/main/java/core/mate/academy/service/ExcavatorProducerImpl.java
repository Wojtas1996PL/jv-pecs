package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List list = new ArrayList();
        list.add(new Excavator("excavator 1", "black", "big"));
        list.add(new Excavator("excavator1", "yellow", "small"));
        list.add(new Excavator("excavator3", "green", "long"));
        return list;
    }
}
