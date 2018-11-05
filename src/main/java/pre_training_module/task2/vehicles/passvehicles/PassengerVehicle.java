package pre_training_module.task2.vehicles.passvehicles;

import pre_training_module.task2.exceptions.WrongPassengersCountException;
import pre_training_module.task2.vehicles.Vehicle;

public abstract class PassengerVehicle extends Vehicle {

    private int maxPassengers;
    private int currentPassengers = 0;

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) throws WrongPassengersCountException {
        if (currentPassengers > maxPassengers) throw new WrongPassengersCountException("Max passengers limit reached");
        else this.currentPassengers = currentPassengers;
    }

    @Override
    public String toString() {
        return "PassengerVehicle{" +
                "maxPassengers=" + maxPassengers +
                ", currentPassengers=" + currentPassengers +
                '}';
    }
}
