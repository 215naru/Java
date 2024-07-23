import java.util.Scanner;

public class BusquedaCaracteres {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.print("Ingrese una palabra: ");
    String palabra = scanner.nextLine();
    System.out.print("Ingrese un caracter: ");
    String caracter =  scanner.nextLine();
    int encontrado = palabra.indexOf(caracter);
    if (encontrado == -1){
      System.out.println("El caracter no se encuentra en la palabra");
    }else{
      System.out.print("El caracter se encuentra en la palabra");
    }
  }
}