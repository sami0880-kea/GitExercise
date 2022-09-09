import java.util.Scanner;

public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter SG = new SuperGreeter();
        SG.start();
        SG.greet();
    }

    public void start() {
        System.out.println("Det virker!");
    }

    public void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indtast dit navn: ");
        String navn = sc.next();
        System.out.println("Hej med dig, " + navn);
    }
}
