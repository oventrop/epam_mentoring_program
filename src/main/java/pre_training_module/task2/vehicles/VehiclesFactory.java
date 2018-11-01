package pre_training_module.task2.vehicles;

import pre_training_module.task2.vehicles.cargovehicle.CargoTaxi;
import pre_training_module.task2.vehicles.passvehicles.Bus;
import pre_training_module.task2.vehicles.passvehicles.MiniVan;
import pre_training_module.task2.vehicles.passvehicles.PassengerTaxi;

public class VehiclesFactory {

    public Vehicle getMiniVan(String name, int totalRoute, int vehiclePrice) {
        return new MiniVan(name, totalRoute, vehiclePrice);
    }

    public Vehicle getTaxi(String name, int totalRoute, int vehiclePrice) {
        return new PassengerTaxi(name, totalRoute, vehiclePrice);
    }

    public Vehicle getBus(String name, int totalRoute, int vehiclePrice) {
        return new Bus(name, totalRoute, vehiclePrice);
    }

    public Vehicle getCargoTaxi(String name, int totalRoute, int vehiclePrice) {
        return new CargoTaxi(name, totalRoute, vehiclePrice);
    }
}
