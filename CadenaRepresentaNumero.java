import java.util.Scanner;

public class CadenaRepresentaNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Ingrese una cadena: ");
      String cadena =  scanner.nextLine();
      Double numero = Double.valueOf(cadena);
      System.out.println("El numero es: "+numero);
    } catch (NumberFormatException e) {
      System.out.println("No es un numero valido");
    }
  }
}
