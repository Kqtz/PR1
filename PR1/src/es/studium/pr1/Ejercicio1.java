package es.studium.pr1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int a, b, v = 0;
        do {
            a = (int) (Math.random() * 10) + 1; // Número aleatorio entre 1 y 10
            b = (int) (Math.random() * 20) + 1; // Número aleatorio entre 1 y 20
            v++;
        } while (a != b);
        System.out.println("Valor de v: " + v);
    }
}