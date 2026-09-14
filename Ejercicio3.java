package arreglos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("Ingrese la cantidad de numeros: ");
        int n = teclado.nextInt();

        int[] numeros = new int[n];
        long[] factoriales = new long[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(8) + 1;
            factoriales[i] = calcularFactorial(numeros[i]);
        }

        System.out.println("\nNumeros iniciales:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nFactoriales:");

        for (long factorial : factoriales) {
            System.out.print(factorial + " ");
        }

        teclado.close();
    }

    public static long calcularFactorial(int numero) {

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}