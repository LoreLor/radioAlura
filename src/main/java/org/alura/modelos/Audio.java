package org.alura.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalReproducciones;
    private int totalMeGusta;
    private int meGusta;
    private int clasificacion;

    //getters-setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(Integer meGusta) {
        this.meGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    // suma cada click
    public void meGusta() {
        this.totalMeGusta++;
    }

    //suma cantidad de reproducciones
    public void reproducciones(){
        this.totalReproducciones++;
    }
}
