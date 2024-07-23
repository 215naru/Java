import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (esContrasenaSegura(contrasena)) {
            System.out.println("Contraseña segura.");
        } else {
            System.out.println("Contraseña no segura. Asegúrese de que cumpla con todos los criterios de seguridad.");
        }
    }

    public static boolean esContrasenaSegura(String contrasena) {
        if (contrasena.length() < 8) {
            System.out.println("Debe tener al menos 8 caracteres.");
            return false;
        }
        if (!contrasena.matches(".*[A-Z].*")) {
            System.out.println("Debe tener al menos una letra mayúscula.");
            return false;
        }
        if (!contrasena.matches(".*[a-z].*")) {
            System.out.println("Debe tener al menos una letra minúscula.");
            return false;
        }
        if (!contrasena.matches(".*[0-9].*")) {
            System.out.println("Debe tener al menos un número.");
            return false;
        }
        if (!contrasena.matches(".*[!@#$%^&*()].*")) {
            System.out.println("Debe contener al menos un carácter especial (por ejemplo, !, @, #, $, %, ^, &, *, ()).");
            return false;
        }
        return true;
    }
}