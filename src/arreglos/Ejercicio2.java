package arreglos;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[] numerosPares = new int[100];

        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = i * 2;
        }

        System.out.println("100 primeros numeros pares:");

        for (int numero : numerosPares) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nNumeros pares en 10 lineas:");

        for (int i = 0; i < numerosPares.length; i++) {

            if (i % 10 == 0) {
                System.out.println();
                System.out.print("Linea " + ((i / 10) + 1) + ": ");
            }

            System.out.print(numerosPares[i] + " ");
        }
    }
}
