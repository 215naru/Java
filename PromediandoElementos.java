// Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero. Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de forma manual e imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta el momento.

import java.util.Scanner;

public class PromediandoElementos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[4];
    System.out.print("Ingrese el primer elemento del array: ");
    array[0] = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingrese el segundo elemento del array: ");
    array[1] = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingrese el tercero elemento del array: ");
    array[2] = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingrese el cuarto elemento del array: ");
    array[3] = scanner.nextInt();

    int suma = array[0] + array[1] + array[2] + array[3];
    float promedio = (float) suma / 4;

    System.out.println("La suma es: " + suma);
    System.out.println("El promedio es: " + promedio);
  }
}