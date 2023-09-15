import java.util.Scanner;

public class MiQuintoPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Ejercicio 1:");
        System.out.println("¿Número 1 es mayor que número 2? " + (numero1 > numero2));
        System.out.println("¿Número 1 es distinto de número 2? " + (numero1 != numero2));
        System.out.println("¿Número 1 es divisible por 2? " + (numero1 % 2 == 0));

        // Ejercicio 2
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        System.out.print("Ingrese el cuarto número: ");
        double num4 = scanner.nextDouble();

        System.out.println("Ejercicio 2:");
        System.out.println("¿Número 1 es mayor que número 2 y número 3 es mayor que número 4? " + ((num1 > num2) && (num3 > num4)));
        System.out.println("¿Número 1 es mayor que número 2 o número 3 es mayor que número 4? " + ((num1 > num2) || (num3 > num4)));

        scanner.close();
    }
}
