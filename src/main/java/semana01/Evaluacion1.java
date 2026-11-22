package semana01;

public class Evaluacion1 {
    public static int contarPares(int[] numeros){
        if (numeros == null || numeros.length == 0){
            return 0; //Decidí que regrese 0 si el arreglo está vacío, ya que no hay nada que contar.
        }

        int contador = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 11, 14}; //Caso 1: números positivos pares e impares.
        int[] numeros2 = {-4, -3, 0, 1, 6}; //Caso 2: números negativos y cero.
        int[] numeros3 = {}; //Caso 3: arreglo vacío.

        System.out.println("La cantidad de pares en el arreglo 1 es: " + contarPares(numeros));
        System.out.println("La cantidad de pares en el arreglo 2 es: " + contarPares(numeros2));
        System.out.println("La cantidad de pares en el arreglo 3 es: " + contarPares(numeros3));

    }
}

