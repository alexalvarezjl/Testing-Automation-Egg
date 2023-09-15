import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número del 1 al 7
        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = scanner.nextInt();

        // Determinar si el día es hábil o no hábil utilizando switch
        String estado;
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                estado = "Día hábil";
                break;
            case 6:
            case 7:
                estado = "Día no hábil";
                break;
            default:
                estado = "Día inválido";
                break;
        }

        System.out.println(estado);

        // Cerrar el Scanner
        scanner.close();
    }
}
