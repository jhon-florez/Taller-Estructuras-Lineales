package arreglos;

import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] numeros = new int[25];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(101) - 50;
        }

        int menor = numeros[0];
        int mayor = numeros[0];

        for (int numero : numeros) {

            if (numero < menor) {
                menor = numero;
            }

            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("Numeros generados:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nNumero menor: " + menor);
        System.out.println("Numero mayor: " + mayor);
    }
}