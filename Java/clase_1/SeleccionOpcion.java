import java.util.Scanner;

public class SeleccionOpcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú
        System.out.println("Menú:");
        System.out.println("1. Guardar");
        System.out.println("2. Cargar");
        System.out.println("3. Salir");

        // Solicitar al usuario un número del 1 al 3
        System.out.print("Ingrese un número del 1 al 3 para seleccionar una opción: ");
        int opcion = scanner.nextInt();

        // Realizar la acción correspondiente a la opción seleccionada utilizando switch
        switch (opcion) {
            case 1:
                System.out.println("Opción seleccionada: Guardar");
                break;
            case 2:
                System.out.println("Opción seleccionada: Cargar");
                break;
            case 3:
                System.out.println("Opción seleccionada: Salir");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

