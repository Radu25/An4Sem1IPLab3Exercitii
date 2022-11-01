public class CounterOutTask implements Task {

    static int nr=0;

    @Override
    public void execute() {
        nr++;
        System.out.println(nr);
    }
}