import java.util.Scanner;

public class VerificaContenidoLetras {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Ingrese una cadena: ");
  String cadena =  scanner.nextLine();
  for (int i = 0;i<cadena.length();i++){
    char caracter =  cadena.charAt(i);
    if(Character.isLetter(caracter)){
      System.out.println(caracter+" es una letra");
    }else{
      System.out.println(caracter+ " no es una letra");
    }
  }
  }
}
