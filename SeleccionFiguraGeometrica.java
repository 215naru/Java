import java.util.Scanner;

public class SeleccionFiguraGeometrica {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double area = 0;
    int numero;
    System.out.println("Elige una opcion para hallar el area:");
    System.out.println("Opción 1: 'círculo'");
    System.out.println("Opción 2: 'cuadrado'");
    System.out.println("Opción 3: 'triángulo'");
    System.out.print("Ingrese un numero para elegir la opcion(1-3):");
    numero = scanner.nextInt();// 5/n
    scanner.nextLine();// /n
    switch (numero) {
      case 1 -> {
        System.out.print("Ingrese el radio del circulo: ");
        float radio = scanner.nextFloat();
        area = Math.PI * radio * radio;
        System.out.print("El valor del area es: " + area);
      }
      case 2 -> {
        System.out.print("Ingrese el lado del cuadrado: ");
        float lado = scanner.nextFloat();
        area = lado * lado;
        System.out.print("El valor del area es: " + area);
      }
      case 3 -> {
        System.out.print("Ingrese la base del triangulo: ");
        float base = scanner.nextFloat();
        System.out.print("Ingrese la altura del triangulo: ");
        float altura = scanner.nextFloat();
        area = base * altura;
        System.out.print("El valor del area es: " + area);
      }
      default ->
        System.out.println("Ingresaste una opcion erronea");
    }
  }
}