import java.util.Scanner;
public class ConversionCalificaciones {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int calificacion;
    System.out.print("Ingrese una calificacion (1-5): ");
    calificacion = scanner.nextInt();// 5/n
    scanner.nextLine();// /n
    switch (calificacion) {
      case 1 -> System.out.println("Es la calificacion Muy deficiente");
      case 2 -> System.out.println("Es la calificacion Deficiente");
      case 3 -> System.out.println("Es la calificacion Suficiente");
      case 4 -> System.out.println("Es la calificacion Notable");
      case 5 -> System.out.println("Es la calificacion Sobresaliente");
      default -> System.out.println("Calificacion invalida");
    }
  }
}