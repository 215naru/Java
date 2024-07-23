// import java.util.Scanner;

// public class EjercicioSemana {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     int dia;
//     System.out.print("Ingrese un dia de la semana (1-7): ");
//     dia = scanner.nextInt();// 5/n
//     scanner.nextLine();// /n
//     switch (dia) {
//       case 1:
//         System.out.println("Es el dia Domingo");
//         break;
//       case 2:
//         System.out.println("Es el dia Lunes");
//         break;
//       case 3:
//         System.out.println("Es el dia Martes");
//         break;
//       case 4:
//         System.out.println("Es el dia Miercoles");
//         break;
//       case 5:
//         System.out.println("Es el dia Jueves");
//         break;
//       case 6:
//         System.out.println("Es el dia Viernes");
//         break;
//       case 7:
//         System.out.println("Es el dia Sabado");
//         break;
//       default:
//         System.out.println("No es un dia de la semana");
//         break;
//     } 
//   }
// }

import java.util.Scanner;

public class EjercicioSemana {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dia;
    System.out.print("Ingrese un dia de la semana (1-7): ");
    dia = scanner.nextInt();// 5/n
    scanner.nextLine();// /n
    switch (dia) {
      case 1 -> System.out.println("Es el dia Domingo");
      case 2 -> System.out.println("Es el dia Lunes");
      case 3 -> System.out.println("Es el dia Martes");
      case 4 -> System.out.println("Es el dia Miercoles");
      case 5 -> System.out.println("Es el dia Jueves");
      case 6 -> System.out.println("Es el dia Viernes");
      case 7 -> System.out.println("Es el dia Sabado");
      default -> System.out.println("No es un dia de la semana");
    } 
  }
}