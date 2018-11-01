package pre_training_module.task2.vehicles.passvehicles;

public class Bus extends PassengerVehicle {

    private static final int MAX_PASS = 50;

    public Bus(String name, int totalRoute, int vehiclePrice) {
        super(name, totalRoute, vehiclePrice, MAX_PASS);
    }

    @Override
    public String toString() {
        return "This is a Bus, max passengers " + MAX_PASS + ", current passangers " + getCurrentPassengers();
    }
}
