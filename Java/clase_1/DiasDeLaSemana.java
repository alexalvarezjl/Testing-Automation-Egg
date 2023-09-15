import java.util.Scanner;

public class DiasDeLaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número del 1 al 7
        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = scanner.nextInt();

        // Mostrar el nombre del día correspondiente utilizando switch
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
                break;
        }

        System.out.println("El día correspondiente al número ingresado es: " + nombreDia);

        // Cerrar el Scanner
        scanner.close();
    }
}
