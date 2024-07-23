// Escribe un programa en el cual se cree una variable de tipo array que contenga tres elementos de tipo entero. El programa debe sumar los tres elementos de forma manual e imprimir por consola el resultado utilizando solamente las herramientas adquiridas hasta el momento.
public class SumandoElementos {
  public static void main(String[] args) {
    int[] array = {1,2,3};
    int resultado = array[0] + array[1] + array[2];
    System.out.println("La suma de los elementos es: " + resultado);
  }
}