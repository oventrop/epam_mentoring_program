package pre_training_module.task2.vehicles;

import pre_training_module.task2.vehicles.cargovehicle.CargoTaxi;
import pre_training_module.task2.vehicles.passvehicles.Bus;
import pre_training_module.task2.vehicles.passvehicles.MiniVan;
import pre_training_module.task2.vehicles.passvehicles.PassengerTaxi;

public class VehiclesFactory {

    public Vehicle getMiniVan() {
        return new MiniVan();
    }

    public Vehicle getTaxi() {
        return new PassengerTaxi();
    }

    public Vehicle getBus() {
        return new Bus();
    }

    public Vehicle getCargoTaxi(String name, int totalRoute, int vehiclePrice) {
        return new CargoTaxi();
    }
}
