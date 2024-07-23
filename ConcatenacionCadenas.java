import java.util.Scanner;

public class ConcatenacionCadenas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese su nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese su apellido: ");
    String apellido = scanner.nextLine();
    String nombreCompleto = nombre.concat(" "+apellido);
    System.out.println("Tu nombre completo es: " +  nombreCompleto);
  }
}