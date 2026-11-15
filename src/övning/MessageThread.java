package övning;

public class MessageThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Jag arbetar!");
            try {Thread.sleep(2000);}
            catch (InterruptedException e) {}
        }
    }
}
