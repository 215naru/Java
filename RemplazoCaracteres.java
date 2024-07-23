import java.util.Scanner;

public class RemplazoCaracteres {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese una frase: ");
    String frase =  scanner.nextLine();
    System.out.print("Ingrese el primer caracter: ");
    String caracter1 = scanner.nextLine();
    System.out.print("Ingrese el segundo caracter: ");
    String caracter2 = scanner.nextLine();
    int indice = frase.indexOf(caracter1);
    System.out.println("El caracter1 se encuentra en: "+indice);
  }
}
