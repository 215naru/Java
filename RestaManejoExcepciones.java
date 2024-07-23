import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaManejoExcepciones {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      float numero1;
      float numero2;
      System.out.print("Ingrese el primer numero: ");
      numero1 = scanner.nextFloat();
      scanner.nextLine();
      System.out.print("Ingrese el segundo numero: ");
      numero2 = scanner.nextFloat();
      float resultado = numero1 - numero2;
      System.out.println("El resultado es: " + resultado);
    } catch (InputMismatchException e) {
      System.out.println("Error: Entrada invalida. Por favor ingrese un numero valido");
    } catch (ArithmeticException e){
      System.out.println("Error: Ocurrio un problema aritmetico");
    } catch (Exception e){
      System.out.println("Error: Algo salio mal" + e.getMessage());
    }
  }
}