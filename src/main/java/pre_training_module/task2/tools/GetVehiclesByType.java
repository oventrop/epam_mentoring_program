package pre_training_module.task2.tools;

import pre_training_module.task2.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GetVehiclesByType {

    private static final String PATH = "src/main/resources/vehicles.json";
    private List<Vehicle> vehicles;

    public GetVehiclesByType() {
        vehicles = new GetVehiclesFromFile().getVehiclesFromFile(PATH);
    }

    public List<Vehicle> getTaxi() {
        List<Vehicle> passengerVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles)
            if (vehicle.getName().contains("taxi")) {
                passengerVehicles.add(vehicle);
            }
        return passengerVehicles;
    }

    public List<Vehicle> getMiniVans() {
        List<Vehicle> miniVans = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getName().contains("minivan")) miniVans.add(vehicle);
        }
        return miniVans;
    }

    public List<Vehicle> getBuses() {
        List<Vehicle> buses = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getName().contains("bus")) buses.add(vehicle);
        }
        return buses;
    }

    public List<Vehicle> getCargoTaxi() {
        List<Vehicle> cargoTaxis = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getName().contains("bus")) cargoTaxis.add(vehicle);
        }
        return cargoTaxis;
    }

    public List<Vehicle> getAllVehicles() {
        List<Vehicle> allVehicles = new ArrayList<>();
        allVehicles.addAll(getTaxi());
        allVehicles.addAll(getMiniVans());
        allVehicles.addAll(getBuses());
        allVehicles.addAll(getCargoTaxi());

        return allVehicles;
    }
}
