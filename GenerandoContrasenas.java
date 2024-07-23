//48-57
//65-90
//97-122
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenerandoContrasenas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de caracteres de su password: ");
    int cantidad = scanner.nextInt();
    Random  random = new Random();
    char[] caracteres = new char[cantidad];
    for(int i=0;i<cantidad;i++){
      int numero = numeroAleatorioEnIntervalos(random);
      char letra = (char) numero;
      caracteres[i] = letra; 
    }
    System.out.println(Arrays.toString(caracteres));
  }
  public static int numeroAleatorioEnIntervalos(Random random){
    int numeroAleatorio;
    int selector = random.nextInt(3);
    switch (selector) {
      case 0:
        numeroAleatorio = random.nextInt(10)+48;
        break;
      case 1:
        numeroAleatorio = random.nextInt(26)+65;
        break;
      case 2:
        numeroAleatorio = random.nextInt(26)+97;
        break;
      default:
      throw new IllegalStateException("Unexpected value: " + selector);
    }
    return numeroAleatorio;
  }
}