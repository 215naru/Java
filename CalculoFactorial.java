import java.util.Scanner;

public class CalculoFactorial {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    int numero = scanner.nextInt();
    int factorial = numero;
    do {
      factorial= (numero-1)*factorial;
      numero--;
    } while (numero>1);

    System.out.println("El factorial es: "+factorial);
  }
} 