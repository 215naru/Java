import java.util.Scanner;
public class SeleccionOpcion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    System.out.println("Menu");
    System.out.println("Opción 1: 'Guardar'");
    System.out.println("Opción 2: 'Cargar'");
    System.out.println("Opción 3: 'Salir'");
    System.out.print("Ingrese un numero del 1 al 3:");
    numero = scanner.nextInt();// 5/n
    scanner.nextLine();// /n
    switch (numero) {
      case 1 -> System.out.println("Eligiste Guardar");
      case 2 -> System.out.println("Eligiste Cargar");
      case 3 -> System.out.println("Eligiste Salir");
      default -> System.out.println("Ingresaste una Opcion Invalida");
    }
  }
}