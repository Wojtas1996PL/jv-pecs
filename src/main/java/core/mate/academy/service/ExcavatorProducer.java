package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator("big");
    private Excavator excavator2 = new Excavator("small");
    private Excavator excavator3 = new Excavator("long");
    private List list = new ArrayList();

    @Override
    public List<Excavator> get() {
        list.add(excavator1);
        list.add(excavator2);
        list.add(excavator3);
        return list;
    }
}
