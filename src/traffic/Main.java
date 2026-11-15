package traffic;
import java.util.*;

public class Main {
    static void main(String[] args) throws InterruptedException {

        Traffic traffic = new Traffic();
        List<Thread> threads = new ArrayList<>();
            final int MAX_CARS = 1000, MAX_ROADS = 2;

        for (int i = 0; i < MAX_ROADS; i++) {
            TrafficTask task = new TrafficTask(traffic,MAX_CARS);
            Thread driver = new Thread(task, "Driver no. " + (i+1));
            threads.add(driver);
        }

        for (var driver : threads) {driver.start();}
        for (var driver : threads) {driver.join();}

        System.out.println("Total survived drivers in "+ MAX_ROADS +" roads:"+
                "\nWithout traffic lights: " + traffic.getCarsA()+" out of "+ MAX_CARS*MAX_ROADS +
                "\nWith traffic lights: " + traffic.getCarsB()+" out of "+ MAX_CARS*MAX_ROADS);
    }
}
