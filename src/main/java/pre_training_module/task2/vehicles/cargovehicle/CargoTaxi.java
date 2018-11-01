package pre_training_module.task2.vehicles.cargovehicle;

public class CargoTaxi extends CargoVehicle {

    private static final int MAX_CARGO_WEIGHT = 25;

    public CargoTaxi(String name, int totalRoute, int vehiclePrice) {
        super(name, totalRoute, vehiclePrice, MAX_CARGO_WEIGHT);
    }

    @Override
    public String toString() {
        return "This is a MINIVAN, max passengers " + MAX_CARGO_WEIGHT + ", current cargo weight " + getCurrentCargo();
    }
}
