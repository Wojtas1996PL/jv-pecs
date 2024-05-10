package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    private static final String bulldozerClassName = "core.mate.academy.model.Bulldozer";
    private static final String ExcavatorClassName = "core.mate.academy.model.Excavator";
    private static final String TruckClassName = "core.mate.academy.model.Truck";

    @Override
    public List<? extends Machine> getAll(Class type) {
        String typeName = type.getName();
        switch (typeName) {
            case(bulldozerClassName):
                BulldozerProducerImpl bulldozerProducer = new BulldozerProducerImpl();
                return bulldozerProducer.get();
            case(ExcavatorClassName):
                ExcavatorProducerImpl excavatorProducer = new ExcavatorProducerImpl();
                return excavatorProducer.get();
            case(TruckClassName):
                TruckProducerImpl truckProducer = new TruckProducerImpl();
                return truckProducer.get();
            default:
                return new ArrayList<>();
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<Object> listOfMachines, Object value) {
        for (int i = 0; i < listOfMachines.size(); i++) {
            listOfMachines.set(i, value);
        }
    }
}
