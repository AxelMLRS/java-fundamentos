package semana02;

public class MayorYMenor {
    public static int[] mayorYMenor(int[] numeros){
        if (numeros == null || numeros.length == 0){
            throw new IllegalArgumentException("El arreglo no puede ser null nie star vacío.");// Si el arreglo es null o está vacío, lanzamos una excepción porque no existen elementos para determinar el mayor y el menor.
        }

        int menor = numeros[0];
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }

            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return new int[]{mayor, menor};
    }

    public static void main(String[] args) {
        // Caso 1: números positivos.
        // Se espera: Mayor = 15, Menor = 3.
        int[] resultado1 = mayorYMenor(new int[]{8, 3, 15, 10});
        System.out.println("Caso 1: Mayor = " + resultado1[0] + ", Menor = " + resultado1[1]);

        // Caso 2: números negativos.
        // Se espera: Mayor = -2, Menor = -10.
        int[] resultado2 = mayorYMenor(new int[]{-5, -2, -10, -7});
        System.out.println("Caso 2: Mayor = " + resultado2[0] + ", Menor = " + resultado2[1]);

        // Caso 3: números positivos y negativos.
        // Se espera: Mayor = 8, Menor = -9.
        int[] resultado3 = mayorYMenor(new int[]{-9, 4, 8, -3, 0});
        System.out.println("Caso 3: Mayor = " + resultado3[0] + ", Menor = " + resultado3[1]);

        // Caso 4: un solo elemento.
        // Se espera: Mayor = 7, Menor = 7.
        int[] resultado4 = mayorYMenor(new int[]{7});
        System.out.println("Caso 4: Mayor = " + resultado4[0] + ", Menor = " + resultado4[1]);

        // Caso 5: elementos repetidos.
        // Se espera: Mayor = 5, Menor = 2.
        int[] resultado5 = mayorYMenor(new int[]{5, 2, 5, 2, 5});
        System.out.println("Caso 5: Mayor = " + resultado5[0] + ", Menor = " + resultado5[1]);

        // Caso 6: todos los elementos iguales.
        // Se espera: Mayor = 4, Menor = 4.
        int[] resultado6 = mayorYMenor(new int[]{4, 4, 4, 4});
        System.out.println("Caso 6: Mayor = " + resultado6[0] + ", Menor = " + resultado6[1]);

        // Caso 7: arreglo vacío.
        // Se espera: IllegalArgumentException.
        try {
            mayorYMenor(new int[]{});
        } catch (IllegalArgumentException e) {
            System.out.println("Caso 7: Se lanzó una excepción por arreglo vacío.");
        }

        // Caso 8: arreglo null.
        // Se espera: IllegalArgumentException.
        try {
            mayorYMenor(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Caso 8: Se lanzó una excepción por arreglo null.");
        }
    }

}
