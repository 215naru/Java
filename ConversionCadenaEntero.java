import java.util.Scanner;

public class ConversionCadenaEntero {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      String numeroEntero;
      System.out.print("Ingrese numeros enteros en texto(Ej:'123'): ");
      numeroEntero = scanner.nextLine().replace("\"","").replace("'", "").trim();
      int numeroConvertido = Integer.parseInt(numeroEntero);
      System.out.println("El numero convertido es: " + numeroConvertido);
    } catch (NumberFormatException e) {
      System.out.println("Error: La cadena ingresada no es un numero entero valido");
    } catch (Exception e) {
      System.out.println("Error: Algo salio mal" + e.getMessage());
    }
  }
}