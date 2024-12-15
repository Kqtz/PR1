package es.studium.pr1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la velocidad en m/s: ");
        double velocidadMs = scanner.nextDouble();
        double velocidadKmH = velocidadMs * 3.6;
        System.out.println("La velocidad en km/h es: " + velocidadKmH);
        scanner.close();
    }
}