package semana01;

import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad = 0;
        String nombre;
        do {
            System.out.println("Ingrese su nombre: ");
            nombre = scan.nextLine();
            if (nombre.trim().isEmpty()){
                System.out.println("Ingrese un nombre válido.");
            }
        } while (nombre.trim().isEmpty());

        do {
            System.out.println("Ingrese su edad: ");
            String entradaEdad = scan.nextLine();
            try{
                edad = Integer.parseInt(entradaEdad.trim());
                if (edad <= 0 || edad > 200){
                    System.out.println("Ingrese una edad válida.");
                }
            }catch (NumberFormatException e){
                System.out.println("Ingrese una edad válida (ingrese solo números enteros).");
                edad = 0;
            }

        }while (edad <= 0 || edad > 200);

        System.out.println("Hola " + nombre + ", tienes " + edad + " años de edad.");
        scan.close();
    }
}
