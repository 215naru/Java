import java.util.Scanner;

public class SumaNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un numero entero: ");
    String cadenaEntero =  scanner.nextLine();
    System.out.print("Ingrese un numero decimal: ");
    String cadenaDecimal = scanner.nextLine();
    int entero = Integer.valueOf(cadenaEntero);
    Double decimal = Double.valueOf(cadenaDecimal);

    Double suma = entero + decimal;
    System.out.println("La suma es: " + suma);
  }
}