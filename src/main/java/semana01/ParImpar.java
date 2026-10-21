package semana01;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        boolean esValido = false;
        do {
            System.out.println("Ingrese el número: ");
            String entradaNumero = scan.nextLine();

            try{
                numero = Integer.parseInt(entradaNumero.trim());
                if (numero % 2 == 0){
                    System.out.println("El número" + numero + " es par.");
                }
                else {
                    System.out.println("El número " + numero + " es impar.");
                }

                esValido = true;
            }catch (NumberFormatException e){
                System.out.println("Ingrese un número válido.");
            }
        } while (!esValido);
    }
}
