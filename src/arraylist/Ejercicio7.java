package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio7 {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        // Generar los 20 primeros números pares
        for (int i = 1; i <= 20; i++) {
            numeros.add(i * 2);
        }

        // Mostrar ArrayList inicial
        System.out.println("ArrayList inicial:");
        System.out.println(numeros);

        // Pedir número para insertar
        System.out.print("Ingrese un número para insertar: ");
        int numero = teclado.nextInt();

        numeros.add(numero);

        // Ordenar de menor a mayor
        Collections.sort(numeros);

        // Mostrar ArrayList después de insertar
        System.out.println("ArrayList después de insertar:");
        System.out.println(numeros);

        // Pedir número para eliminar
        System.out.print("Ingrese el número que desea eliminar: ");
        int eliminar = teclado.nextInt();

        if (numeros.contains(eliminar)) {
            numeros.remove(Integer.valueOf(eliminar));
            System.out.println("Número eliminado correctamente.");
        } else {
            System.out.println("El número no se encuentra en el ArrayList.");
        }

        // Mostrar ArrayList final
        System.out.println("ArrayList final:");
        System.out.println(numeros);

        teclado.close();
}
}