package Ejercicios_String;

import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una cadena de texto
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Obtener la longitud de la cadena utilizando length()
        int longitud = cadena.length();

        // Mostrar la longitud de la cadena en pantalla
        System.out.println("La longitud de la cadena es: " + longitud);

        // Cerrar el Scanner
        scanner.close();
    }
}
