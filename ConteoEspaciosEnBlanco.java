import java.util.Scanner;

public class ConteoEspaciosEnBlanco {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.print("Ingrese una cadena: ");
    String cadena =  scanner.nextLine();
    int contador = 0;
    for(int i=0;i<cadena.length();i++){
      char caracter = cadena.charAt(i);
      if(Character.isWhitespace(caracter)){
        contador++;
      }
    }
    System.out.println("El numero de espacios en blanco es: "+contador);
  }
}
