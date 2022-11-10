package demothread;

public class Main {
    public static void main(String[] args){
        SubThread1 st1 = new SubThread1();
        st1.start();

        SubRunnable r= new SubRunnable();
        Thread t = new Thread(r);
        t.start();

        for (int i=0;i<20;i++){
            System.out.println("Main i = "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
        System.out.println("Main Done");
    }
}
