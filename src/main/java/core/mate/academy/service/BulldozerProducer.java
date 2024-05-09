package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer1 = new Bulldozer("big");
    private Bulldozer bulldozer2 = new Bulldozer("small");

    private Bulldozer bulldozer3 = new Bulldozer("long");
    private List list = new ArrayList();

    @Override
    public List<Bulldozer> get() {
        list.add(bulldozer1);
        list.add(bulldozer2);
        list.add(bulldozer3);
        return list;
    }
}
