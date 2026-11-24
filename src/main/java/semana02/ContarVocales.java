
public class ContarVocales {

    public static int contarVocales(String texto) {

        // Si el texto es null, devolvemos 0 porque un texto inexistente
        // no contiene vocales que contar. Elegimos 0 en lugar de una excepción
        // porque es una respuesta válida para el propósito de este método.
        if (texto == null) {
            return 0;
        }

        int contador = 0;

        // Recorremos cada carácter del texto.
        for (int i = 0; i < texto.length(); i++) {

            // Si el carácter es una vocal, incrementamos el contador.
            if (esVocal(texto.charAt(i))) {
                contador++;
            }
        }

        return contador;
    }

    // Determina si un carácter es una vocal.
    private static boolean esVocal(char letra) {

        // Convertimos el carácter a minúscula para reconocer también
        // las vocales que originalmente estaban en mayúscula.
        letra = Character.toLowerCase(letra);

        // Consideramos las vocales con tilde y la ü como vocales.
        // No contemplamos otras variantes Unicode, como à o ï,
        // porque nos limitamos a las vocales utilizadas en español.
        return letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u' || letra == 'á' ||
                letra == 'é' || letra == 'í' || letra == 'ó' ||
                letra == 'ú' || letra == 'ü';
    }

    public static void main(String[] args) {

        // Caso 1: texto sin vocales.
        // Se espera: 0.
        System.out.println("Caso 1: " + contarVocales("rhythm"));

        // Caso 2: texto compuesto solamente por vocales.
        // Se espera: 5.
        System.out.println("Caso 2: " + contarVocales("aeiou"));

        // Caso 3: texto con mayúsculas y minúsculas.
        // Se espera: 4.
        System.out.println("Caso 3: " + contarVocales("HoLa MuNdO"));

        // Caso 4: texto con vocales con tilde.
        // Se espera: 5.
        System.out.println("Caso 4: " + contarVocales("áéíóú"));

        // Caso 5: texto con vocales normales y ü.
        // Se espera: 4.
        System.out.println("Caso 5: " + contarVocales("pingüino"));

        // Caso 6: texto vacío.
        // Se espera: 0.
        System.out.println("Caso 6: " + contarVocales(""));

        // Caso 7: texto null.
        // Se espera: 0.
        System.out.println("Caso 7: " + contarVocales(null));

        // Caso 8: texto con consonantes, números y símbolos.
        // Se espera: 2.
        System.out.println("Caso 8: " + contarVocales("Java 123!"));

        // Caso 9: vocales con tilde en mayúscula.
        // Se espera: 3.
        System.out.println("Caso 9: " + contarVocales("ÁÉÍ"));
    }
}
