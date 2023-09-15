import java.util.Scanner;

public class MiTercerPrograma {
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    String nombre;
    System.out.println("Por favor ingrese su nombre: ");
    nombre = ingreso.nextLine();
    System.out.println("Por favor ingrese su edad: ");
    int edad = ingreso.nextInt();
    System.out.println("Mi nombre es: "+nombre+ " y mi edad es: "+edad);
  }
} 