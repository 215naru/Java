import java.util.Scanner;

public class practicaScanner {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    String nombre;
    int edad;
    System.out.print("Ingrese su nombre: ");
    nombre = scanner.nextLine();
    // scanner.nextLine();
    System.out.print("Ingrese su edad: ");
    edad = scanner.nextInt();

    System.out.println("Su nombres es "+nombre+" y su edad es "+ edad);
  }
}