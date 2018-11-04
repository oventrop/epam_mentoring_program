package pre_training_module.task2.tools;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pre_training_module.task2.vehicles.Vehicle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {

    public List<Vehicle> getVehiclesFromFile(String fileName) {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            byte[] jsonData = Files.readAllBytes(Paths.get(fileName));
            return objectMapper.readValue(jsonData, new TypeReference<List<Vehicle>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}