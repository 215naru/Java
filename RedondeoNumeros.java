import java.util.Scanner;

public class RedondeoNumeros {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.print("Ingrese un numero decimal: ");
    float decimal = scanner.nextFloat();
    float redondeado = Math.round(decimal);
    System.out.println("El numero redondeado es: "+redondeado);
  }
}