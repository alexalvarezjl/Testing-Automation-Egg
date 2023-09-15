package Estructura_De_Control_TryCatch;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        try {
            // Realizar la división del primer número entre el segundo número
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejar la excepción en caso de división por cero
            System.out.println("Error: No se puede dividir por cero.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
