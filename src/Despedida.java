import java.util.Scanner;

public class Despedida {
    public void despedir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Hasta luego " + nombre);
    }
}
