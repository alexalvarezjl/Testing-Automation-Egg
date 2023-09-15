package Ejercicios_String;

import java.util.Scanner;

public class ConcatenacionSubCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una frase y dos números enteros
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingrese el índice inicial: ");
        int indiceInicial = scanner.nextInt();

        System.out.print("Ingrese el índice final: ");
        int indiceFinal = scanner.nextInt();

        // Extraer la subcadena entre los índices ingresados utilizando substring()
        String subcadena = frase.substring(indiceInicial, indiceFinal);

        // Mostrar la subcadena resultante en pantalla
        System.out.println("La subcadena resultante es: " + subcadena);

        // Cerrar el Scanner
        scanner.close();
    }
}
