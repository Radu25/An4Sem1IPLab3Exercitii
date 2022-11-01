public class RandomOutTask implements Task {

    int nr;

    RandomOutTask()
    {
        nr = (int)(Math.random()*100);
    }

    @Override
    public void execute() {
        System.out.println(nr);
    }
}