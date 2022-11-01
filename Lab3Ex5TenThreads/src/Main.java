import Exercise5.MyThread;
public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        //Thread thread = Thread.currentThread();

        String threadName = Thread.currentThread().getName();
        System.out.println("Nume: " + threadName);

        for (int i=0;i<10;i++)
        {
            MyThread myThread2 = new MyThread(i);
            myThread2.start();
        }
    }
}
