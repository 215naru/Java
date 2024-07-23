import java.util.Scanner;

public class ConversionCadenaNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Ingrese un numero entero: ");
      String cadenaNumero = scanner.nextLine();
      int numeroEntero =  Integer.valueOf(cadenaNumero);
      System.out.println("El numero es:"+numeroEntero);
    } catch (NumberFormatException e) {
      System.out.println("Error no es un numero entero");
    }
  }
}