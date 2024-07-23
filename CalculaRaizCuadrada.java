import java.util.Scanner;

public class CalculaRaizCuadrada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Ingrese un numero positivo: ");
      double numero = scanner.nextDouble();
      if (numero < 0) {
        System.out.println("Ingresaste un número negativo. Por favor, ingresa un número positivo.");
      } else {
        double raiz = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
      }
    } catch (Exception e) {
      System.out.println("Entrada Invalida");
    } finally {
      scanner.close();
    }
  }
}