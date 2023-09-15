import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la puntuación: ");
        int puntuacion = scanner.nextInt();

        if (puntuacion >= 90 && puntuacion <= 100) {
            System.out.println("Calificación: A");
        } else if (puntuacion >= 80 && puntuacion < 90) {
            System.out.println("Calificación: B");
        } else if (puntuacion >= 70 && puntuacion < 80) {
            System.out.println("Calificación: C");
        } else if (puntuacion >= 60 && puntuacion < 70) {
            System.out.println("Calificación: D");
        } else if (puntuacion < 60) {
            System.out.println("Calificación: F");
        } else {
            System.out.println("Puntuación inválida.");
        }

        scanner.close();
    }
}
