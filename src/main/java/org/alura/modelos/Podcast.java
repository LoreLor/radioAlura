package org.alura.modelos;

public class Podcast extends Audio{
    private String presentador;
    private String descripcion;

    //getters settes

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //sobre-escribir método del audio

    @Override
    public int getClasificacion() {
        return getTotalMeGusta() > 2000? 8 : 4;
    }
}
