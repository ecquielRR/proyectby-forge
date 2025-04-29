package clases;
import java.util.ArrayList;
import java.util.List;

public class Algoritmos {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String stringEnReversa(String texto) {
        char[] caracteres = texto.toCharArray();
        char[] reverso = new char[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            reverso[i] = caracteres[caracteres.length - 1 - i];
        }
        return new String(reverso);
    }
    public static boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();
        String textoReverso = stringEnReversa(textoLimpio);
        return textoLimpio.equals(textoReverso);
    }

    public static List<String> secuenciaFizzBuzz(int limite) {
        List<String> resultado = new ArrayList<>();
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultado.add("Fizz");
            } else if (i % 5 == 0) {
                resultado.add("Buzz");
            } else {
                resultado.add(String.valueOf(i));
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println("¿Es 10 par? " + esPar(10));
        System.out.println("¿Es 7 primo? " + esPrimo(7));
        System.out.println("La reversa de 'Hola' es: " + stringEnReversa("Hola"));
        System.out.println("¿Es 'Anita lava la tina' un palíndromo? " + esPalindromo("Anita lava la tina"));
        System.out.println("Secuencia FizzBuzz hasta 15:");
        List<String> fizzBuzzSecuencia = secuenciaFizzBuzz(15);
        System.out.println(fizzBuzzSecuencia);
    }
}
