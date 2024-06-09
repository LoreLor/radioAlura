package org.alura;

import org.alura.modelos.Cancion;
import org.alura.modelos.MisFavoritos;
import org.alura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        // instancio los objetos
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Forever");
        cancion1.setCantante("Kiss");

        Podcast podcast1 = new Podcast();
        podcast1.setPresentador("Gabriela Aguiar");
        podcast1.setTitulo("Cafe.Tech");

        // cancione
        for (int i = 0; i < 3000; i++) {
            cancion1.meGusta();
        }

        for (int i = 0; i < 300 ; i++) {
            cancion1.reproducciones();
        }
        //podcast
        for (int i = 0; i < 2000; i++) {
            podcast1.meGusta();
        }

        for (int i = 0; i < 500 ; i++) {
            podcast1.reproducciones();
        }

        //imprimo total de me gusta
        System.out.println("Total de me gusta: " + cancion1.getTotalMeGusta());
        //imprimo total de reproducciones
        System.out.println("Total de reproducciones: " + cancion1.getTotalReproducciones());

        System.out.println("Total de me gusta: " + podcast1.getTotalMeGusta());
        System.out.println("Total de reproducciones: " + podcast1.getTotalReproducciones());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.agregarAudio(podcast1);
        favoritos.agregarAudio(cancion1);
    }
}