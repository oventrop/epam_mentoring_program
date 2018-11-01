package pre_training_module.task2.vehicles;

public class Vehicle implements Movable {
    private String name;
    private int totalRoute;
    private int vehiclePrice;
    private int dailyRoute;
    private int fuelConsumption;

    public Vehicle(String name, int totalRoute, int vehiclePrice) {
        this.name = name;
        this.totalRoute = totalRoute;
        this.vehiclePrice = vehiclePrice;
    }

    @Override
    public int getTotalRoute() {
        return totalRoute + dailyRoute;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
