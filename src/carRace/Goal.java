package carRace;
public class Goal {
    private String name = "";
    private int place = 1;

    public synchronized void setName(String name) {
        this.name += "\n"+name+" in place "+place;
        place++;
    }

    public String getWinner() {return name;}
}
