package pre_training_module.task2.vehicles.passvehicles;

import com.fasterxml.jackson.annotation.JsonProperty;
import pre_training_module.task2.vehicles.Vehicle;

public class PassengerTaxi extends PassengerVehicle {

    private static final int MAX_PASS = 4;

    @Override
    public String toString() {
        return "This is a casual TAXI, max passengers " + MAX_PASS + ", current passangers ";
    }
}
