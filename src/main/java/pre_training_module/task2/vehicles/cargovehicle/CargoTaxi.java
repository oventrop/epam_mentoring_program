package pre_training_module.task2.vehicles.cargovehicle;

public class CargoTaxi extends CargoVehicle {

    private static final int MAX_CARGO_WEIGHT = 25;

    @Override
    public String toString() {
        return "This is a cargoTAXI, max passengers " + MAX_CARGO_WEIGHT + ", current cargo weight " + getCurrentCargo();
    }
}
