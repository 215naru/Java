public class NumerosAleatorios {
  public static void main(String[] args) {
    double numRand = Math.random();
    double escaloNumRand = numRand*355;
    int roundedEscNumRand = (int) Math.floor(escaloNumRand) + 1;
    System.out.println("El numero aleatorio entre 1 y 355 es: "+ roundedEscNumRand);
  }
} 