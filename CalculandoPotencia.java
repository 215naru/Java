import java.util.Scanner;

public class CalculandoPotencia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la base para calcular la potencia: ");
    double base = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Ahora ingrese el exponente: ");
    double exponente = scanner.nextDouble();
    double resultado = Math.pow(base,exponente);
    System.out.println("La potencia es: "+resultado);
  }
}
