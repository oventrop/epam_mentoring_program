package pre_training_module.task2;

import pre_training_module.task2.tools.GetVehiclesByType;
import pre_training_module.task2.vehicles.Vehicle;
import pre_training_module.task2.vehicles.passvehicles.PassengerTaxi;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Autopark autopark = new Autopark();
        autopark.setAutoparkAdress("adress");
        autopark.setAutoparkArea(10000);

        List<Vehicle> allVehicles = new GetVehiclesByType().getAllVehicles();
        List<Vehicle> allTaxi = new GetVehiclesByType().getTaxi();

        autopark.setVehicles(allVehicles);
        autopark.getVehicles().get(1).setDailyRoute(250);
        System.out.println(autopark.getVehicles().get(1).toString());
    }
}
