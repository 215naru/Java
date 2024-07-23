public class practicaScanner2 {
  public static void main(String[] args) {
    System.out.println("5+5 = "  + (5+5));
    System.out.println("5%5 = "  + (5%5));
    System.out.println("7%5 = "  + (7%5));
    System.out.println("7/5 = "  + (7D/5D));
    // Operadores de comparacion
    System.out.println("5 == 5 = "  + (5==5));
    System.out.println("5 != 5 = "  + (5!=5));
    // Operadores logicos
    System.out.println("5<=5 && 5<5 =" + (5<=5 && 5<5));
    System.out.println("5<=5 || 5<5 =" + (5<=5 || 5<5));
    // Operador ternario
    int numero = 10;
    String resultado = numero % 5 == 0 ? "es divisible" : "no es divisible";
     
  }
}