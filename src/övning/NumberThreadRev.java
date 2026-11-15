package övning;

public class NumberThreadRev implements Runnable {
    @Override
    public void run() {
        for(int i=10;i>0;i--){
            System.out.println("Räknar ner: "+i);
            try {Thread.sleep(1000);}
            catch (InterruptedException e) {}
        }
    }
}
