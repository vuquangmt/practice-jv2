package demothread;

public class SubRunnable implements Runnable{
    public void run(){
        for (int i = 0; i < 30; i++) {
            System.out.println("Sub Runnable i = " + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
        System.out.println("Main Done");
    }
}
