package demothread;

public class SubThread1  extends Thread{
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Subthread i = " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
        System.out.println("");
    }
}