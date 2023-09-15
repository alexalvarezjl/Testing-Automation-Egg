import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una calificación numérica del 1 al 5
        System.out.print("Ingrese una calificación numérica del 1 al 5: ");
        int calificacionNumerica = scanner.nextInt();

        // Mostrar la calificación correspondiente en letras utilizando switch
        String calificacionLetras;
        switch (calificacionNumerica) {
            case 1:
                calificacionLetras = "Muy deficiente";
                break;
            case 2:
                calificacionLetras = "Deficiente";
                break;
            case 3:
                calificacionLetras = "Suficiente";
                break;
            case 4:
                calificacionLetras = "Notable";
                break;
            case 5:
                calificacionLetras = "Sobresaliente";
                break;
            default:
                calificacionLetras = "Calificación inválida";
                break;
        }

        System.out.println("La calificación correspondiente es: " + calificacionLetras);

        // Cerrar el Scanner
        scanner.close();
    }
}
