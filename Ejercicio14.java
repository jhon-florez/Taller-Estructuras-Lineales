package matrices;

import java.util.Scanner;

public class Ejercicio14 {
      public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int m = teclado.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int n = teclado.nextInt();

        int[][] matriz = new int[m][n];

        // Llenar la matriz
        System.out.println("\nIngrese los valores de la matriz:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Crear la matriz transpuesta
        int[][] transpuesta = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar matriz original
        System.out.println("\nMatriz original:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar matriz transpuesta
        System.out.println("\nMatriz transpuesta:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }

        teclado.close();
    }
}
