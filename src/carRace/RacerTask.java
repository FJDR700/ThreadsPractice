package carRace;
public class RacerTask implements Runnable {

    private final Racer racer;
    public RacerTask(Racer racer) {this.racer = racer;}

    @Override
    public void run() {racer.drive();}

}
