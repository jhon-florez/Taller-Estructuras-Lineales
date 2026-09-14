package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio8 {
      public static void main(String[] args) {

        Random aleatorio = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        // Generar 100 números aleatorios entre 1 y 20
        for (int i = 0; i < 100; i++) {
            int numero = aleatorio.nextInt(20) + 1;
            numeros.add(numero);
        }

        System.out.println("ArrayList generado:");
        System.out.println(numeros);

        int numeroMayor = 0;
        int frecuenciaMayor = 0;

        System.out.println("\nTabla de frecuencias");
        System.out.println("--------------------");
        System.out.println("Número\tFrecuencia");

        // Contar cuántas veces aparece cada número
        for (int numero = 1; numero <= 20; numero++) {

            int frecuencia = 0;

            for (int valor : numeros) {

                if (valor == numero) {
                    frecuencia++;
                }
            }

            System.out.println(numero + "\t" + frecuencia);

            // Buscar el número con mayor frecuencia
            if (frecuencia > frecuenciaMayor) {
                frecuenciaMayor = frecuencia;
                numeroMayor = numero;
            }
        }

        System.out.println("\nNúmero que más se repite: " + numeroMayor);
        System.out.println("Cantidad de veces: " + frecuenciaMayor);
    }
}
