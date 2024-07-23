import java.util.Scanner;

public class ValorAbsoluto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un numero entero: ");
    int entero = scanner.nextInt();
    int absEntero = Math.abs(entero);
    System.out.println("El absoluto es: "+ absEntero);
  }
}