import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int[] array = {15, 20, 30, 33, 52, 54, 65, 78, 82, 97};
    int numero;
    System.out.println(Arrays.toString(array));
    System.out.print("Que numero entero busca?: ");
    numero = scanner.nextInt();
    int index = Arrays.binarySearch(array,numero);
    if(index < -1){
      System.out.println("No se encuentra en el array");
    }else{
      System.out.println("Si se encuentra en la posicion "+ index);
    }
  }
}