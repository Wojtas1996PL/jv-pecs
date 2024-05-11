package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final String BULLDOZER_CLASS_NAME = "core.mate.academy.model.Bulldozer";
    private static final String EXCAVATOR_CLASS_NAME = "core.mate.academy.model.Excavator";
    private static final String TRUCK_CLASS_NAME = "core.mate.academy.model.Truck";

    @Override
    public List getAll(Class<? extends Machine> type) {
        /*
        If I parametrize "Class<? extends Machine>", I can't parametrize
        "List<? extends Machine>". I am getting this information:
        "getAll(Class<? extends Machine>)' in 'core.mate.academy.service.MachineServiceImpl'
        clashes with 'getAll(Class<? extends Machine>)'
        in 'core.mate.academy.service.MachineService'; attempting to use incompatible return type"
         */
        String typeName = type.getName();
        switch (typeName) {
            case(BULLDOZER_CLASS_NAME):
                BulldozerProducerImpl bulldozerProducer = new BulldozerProducerImpl();
                return bulldozerProducer.get();
            case(EXCAVATOR_CLASS_NAME):
                ExcavatorProducerImpl excavatorProducer = new ExcavatorProducerImpl();
                return excavatorProducer.get();
            case(TRUCK_CLASS_NAME):
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
    public void fill(List<? super Machine> listOfMachines, Machine value) {
        for (int i = 0; i < listOfMachines.size(); i++) {
            listOfMachines.set(i, value);
        }
    }
}
