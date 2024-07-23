import java.util.Scanner;
public class MiPrimerPrograma {
  public static void main(String[] args) {
    Scanner nimer = new Scanner(System.in);
    // boolean esVerdadero = true;
    // char vocal = 'a';
    String nombre;
    int edad;
    System.out.print("Ingrese su edad: ");
    edad = nimer.nextInt();
    nimer.nextLine();
    // long velocidaLuz = 300000000l;
    // float valorPi = 3.141632f;
    // System.out.println(esVerdadero);
    // System.out.println(vocal);
    // System.out.println(nombre);
    System.out.print("Ingrese su Nombre completo: ");
    nombre = nimer.nextLine();
    System.out.println("Hola "+ nombre +" su edad es: "+edad);


    // System.out.println(velocidaLuz);
    // System.out.println(valorPi);
    // System.out.println("Mi nombre es "+nombre+" y tengo 28 años");

// La temperatura media de una ciudad durante el verano (en grados Celsius): CONSIDERO QUE DEBE SER UN FLOAT PORQUE EL RANGO NO ES TAN AMPLIO COMO EL DOUBLE, ADEMAS SE TRATA LA TEMPERATURA DE UNA CIUDAD.

// El precio de un producto en una tienda (en dólares y centavos): CONSIDERO EN ESTE CASO DEBE SER UN DOUBLE, PORQUE PUEDE SER UNA TIENDA DE PRODUCTOS DE GRAN VALOR.

// El nombre completo de una persona: CONSIDERO QUE DEBE SER UN STRING

// La fecha de nacimiento de una persona: YO GUARDARIA EN UN TIPO DE DATO STRING

// El número de habitantes de una ciudad: ESTO DEPENDE DE LA CIUDAD, POR TANTO USARIA UN DOUBLE.

// La duración de una película (en minutos): Yo utlizaria un INT

// Si un artículo está disponible o no en una tienda (true/false): Yo utilizaria BOOLEAN

// La distancia entre dos ciudades (en kilómetros): UTILIZARIA UN DOUBLE.

// El número de teléfono de una persona.: Yo utilizaria un STRING

// La cantidad de existencias de un producto en una tienda: YO UTILIZARIA UN INT

    String mensajeBienvenida = "Bienvenido a Java";
    Float temperaturaActual = 19f;
    Boolean datoLogico = true;

    System.out.println("Hola "+ nombre + " " + mensajeBienvenida + " la temperatura actual es: "+ temperaturaActual + " Estas activo: "+ datoLogico);
  }
}