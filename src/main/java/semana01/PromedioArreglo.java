package semana01;


/*int[] numeros = {4, 8, 15, 16, 23, 42};
        int suma = 0;
        for (int i = 0; i <= numeros.length; i++) {    ----> El error se encuentra en esta línea de código, i no puede ser <= al tamaño del arreglo porque es 6 y las posiciones llegan solo hasta el 5 ya que se cuenta desde el 0, la solución es ponerlo solo como <.
            suma += numeros[i];
        }
        System.out.println("Promedio: " + suma / numeros.length);*/

public class PromedioArreglo {
    public static double calcularPromedio(int[] numeros){
        if(numeros.length == 0){
            throw new IllegalArgumentException("El arreglo no puede estar vacío.");
        }

        long suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return (double) suma / numeros.length;
    }
    public static void main(String[] args) {
        int[] numeros = {4, 8, 15, 16, 23, 42};
        int[] numeros1 = {1, 2};
        int[] numeros2 = {7};
        int[] numeros3 = {-3, 3};
        int[] numeros4 = {2000000000, 2000000000};
        int[] numeros5 = {};

        System.out.println("El promedio es " + calcularPromedio(numeros));
        System.out.println("El promedio es " + calcularPromedio(numeros1));
        System.out.println("El promedio es " + calcularPromedio(numeros2));
        System.out.println("El promedio es " + calcularPromedio(numeros3));
        System.out.println("El promedio es " + calcularPromedio(numeros4));


        try{
            System.out.println("El promedio es " + calcularPromedio(numeros5));
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
