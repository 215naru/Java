import java.util.Scanner;

public class practicaScanner4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero1;
    int numero2;
    System.out.print("Ingresa el primer numero: ");
    numero1 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Ingrese el segundo numero: ");
    numero2 = scanner.nextInt();
    scanner.nextLine();

    float resultado;
    System.out.print("Que operacion quiere realizar(+,-,*,/): ");
    String operacion = scanner.nextLine();

    if (operacion.equals("+")) {
      resultado = numero1 + numero2;
      System.out.println("El resultado es: " + resultado);
    } else if (operacion.equals("-")) {
      resultado = numero1 - numero2;
      System.out.println("El resultado es: " + resultado);
    } else if (operacion.equals("*")) {
      resultado = numero1 * numero2;
      System.out.println("El resultado es: " + resultado);
    } else if (operacion.equals("/")) {
      resultado = (float) numero1 / numero2;
      System.out.println("El resultado es: " + resultado);
    } else {
      System.out.print("Es una operacion invalida");
    }
  }
}