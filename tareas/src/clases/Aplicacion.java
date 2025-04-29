package clases;

import java.util.List;

public class Aplicacion {

    public static void main(String[] args) {
        System.out.println("--- Demostración de la clase Algoritmos ---");
        System.out.println();

        System.out.println("--- Método esPar() ---");
        int numeroPar = 10;
        int numeroImpar = 7;
        System.out.println("¿Es " + numeroPar + " par? " + Algoritmos.esPar(numeroPar));
        System.out.println("¿Es " + numeroImpar + " par? " + Algoritmos.esPar(numeroImpar));
        System.out.println();

        System.out.println("--- Método esPrimo() ---");
        int numeroPrimo = 13;
        int numeroNoPrimo = 15;
        int numeroUno = 1;
        int numeroNegativo = -5;
        System.out.println("¿Es " + numeroPrimo + " primo? " + Algoritmos.esPrimo(numeroPrimo));
        System.out.println("¿Es " + numeroNoPrimo + " primo? " + Algoritmos.esPrimo(numeroNoPrimo));
        System.out.println("¿Es " + numeroUno + " primo? " + Algoritmos.esPrimo(numeroUno));
        System.out.println("¿Es " + numeroNegativo + " primo? " + Algoritmos.esPrimo(numeroNegativo));
        System.out.println();

        System.out.println("--- Método stringEnReversa() ---");
        String textoOriginal = "Hola Mundo";
        String textoReverso = Algoritmos.stringEnReversa(textoOriginal);
        System.out.println("El texto original es: " + textoOriginal);
        System.out.println("El texto en reversa es: " + textoReverso);
        System.out.println();

        System.out.println("--- Método esPalindromo() ---");
        String palindromo1 = "radar";
        String palindromo2 = "Anita lava la tina";
        String noPalindromo = "Hola";
        System.out.println("¿Es '" + palindromo1 + "' un palíndromo? " + Algoritmos.esPalindromo(palindromo1));
        System.out.println("¿Es '" + palindromo2 + "' un palíndromo? " + Algoritmos.esPalindromo(palindromo2));
        System.out.println("¿Es '" + noPalindromo + "' un palíndromo? " + Algoritmos.esPalindromo(noPalindromo));
        System.out.println();

        System.out.println("--- Método secuenciaFizzBuzz() ---");
        int limiteFizzBuzz = 15;
        List<String> secuencia = Algoritmos.secuenciaFizzBuzz(limiteFizzBuzz);
        System.out.println("Secuencia FizzBuzz hasta " + limiteFizzBuzz + ":");
        System.out.println(secuencia);
       
    }
}

