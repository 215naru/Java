import java.util.Scanner;

public class ConversionTemperatura {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la temperatura: ");
    int temperatura =  scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingrese la unidad de medida (C/F):");
    String unidad  =  scanner.nextLine();
    float conversion;

    if(unidad.equals("C")){
      conversion = (float)(temperatura*9/5)+32;
      System.out.println( temperatura + " grados Celsius equivale a " + conversion + " grados Fahrenheit.");
    }else if(unidad.equals("F")){
      conversion = (float)(temperatura-32)*5/9;
      System.out.println( temperatura + " grados Fahrenheit equivale a " + conversion + " grados Celcius.");
    } 
  }
}