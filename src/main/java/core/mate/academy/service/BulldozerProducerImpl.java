package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List list = new ArrayList();
        list.add(new Bulldozer("bulldozer1","black","big"));
        list.add(new Bulldozer("bulldozer2", "white", "small"));
        list.add(new Bulldozer("bulldozer3", "yellow", "long"));
        return list;
    }
}
