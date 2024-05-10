package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private List list = new ArrayList();

    @Override
    public List<Bulldozer> get() {
        list.add(new Bulldozer("big"));
        list.add(new Bulldozer("small"));
        list.add(new Bulldozer("long"));
        return list;
    }
}
