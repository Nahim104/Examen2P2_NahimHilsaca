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
public class Cliente extends Usuario{
    
    private  ArrayList <Cancion> canciones_favoritas;
    private ArrayList <Lista_Reproduccion> reproduccion_creada;
    private ArrayList <Lista_Reproduccion> reproduccion_megusta;

    public Cliente(String username, String contrasena, int edad) {
        super(username, contrasena, edad);
    }

    public Cliente() {
        super();
    }
    
    

    public ArrayList<Cancion> getCanciones_favoritas() {
        return canciones_favoritas;
    }

    public void setCanciones_favoritas(ArrayList<Cancion> canciones_favoritas) {
        this.canciones_favoritas = canciones_favoritas;
    }

    public ArrayList<Lista_Reproduccion> getReproduccion_creada() {
        return reproduccion_creada;
    }

    public void setReproduccion_creada(ArrayList<Lista_Reproduccion> reproduccion_creada) {
        this.reproduccion_creada = reproduccion_creada;
    }

    public ArrayList<Lista_Reproduccion> getReproduccion_megusta() {
        return reproduccion_megusta;
    }

    public void setReproduccion_megusta(ArrayList<Lista_Reproduccion> reproduccion_megusta) {
        this.reproduccion_megusta = reproduccion_megusta;
    }

    @Override
    public String toString() {
        return "Cliente"+ super.toString() + "canciones_favoritas=" + canciones_favoritas + ", reproduccion_creada=" + reproduccion_creada + ", reproduccion_megusta=" + reproduccion_megusta;
    }
    
    
    
    
    
}
