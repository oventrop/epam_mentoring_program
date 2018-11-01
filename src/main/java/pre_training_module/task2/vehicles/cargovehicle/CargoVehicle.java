package pre_training_module.task2.vehicles.cargovehicle;

import pre_training_module.task2.exceptions.WrongCargoWeightException;
import pre_training_module.task2.vehicles.Movable;
import pre_training_module.task2.vehicles.Vehicle;

public abstract class CargoVehicle extends Vehicle {

    private int maxCargoWeight;
    private int currentCargo;

    public CargoVehicle(String name, int totalRoute, int vehiclePrice, int maxCargoWeight) {
        super(name, totalRoute, vehiclePrice);
        this.maxCargoWeight = maxCargoWeight;
    }

    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public int getCurrentCargo() {
        return currentCargo;
    }

    public void setCurrentCargo(int currentCargo) throws WrongCargoWeightException {
        if (currentCargo > maxCargoWeight) throw new WrongCargoWeightException("Your cargo is greater than max");
        else this.currentCargo = currentCargo;
    }
}
