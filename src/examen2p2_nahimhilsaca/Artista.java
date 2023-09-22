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
public class Artista extends Usuario {
    
    private String num_artistico;
    private ArrayList <Cancion> canciones_plataforma;
    private ArrayList <Album> albumes_publicados;

    public Artista(String username, String contrasena, int edad) {
        super(username, contrasena, edad);
    }

    public Artista(String num_artistico, String username, String contrasena, int edad) {
        super(username, contrasena, edad);
        this.num_artistico = num_artistico;
    }

    
    

    public String getNum_artistico() {
        return num_artistico;
    }

    public void setNum_artistico(String num_artistico) {
        this.num_artistico = num_artistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes_publicados() {
        return albumes_publicados;
    }

    public void setAlbumes_publicados(ArrayList<Album> albumes_publicados) {
        this.albumes_publicados = albumes_publicados;
    }

    @Override
    public String toString() {
        return "Artista" + super.toString()+ "num_artistico=" + num_artistico + ", canciones=" + canciones + ", albumes_publicados=" + albumes_publicados ;
    }
    
    
    
    
}
