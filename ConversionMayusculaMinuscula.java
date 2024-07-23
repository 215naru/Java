import java.util.Scanner;

public class ConversionMayusculaMinuscula {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese una cadena de texto: ");
    String palabra = scanner.nextLine();
    String enMayuscula = palabra.toUpperCase();
    String enMinuscula = palabra.toLowerCase();
    System.out.println("En mayuscula: "+enMayuscula);
    System.out.println("En minuscula: "+enMinuscula);
  }
}