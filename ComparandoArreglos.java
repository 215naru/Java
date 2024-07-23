import java.util.Arrays;

public class ComparandoArreglos {
  public static void main(String[] args) {
    int[] array1 = {15, 20, 30, 33, 52, 54, 65, 78, 82, 97};
    int[] array2 = {15, 20, 30, 33, 52, 54, 65, 78, 82, 97};
    boolean sonIguales = Arrays.equals(array1, array2);
    if (sonIguales) {
      System.out.println("Son inguales");
    }else{
      System.out.println("No son iguales");
    }
  }
}