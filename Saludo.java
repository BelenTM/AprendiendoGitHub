import java.util.Scanner;
public class Saludo{
    public void saludar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dime tu nombre");
        String nombre = scan.nextLine();
        System.out.println("Hola " + nombre + " ¡Hace mucho que no nos vemos!");
        System.out.println("Esto es una prueba de sincronizacion");
    }

    public void saludarConEdad(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String nombre = scan.nextLine();
        System.out.print("¿Cuántos años tienes?: ");
        int edad = scan.nextInt();
        scan.nextLine();

        if (edad<18){
            System.out.println( "Hola "+ nombre + " eres bastante joven.");

        } else {
            System.out.println( "Hola "+ nombre + " espero que tengas un buen día.");
        }

    }
}
