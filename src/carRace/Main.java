package carRace;
import java.util.*;
public class Main {
    static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        final int MAX_METERS = 100, MAX_RACERS = 4;
        Goal winners = new Goal();

        for (int i = 0; i < MAX_RACERS; i++) {
            RacerTask task = new RacerTask(new Racer("Racer no. "+(i+1), MAX_METERS, winners));
            Thread thread = new Thread(task);
            threads.add(thread);
        }

        for (Thread thread : threads) {thread.start();}
        for (Thread thread : threads) {thread.join();}

        System.out.println("\nWinners: "+winners.getWinner());

    }
}
