package Estructura_De_Control_TryCatch;

import java.util.Scanner;

public class CadenaAEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una cadena de caracteres
        System.out.print("Ingrese una cadena de caracteres que represente un número entero: ");
        String cadena = scanner.nextLine();

        try {
            // Convertir la cadena a un número entero utilizando Integer.parseInt()
            int numero = Integer.parseInt(cadena);
            System.out.println("El número entero obtenido es: " + numero);
        } catch (NumberFormatException e) {
            // Manejar la excepción en caso de que la cadena no pueda ser convertida a un número entero
            System.out.println("Error: La cadena ingresada no representa un número entero válido.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
