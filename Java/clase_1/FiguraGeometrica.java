import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número del 1 al 3
        System.out.print("Ingrese un número del 1 al 3: ");
        int opcion = scanner.nextInt();

        // Calcular y mostrar el área correspondiente a la figura seleccionada utilizando switch
        double area;
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                area = Math.PI * radio * radio;
                System.out.println("El área del círculo es: " + area);
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                area = lado * lado;
                System.out.println("El área del cuadrado es: " + area);
                break;
            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

