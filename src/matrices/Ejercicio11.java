package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("Ingrese el número de filas: ");
        int m = teclado.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int n = teclado.nextInt();

        int[][] matriz = new int[m][n];

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
            }
        }

        // Mostrar la matriz
        System.out.println("\nMatriz:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Pedir número a buscar
        System.out.print("\nIngrese el número que desea buscar: ");
        int buscar = teclado.nextInt();

        boolean encontrado = false;

        // Buscar la primera aparición
        for (int i = 0; i < m && !encontrado; i++) {

            for (int j = 0; j < n; j++) {

                if (matriz[i][j] == buscar) {

                    System.out.println("Número encontrado.");
                    System.out.println("Fila: " + i);
                    System.out.println("Columna: " + j);

                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El número no se encuentra en la matriz.");
        }

        teclado.close();
}
}