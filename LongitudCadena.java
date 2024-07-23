import java.util.Scanner;

public class LongitudCadena {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.print("Ingrese una cadena de texto: ");
    String cadena = scanner.nextLine();
    int tamanio = cadena.length();
    System.out.println("El tamanio de la cadena es: "+ tamanio);
  }
}