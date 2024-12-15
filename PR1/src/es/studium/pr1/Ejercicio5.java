package es.studium.pr1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<>();
        String[] palos = {"Copas", "Oros", "Bastos", "Espadas"};
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Sota", "Caballo", "Rey"};

        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(valor + " de " + palo);
            }
        }

        Collections.shuffle(cartas);
        System.out.println("Baraja mezclada: " + cartas);
    }
}
