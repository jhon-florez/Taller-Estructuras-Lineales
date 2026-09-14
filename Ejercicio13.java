package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = teclado.nextInt();

        int[][] matriz = new int[n][n];

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
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

        // Determinar si es simétrica
        boolean simetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }

            if (!simetrica) {
                break;
            }
        }

        if (simetrica) {
            System.out.println("\nLa matriz es simétrica.");
        } else {
            System.out.println("\nLa matriz no es simétrica.");
        }

        // Mostrar las cuatro esquinas
        System.out.println("\nEsquinas de la matriz:");

        System.out.println("Esquina superior izquierda: " + matriz[0][0]);
        System.out.println("Esquina superior derecha: " + matriz[0][n - 1]);
        System.out.println("Esquina inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Esquina inferior derecha: " + matriz[n - 1][n - 1]);

        teclado.close();
    }
}
