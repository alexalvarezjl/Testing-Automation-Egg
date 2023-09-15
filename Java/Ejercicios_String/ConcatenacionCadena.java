package Ejercicios_String;

import java.util.Scanner;

public class ConcatenacionCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario su nombre y apellido por separado
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        // Concatenar el nombre y el apellido utilizando concat()
        String nombreCompleto = nombre.concat(" ").concat(apellido);

        // Mostrar el nombre completo en pantalla
        System.out.println("El nombre completo es: " + nombreCompleto);

        // Cerrar el Scanner
        scanner.close();
    }
}
