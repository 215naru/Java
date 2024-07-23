import java.util.Scanner;

public class practicaScanner3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    System.out.print("Ingrese el numero: ");
    numero = scanner.nextInt();
    String resultado = numero%2 == 0 ? "Es verdadero" : "Es falso";
    System.out.println(resultado);
  }
}