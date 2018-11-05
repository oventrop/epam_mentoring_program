package pre_training_module.task2.vehicles.passvehicles;

public class MiniVan extends PassengerVehicle {

    private static final int MAX_PASS = 8;

    @Override
    public String toString() {
        return "This is a MINIVAN, max passengers " + MAX_PASS + ", current passangers " + getCurrentPassengers();
    }
}
