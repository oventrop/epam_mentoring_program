package pre_training_module.task2.tools;

import pre_training_module.task2.vehicles.Vehicle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteToFile {

    private final static Path PATH = Paths.get("\\resources\\testfile.txt");

    public void writeToFileSingleVehicle(Vehicle vehicle) {

        byte[] string = vehicle.toString().getBytes();
        try {
            Files.write(PATH, string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFileAllVehicles(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            writeToFileSingleVehicle(vehicle);
        }

    }
}
