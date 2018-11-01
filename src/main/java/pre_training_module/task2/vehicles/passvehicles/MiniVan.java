package pre_training_module.task2.vehicles.passvehicles;

public class MiniVan extends PassengerVehicle {

    private static final int MAX_PASS = 8;

    public MiniVan(String name, int totalRoute, int vehiclePrice) {
        super(name, totalRoute, vehiclePrice, MAX_PASS);
    }

    @Override
    public String toString() {
        return "This is a MINIVAN, max passengers " + MAX_PASS + ", current passangers " + getCurrentPassengers();
    }
}
