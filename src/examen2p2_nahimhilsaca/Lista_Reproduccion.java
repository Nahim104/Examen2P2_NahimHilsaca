/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_nahimhilsaca;

import java.util.ArrayList;

/**
 *
 * @author nahim
 */
public class Lista_Reproduccion {
    
    private String nombre_reproduccion;
    private int cant_likes;
    private ArrayList< Cancion> canciones_reproduccion;

    public Lista_Reproduccion() {
    }

    public Lista_Reproduccion(String nombre_reproduccion, int cant_likes, ArrayList<Cancion> canciones_reproduccion) {
        this.nombre_reproduccion = nombre_reproduccion;
        this.cant_likes = cant_likes;
        this.canciones_reproduccion = canciones_reproduccion;
    }

    public String getNombre_reproduccion() {
        return nombre_reproduccion;
    }

    public void setNombre_reproduccion(String nombre_reproduccion) {
        this.nombre_reproduccion = nombre_reproduccion;
    }

    public int getCant_likes() {
        return cant_likes;
    }

    public void setCant_likes(int cant_likes) {
        this.cant_likes = cant_likes;
    }

    public ArrayList<Cancion> getCanciones_reproduccion() {
        return canciones_reproduccion;
    }

    public void setCanciones_reproduccion(ArrayList<Cancion> canciones_reproduccion) {
        this.canciones_reproduccion = canciones_reproduccion;
    }

    @Override
    public String toString() {
        return "Lista_Reproduccion" + "nombre_reproduccion=" + nombre_reproduccion + ", cant_likes=" + cant_likes + ", canciones_reproduccion=" + canciones_reproduccion;
    }
    
    
    
    
    
    
    
}
