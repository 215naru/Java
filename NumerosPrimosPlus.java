import java.util.Random;
import java.util.Scanner;

public class NumerosPrimosPlus {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de numeros primos a generar:");
    int cantidad = scanner.nextInt();
    int contador = 0;

    while (contador<cantidad) {
      double aleatorio =  Math.random();
      double maxAleatorio =  aleatorio*100;
      int maxAleatorioEntero = (int) Math.round(maxAleatorio);
      System.out.println(maxAleatorioEntero);
      contador++;
      
    }
  }
}
