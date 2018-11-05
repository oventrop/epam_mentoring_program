package pre_training_module.task2.vehicles;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle {
    @JsonProperty
    private String name;
    @JsonProperty
    private int totalRoute;
    @JsonProperty
    private int vehiclePrice;
    @JsonProperty
    private int dailyRoute;
    @JsonProperty
    private int fuelConsumption;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalRoute() {
        return totalRoute;
    }

    public void setTotalRoute(int totalRoute) {
        this.totalRoute = totalRoute;
    }

    public int getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(int vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public int getDailyRoute() {
        return dailyRoute;
    }

    public void setDailyRoute(int dailyRoute) {
        this.dailyRoute = dailyRoute;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", totalRoute=" + totalRoute +
                ", vehiclePrice=" + vehiclePrice +
                ", dailyRoute=" + dailyRoute +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
