import java.util.Scanner;

public class DivisionSegura {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int numero1;
      int numero2;
      System.out.print("Ingrese el primer numero: ");
      numero1 = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Ingrese el segundo numero: ");
      numero2 = scanner.nextInt();
      float resultado = (float) numero1/numero2;
      System.out.println("El resultado es: "+resultado);
    } catch (ArithmeticException e) {
      System.out.println("Error: No es divisible por 0");
    }
  }
}