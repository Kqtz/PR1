package es.studium.pr1;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {10, 3, 7, 5, 8, 2, 9, 4, 1, 6};
        for (int i = 1; i < numeros.length; i++) {
            int key = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > key) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = key;
        }
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}