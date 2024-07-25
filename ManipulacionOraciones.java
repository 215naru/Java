import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ManipulacionOraciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Manipulando oraciones");
        boolean salir = true;
        System.out.print("Ingrese una oración: ");
        String sentence = scanner.nextLine();
        
        while (salir) {
            if (sentence.length() > 0) {
                System.out.println("MENU");
                System.out.println("1. Borrar oración");
                System.out.println("2. Cantidad de caracteres de la oración.");
                System.out.println("3. Cantidad de palabras de la oración.");
                System.out.println("4. Mostrar palabras ordenadas alfabéticamente.");
                System.out.println("5. Ingresar un número y devolver la palabra correspondiente.");
                System.out.println("6. Buscar palabra dentro de la oración.");
                System.out.println("7. Modificar palabra dentro de la oración.");
                System.out.println("8. Agregar contenido a la oración.");
                System.out.println("9. Salir.");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea después de nextInt()
                
                switch (option) {
                    case 1:
                        System.out.print("Ingrese una nueva oración: ");
                        sentence = scanner.nextLine();
                        break;
                    case 2:
                        System.out.println("La oración tiene " + sentence.length() + " caracteres");
                        break;
                    case 3:
                        int wordsCount = countWords(sentence);
                        System.out.println("La cantidad de palabras es: " + wordsCount);
                        break;
                    case 4:
                        String[] words = sentence.trim().split("\\s+");
                        Collator collator = Collator.getInstance(new Locale("es","ES"));
                        collator.setStrength(Collator.PRIMARY);
                        Arrays.sort(words, collator);
                        System.out.println("Palabras ordenadas alfabéticamente: " + String.join(" ", words));
                        break;
                    case 5:
                        words = sentence.split("\\s+");
                        System.out.print("Ingrese un número: ");
                        int number = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea después de nextInt()
                        if (number > 0 && number <= words.length) {
                            System.out.println("La palabra en la posición " + number + " es: " + words[number - 1]);
                        } else {
                            System.out.println("Número inválido. Intente nuevamente.");
                        }
                        break;
                    case 6:
                        System.out.print("Ingrese una palabra para buscar: ");
                        String wordSearch = scanner.nextLine();
                        words = sentence.split("\\s+");
                        boolean find = false;
                        for (int i = 0; i < words.length; i++) {
                            if (words[i].equals(wordSearch)) {
                                System.out.println("La palabra \"" + wordSearch + "\" fue encontrada en la posición " + (i + 1) + ".");
                                find = true;
                                break;
                            }
                        }
                        if (!find) {
                            System.out.println("La palabra \"" + wordSearch + "\" no fue encontrada en la oración.");
                        }
                        break;
                    case 7:
                        // Aquí puedes agregar el código para modificar una palabra dentro de la oración.
                        break;
                    case 8:
                        // Aquí puedes agregar el código para agregar contenido a la oración.
                        break;
                    case 9:
                        salir = false;
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                        break;
                }
            } else {
                System.out.print("Ingrese una oración: ");
                sentence = scanner.nextLine();
            }
        }
        scanner.close();
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
