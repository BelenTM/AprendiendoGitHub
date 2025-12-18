import java.util.Scanner;

public class Saludo {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = scan.nextLine();

        System.out.println("Hola " + nombre);
        scan.close();
    }
}
