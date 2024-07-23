import java.util.Scanner;

public class mostrarCalificacion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float numero;
    System.out.print("Ingrese su puntaje (0-100): ");
    numero = scanner.nextFloat();
    scanner.nextLine();
    if(numero >= 90 && numero <= 100){
      System.out.println("Su calificion es: A");
    }else if( numero >= 80 && numero <= 89){
      System.out.println("Su calificcacion es: B");
    }else if( numero >= 70 && numero <= 79){
      System.out.println("Su calificcacion es: C");
    }else if( numero >= 60 && numero <= 69){
      System.out.println("Su calificcacion es: D");
    }else if( numero >= 0 && numero < 60){
      System.out.println("Su calificcacion es: F");
    }else{
      System.out.println(" El puntaje ingresado es invalido");
    }
  }
}