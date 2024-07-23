import java.util.Scanner;

public class Divisibilidad {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    System.out.print("Ingrese un numero para determinar la divisibilidad por 5 o 3: ");
    numero = scanner.nextInt();
    scanner.nextLine();
    if( numero%5==0 && numero%3==0){
      System.out.println("El numero es divisible por ambos");
    }else if( numero%5 == 0){
      System.out.println("El numero es divisible por 5");
    }else if( numero%3 == 0){
      System.out.println("El numero es divisible por 3");
    }else{
      System.out.println("El numero no es divisible ni por 5 ni por 3");
    }
  }
}
