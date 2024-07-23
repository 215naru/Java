import java.util.Scanner;

public class ExtraccionSubcadenas {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.print("Ingrese una frase: ");
    String frase = scanner.nextLine();
    System.out.print("Ingrese el indice inicial: ");
    int indice1 = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingrese el indice final: ");
    int indice2 =  scanner.nextInt();
    scanner.nextLine();
    String subcadena = frase.substring(indice1, indice2);
    System.out.println("La subcadena es: "+subcadena);
  }
}