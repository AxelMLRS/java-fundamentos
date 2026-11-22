package semana02;

public class EsPalindromo {
    public static boolean esPalindromo(String texto){
        if (texto == null){
            return false;
        }

        String textoLimpio = texto.toLowerCase().replace(" ", "");

        if (textoLimpio.isEmpty()){
            return true; //Una cadena vacía es palíndromo porque no hay caracteres que comparar que contradigan su lectura inversa.
        }

        int izquierda = 0;
        int derecha = textoLimpio.length() - 1;

        while(izquierda < derecha){
            if (textoLimpio.charAt(izquierda) != textoLimpio.charAt(derecha)){
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Se espera true porque "radar" se lee igual al revés.
        System.out.println("radar: " + esPalindromo("radar"));

        // Se espera true porque se ignoran los espacios.
        System.out.println("Anita lava la tina: " + esPalindromo("Anita lava la tina"));

        // Se espera true porque se ignoran las diferencias entre mayúsculas y minúsculas.
        System.out.println("Ana: " + esPalindromo("Ana"));

        // Se espera true porque una cadena de un solo carácter es palíndromo.
        System.out.println("a: " + esPalindromo("a"));

        // Se espera false porque "Java" no se lee igual al revés.
        System.out.println("Java: " + esPalindromo("Java"));

        // Se espera false porque "Hola mundo" no es palíndromo.
        System.out.println("Hola mundo: " + esPalindromo("Hola mundo"));

        // Se espera true porque una cadena vacía se considera palíndromo.
        System.out.println("Vacío: " + esPalindromo(""));

        // Se espera false porque null no representa una cadena existente.
        System.out.println("Null: " + esPalindromo(null));

        // Se espera true porque al ignorar los espacios queda una cadena vacía.
        System.out.println("Solo espacios: " + esPalindromo("   "));
    }
}
