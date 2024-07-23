import java.util.Scanner;

public class EjercicioComplementario {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int edad;
    System.out.print("Ingrese su edad:");
    edad = scanner.nextInt();
    scanner.nextLine();

    if( edad >=18 && edad<=64){
      System.out.println("Eres adulto");
    }else if(edad < 18 && edad >=0){
      System.out.println("Eres menor edad");
    }else if(edad > 64 && edad <=130){
      System.out.println("Eres adulto mayor");
    }else{
      System.out.println("Ingresaste una edad erronea");
    }
  }
}