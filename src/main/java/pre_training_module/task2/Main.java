package pre_training_module.task2;

import pre_training_module.task2.tools.ReadFromFile;
import pre_training_module.task2.vehicles.Vehicle;
import pre_training_module.task2.vehicles.VehiclesFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autopark autopark = new Autopark();
        autopark.setAutoparkAdress("adress");
        autopark.setAutoparkArea(10000);
//
//        List<Vehicle> vehicles = new ArrayList<>();
//        VehiclesFactory factory = new VehiclesFactory();

        List<Vehicle> vehicles = new ReadFromFile().getVehiclesFromFile("D:\\_WORKSPACE\\epam_mentoring_program\\src\\main\\resources\\vehicles.json");
        autopark.setVehicles(vehicles);

    }
}
