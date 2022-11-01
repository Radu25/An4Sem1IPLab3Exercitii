package Exercise5;

public class MyThread extends Thread {

    int name;

    public MyThread()
    {
    }

    public MyThread(int name)
    {
        this.name = name;
    }

    public void run(){
        System.out.println("MyThread name: " + name);
    }
}
