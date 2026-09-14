package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
       public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = teclado.nextInt();

        int[][] matriz = new int[n][n];

        // Llenar la matriz con números aleatorios entre -50 y 50
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = aleatorio.nextInt(101) - 50;
            }
        }

        // Mostrar la matriz
        System.out.println("\nMatriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcular la suma de la diagonal secundaria
        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma = suma + matriz[i][n - 1 - i];
        }

        System.out.println("\nSuma de la diagonal secundaria: " + suma);

        teclado.close();
    
}
}
