package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio9 {
     public static void main(String[] args) {

        Random aleatorio = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        // Generar 20 números aleatorios entre 1 y 100
        for (int i = 0; i < 20; i++) {
            int numero = aleatorio.nextInt(100) + 1;
            numeros.add(numero);
        }

        System.out.println("Lista original:");
        System.out.println(numeros);

        // Ordenar de menor a mayor
        Collections.sort(numeros);

        System.out.println("\nLista de menor a mayor:");
        System.out.println(numeros);

        // Ordenar de mayor a menor
        Collections.reverse(numeros);

        System.out.println("\nLista de mayor a menor:");
        System.out.println(numeros);

        // Separar números pares e impares
        for (int numero : numeros) {

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("\nLista de números pares:");
        System.out.println(pares);

        System.out.println("\nLista de números impares:");
        System.out.println(impares);
    }
}
