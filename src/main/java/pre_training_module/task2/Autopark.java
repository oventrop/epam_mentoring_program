package pre_training_module.task2;

import pre_training_module.task2.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Autopark {

    private List<Vehicle> vehicles = new ArrayList<>();
    private String autoparkAdress;
    private int autoparkArea;

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getAutoparkAdress() {
        return autoparkAdress;
    }

    public void setAutoparkAdress(String autoparkAdress) {
        this.autoparkAdress = autoparkAdress;
    }

    public int getAutoparkArea() {
        return autoparkArea;
    }

    public void setAutoparkArea(int autoparkArea) {
        this.autoparkArea = autoparkArea;
    }
}
