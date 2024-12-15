package es.studium.pr1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cadena a cifrar: ");
        String texto = scanner.nextLine();
        System.out.print("Ingrese el número de desplazamientos (1-28): ");
        int desplazamiento = scanner.nextInt();
        desplazamiento = desplazamiento % 26;
        StringBuilder cifrado = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + desplazamiento) % 26 + base);
            }
            cifrado.append(c);
        }

        System.out.println("Texto cifrado: " + cifrado);
        scanner.close();
    }
}