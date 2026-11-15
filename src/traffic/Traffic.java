package traffic;
public class Traffic {
    int carsA = 0, carsB = 0;
    public void addCar() {carsA++;}
    public synchronized void addCarSafely() {carsB++;}
    public int getCarsA() {return carsA;}
    public int getCarsB() {return carsB;}
}
