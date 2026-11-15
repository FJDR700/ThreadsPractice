package carRace;
import java.util.Random;

public class Racer {
    private final String racerName;
    private final int roadMeters;
    private final Goal winner;

    public Racer(String racerName, int roadMeters, Goal winner) {
        this.racerName = racerName;
        this.roadMeters = roadMeters;
        this.winner = winner;
    }

    public synchronized void drive(){
        for (int i = 0; i < roadMeters; i++) {
            System.out.println(racerName + ": "+(i+1)+" m");
            Random randSpeed = new Random();
            try {Thread.sleep(randSpeed.nextInt(1000));}
            catch (InterruptedException e) {}
        }
        winner.setName(racerName);
    }
}
