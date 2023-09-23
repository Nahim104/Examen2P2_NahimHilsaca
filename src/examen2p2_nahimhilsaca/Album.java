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
public class Album extends Lanzamiento{
    
    private int cant_canciones;
    private ArrayList <Cancion> canciones_album;

    public Album() {
        super();
    }

    public Album(int cant_canciones, String titulo_publicacion, String fecha_lanzamiento, int cont_likes) {
        super(titulo_publicacion, fecha_lanzamiento, cont_likes);
        this.cant_canciones = cant_canciones;
    }
    
    

    public int getCant_canciones() {
        return cant_canciones;
    }

    public void setCant_canciones(int cant_canciones) {
        this.cant_canciones = cant_canciones;
    }

    public ArrayList<Cancion> getCanciones_album() {
        return canciones_album;
    }

    public void setCanciones_album(ArrayList<Cancion> canciones_album) {
        this.canciones_album = canciones_album;
    }

    @Override
    public String toString() {
        return "Album" + super.toString()+ "cant_canciones=" + cant_canciones + ", canciones_album=" + canciones_album ;
    }
    
    
    
    
    
    
    
}
