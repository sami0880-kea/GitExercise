import java.util.Scanner;

public class SuperGreeter {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        SuperGreeter SG = new SuperGreeter();
        SG.start();
        SG.greet();
        SG.stupidMethod();
    }

    public void start() {
        System.out.println("Det virker!");
    }

    public void greet() {
        System.out.print("Indtast dit navn: ");
        String navn = sc.next();
        System.out.println("Hej med dig, " + navn);
    }

    public void stupidMethod() {
        System.out.println("This method is stupid");
    }
}
