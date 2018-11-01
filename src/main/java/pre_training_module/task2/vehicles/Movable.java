package pre_training_module.task2.vehicles;

public interface Movable {

    int getTotalRoute();

    default String startEngine() {
        return "Engine started";
    }

    default String stopEngine() {
        return "Engine stopped";
    }
}