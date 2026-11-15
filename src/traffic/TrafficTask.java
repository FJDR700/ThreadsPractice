package traffic;
public class TrafficTask implements Runnable{

    private final Traffic traffic;
    private final int numberOfCars;

    public TrafficTask(Traffic traffic, int numberOfCars) {
        this.traffic = traffic;
        this.numberOfCars = numberOfCars;
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfCars; i++) {
            traffic.addCar();
            traffic.addCarSafely();
        }
    }
}
