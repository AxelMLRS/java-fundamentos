package semana01;

import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nombre = "";
        int edad = 0;

        System.out.println("Ingrese su nombre: ");
        nombre = scan.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(scan.nextLine());

        System.out.println("Hola " + nombre + ", tienes " + edad + " años de edad.");
    }
}
