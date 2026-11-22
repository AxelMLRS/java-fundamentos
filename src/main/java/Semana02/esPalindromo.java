package Semana02;

public class esPalindromo {
    public static boolean palindromo(String texto){
        if (texto == null || texto.isEmpty()){
            return false;
        }

        texto = texto.toLowerCase().replace(" ", "");

        int izquierda = 0;
        int derecha = texto.length() - 1;

        while(izquierda < derecha){
            if (texto.charAt(izquierda) != texto.charAt(derecha)){
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromo("Anita lava la tina"));
        System.out.println(palindromo("Java"));
        System.out.println(palindromo(""));
        System.out.println(palindromo(null));
    }
}
