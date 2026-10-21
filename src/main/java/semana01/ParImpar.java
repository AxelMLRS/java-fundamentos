package semana01;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean esValido = false;
        do {
            System.out.println("Ingrese el número: ");
            String entradaNumero = scan.nextLine();
            int numero;

            try{
                numero = Integer.parseInt(entradaNumero.trim());
                esValido = true;
            }catch (NumberFormatException e){
                System.out.println("Ingrese un número válido.");
                continue;
            }

            if (numero % 2 == 0){
                System.out.println("El número " + numero + " es par.");
            }
            else {
                System.out.println("El número " + numero + " es impar.");
            }

        } while (!esValido);
        scan.close();
    }
}
