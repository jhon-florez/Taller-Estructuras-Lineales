package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        int suma = 0;
        int numero;

        do {
            numero = aleatorio.nextInt(21) - 10;

            if (numero != 10) {
                numeros.add(numero);
                suma = suma + numero;
            }

        } while (numero != 10);

        double media = 0;

        if (!numeros.isEmpty()) {
            media = (double) suma / numeros.size();
        }

        System.out.println("Números leídos:");
        System.out.println(numeros);

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
