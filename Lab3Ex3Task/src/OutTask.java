import java.util.Scanner;

public class OutTask implements Task {

    String str;

    OutTask()
    {
        System.out.print("Dati un string: ");
        Scanner scanner = new Scanner(System.in);
        this.str = scanner.nextLine();
    }

    @Override
    public void execute() {
        System.out.println(str);
    }
}