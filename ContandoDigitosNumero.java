import java.util.Scanner;

public class ContandoDigitosNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    String cadena = scanner.nextLine();
    
    int numeroDigitos = 0;
    for (int i = 0; i < cadena.length(); i++) {
      char caracter = cadena.charAt(i);
      if (Character.isDigit(caracter)) {
        numeroDigitos++;
      }
    }
    System.out.println("El numero de digitos son: " + numeroDigitos);
  }
}