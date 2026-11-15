package övning;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MessageThread());
        Thread thread2 = new Thread(new NumberThread());
        Thread thread3 = new Thread(new NumberThreadRev());

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Alla trådar är klara!");

    }
}
