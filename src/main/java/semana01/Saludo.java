package semana01;

import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();

        do {
            System.out.println("Ingrese su edad: ");
            edad = Integer.parseInt(scan.nextLine());
            if (edad <= 0){
                System.out.println("Ingrese una edad válida.");
            }
        }while (edad <= 0);

        System.out.println("Hola " + nombre + ", tienes " + edad + " años de edad.");
    }
}
