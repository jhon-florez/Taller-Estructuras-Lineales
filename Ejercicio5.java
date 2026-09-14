package arreglos;

import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] numeros = new int[20];
        int[] invertidos = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(1000);
            invertidos[i] = invertirNumero(numeros[i]);
        }

        System.out.println("Arreglo original:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nArreglo con numeros invertidos:");

        for (int numero : invertidos) {
            System.out.print(numero + " ");
        }
    }

    public static int invertirNumero(int numero) {

        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        return invertido;
    }
}