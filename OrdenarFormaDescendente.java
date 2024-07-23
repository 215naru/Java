import java.util.Arrays;

public class OrdenarFormaDescendente {
  public static void main(String[] args) {
     int[] array = new int[10];
     
     for(int i=0;i<10;i++){
      array[i] = (int) Math.round(Math.random()*100);
     }
     Arrays.sort(array);
     System.out.println(Arrays.toString(array));

     int[] array2 = Arrays.copyOf(array,array.length);

     for(int i=0;i<array.length; i++){
      array2[i] = array[array.length-1 - i];
     }

     System.out.println(Arrays.toString(array2));
  }
}