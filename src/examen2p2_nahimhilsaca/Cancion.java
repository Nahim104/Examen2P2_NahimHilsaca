/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Cancion {
    
    private String titulo;
    public double tiempo_duracion;
    private String referencia_album_single;

    public Cancion() {
    }

    public Cancion(String titulo, double tiempo_duracion, String referencia_album_single) {
        this.titulo = titulo;
        this.tiempo_duracion = tiempo_duracion;
        this.referencia_album_single = referencia_album_single;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTiempo_duracion() {
        return tiempo_duracion;
    }

    public void setTiempo_duracion(double tiempo_duracion) {
        this.tiempo_duracion = tiempo_duracion;
    }

    public String getReferencia_album_single() {
        return referencia_album_single;
    }

    public void setReferencia_album_single(String referencia_album_single) {
        this.referencia_album_single = referencia_album_single;
    }

    @Override
    public String toString() {
        return "Cancion" + "titulo=" + titulo + ", tiempo_duracion=" + tiempo_duracion + ", referencia_album_single=" + referencia_album_single;
    }
    
    
    
}
