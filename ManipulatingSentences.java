import java.util.Scanner;

public class ManipulatingSentences {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Manipulando oraciones");
        System.out.println("Ingrese una oración");
        String sentenceData = Data.toString();

        if (sentenceData.length() > 0) {
            System.out.println("MENU");
            System.out.println("1. Borrar oración");
            System.out.println("2. Cantidad de caracteres de la oración");
            System.out.println("3. Cantidad de palabras de la oración");
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("Ingresar un número y devolver la palabra correspondiente");
            System.out.println("Ingrese una Oracion");


        } else {
            System.out.println("MENU");
            System.out.println("Crear oración");

        }

        int Option = Data.nextInt();

        switch (Option) {
            case 1-> {
                }
                case 2-> {
                }
                case 3-> {
                }
                case 4-> {
                }
            default -> throw new AssertionError();
        }


    }}}



// Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en 
// la oración (incluyendo espacios).

// Cantidad de palabras de la oración: Calcular y mostrar la cantidad de palabras en la oración.

// Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la oración ordenadas 
// alfabéticamente.

// Ingresar un número y devolver la palabra correspondiente: Solicitar al usuario ingresar un 
// número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un 
// número fuera del rango de número de palabras (la primera palabra corresponde al número 1), 
// mostrar el mensaje "Número inválido. Intente nuevamente".

// Buscar palabra dentro de la oración: Solicitar al usuario ingresar una palabra y verificar 
// si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue 
// encontrada y la posición en la que se encuentra.

// Modificar palabra dentro de la oración: Solicitar al usuario ingresar la palabra que se quiere 
// cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la 
// palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la 
// nueva oración modificada (recordar validar que solo contenga letras y espacios).

// Agregar contenido a la oración: Solicitar al usuario ingresar contenido y agregar ese contenido 
// al final de la oración.

// Salir: Terminar el programa.

// Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario 
// pueda elegir otra acción, excepto cuando elija "Salir".

// Realiza las validaciones que consideres necesarias.