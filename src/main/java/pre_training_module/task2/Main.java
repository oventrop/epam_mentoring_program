package pre_training_module.task2;

import pre_training_module.task2.vehicles.Vehicle;
import pre_training_module.task2.vehicles.VehiclesFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autopark autopark = new Autopark();
        autopark.setAutoparkAdress("adress");
        autopark.setAutoparkArea(10000);

        List<Vehicle> vehicles = new ArrayList<>();
        VehiclesFactory factory = new VehiclesFactory();
        Vehicle minivan = factory.getCargoTaxi(10, 100);
        Vehicle taxi = factory.getTaxi(20, 50);
        Vehicle bus = factory.getBus(100, 100);
        Vehicle cargoTaxi = factory.getCargoTaxi(200, 300);

        vehicles.add(minivan);
        vehicles.add(taxi);
        vehicles.add(bus);

        autopark.setVehicles(vehicles);

    }
}
