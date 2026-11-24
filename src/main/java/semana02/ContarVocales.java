package semana02;

public class ContarVocales {
    public static int contarVocales(String texto) {

        // Si el texto es null, devolvemos 0 porque no hay caracteres que contar.
        // Elegimos devolver 0 en lugar de lanzar una excepción para que el método
        // pueda responder directamente cuántas vocales contiene el texto recibido.
        if (texto == null) {
            return 0;
        }

        // Si el texto está vacío, devolvemos 0 porque no contiene vocales.
        if (texto.isEmpty()) {
            return 0;
        }

        int contador = 0;

        // Convertimos el texto a minúsculas para contar también las vocales
        // que originalmente estaban escritas en mayúsculas.
        texto = texto.toLowerCase();

        // Recorremos cada carácter del texto.
        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            // Contamos las vocales normales, las vocales con tilde y la ü.
            // Consideramos la ü como vocal porque representa una variante de la u.
            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u' ||
                    letra == 'á' || letra == 'é' || letra == 'í' ||
                    letra == 'ó' || letra == 'ú' || letra == 'ü') {

                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        // Caso 1: texto sin vocales.
        // Se espera: 0.
        System.out.println("Caso 1: " + contarVocales("rhythm"));

        // Caso 2: texto compuesto solamente por vocales.
        // Se espera: 5.
        System.out.println("Caso 2: " + contarVocales("aeiou"));

        // Caso 3: texto con mayúsculas y minúsculas.
        // Se espera: 5.
        System.out.println("Caso 3: " + contarVocales("HoLa MuNdO"));

        // Caso 4: texto con vocales con tilde.
        // Se espera: 5.
        System.out.println("Caso 4: " + contarVocales("áéíóú"));

        // Caso 5: texto con vocales normales, tildes y ü.
        // Se espera: 6.
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
    }
}


