package org.alura.modelos;

import org.w3c.dom.ls.LSOutput;

public class MisFavoritos {
    // méto´do para agregar un audio (cancion o podcast)
    public void agregarAudio(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " Es uno de los favoritos escuchados");
        }
    }
}
