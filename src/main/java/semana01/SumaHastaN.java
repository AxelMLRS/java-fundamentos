package semana01;
import java.util.Scanner;

public class SumaHastaN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        boolean esValido = false;
        do {
            System.out.println("Ingrese un número: ");
            String entradaN = scan.nextLine();
            try{
                n = Integer.parseInt(entradaN.trim());
                if (n < 0){
                        System.out.println("Ingrese un número entero no negativo."); //El cero no es estrictamente positivo, por lo que usamos "no negativo".
                } else {
                    esValido = true;
                }

            } catch (NumberFormatException e){
                System.out.println("Debe ingresar un número entero válido.");
            }
        } while (!esValido);

        long suma = 0L;
        for (long i = 1; i <= n; i++){
            suma += i;
        }

        System.out.println("La suma de todos los números hasta el número " + n + " es: " + suma + ".");

        scan.close();
    }
}
