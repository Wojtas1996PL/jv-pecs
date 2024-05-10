package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private List list = new ArrayList();

    @Override
    public List<Excavator> get() {
        list.add(new Excavator("big"));
        list.add(new Excavator("small"));
        list.add(new Excavator("long"));
        return list;
    }
}
