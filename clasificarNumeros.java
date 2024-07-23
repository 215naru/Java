import java.util.InputMismatchException;
import java.util.Scanner;

public class clasificarNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try{
        int numero;
        System.out.print("Ingrese un numero entero: ");
        numero = scanner.nextInt();
        if (numero > 0) {
          System.out.println("Es un numero positivo");
        } else if (numero < 0) {
          System.out.println("Es un numero negativo");
        } else if (numero == 0) {
          System.out.println("El numero es 0");
        }
        break;
      }catch(InputMismatchException e){
        System.out.println("No es entero");
        scanner.nextLine();
      }
    }
    scanner.close();
  }
}