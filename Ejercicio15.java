package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("Ingrese el número de filas: ");
        int m = teclado.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int n = teclado.nextInt();

        if (m < 2) {
            System.out.println("La matriz debe tener mínimo 2 filas.");
            teclado.close();
            return;
        }

        int[][] matriz = new int[m][n];

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
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

        // Intercambiar primera y segunda fila
        int[] temporal = matriz[0];
        matriz[0] = matriz[1];
        matriz[1] = temporal;

        // Mostrar matriz después del intercambio
        System.out.println("\nMatriz después de intercambiar las dos primeras filas:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        teclado.close();
    }
}
