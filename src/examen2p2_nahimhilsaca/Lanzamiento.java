/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Lanzamiento {
    
    private String titulo_publicacion;
    private String fecha_lanzamiento;
    private int cont_likes;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo_publicacion, String fecha_lanzamiento, int cont_likes) {
        this.titulo_publicacion = titulo_publicacion;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.cont_likes = cont_likes;
    }

    public String getTitulo_publicacion() {
        return titulo_publicacion;
    }

    public void setTitulo_publicacion(String titulo_publicacion) {
        this.titulo_publicacion = titulo_publicacion;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public int getCont_likes() {
        return cont_likes;
    }

    public void setCont_likes(int cont_likes) {
        this.cont_likes = cont_likes;
    }

    @Override
    public String toString() {
        return "Lanzamiento" + "titulo_publicacion=" + titulo_publicacion + ", fecha_lanzamiento=" + fecha_lanzamiento + ", cont_likes=" + cont_likes ;
    }
    
    
    
    
}
