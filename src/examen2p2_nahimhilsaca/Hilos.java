/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_nahimhilsaca;

import javax.swing.JProgressBar;

/**
 *
 * @author nahim
 */
public class Hilos extends Thread{
    
    private JProgressBar pg;
    private int segundos;
    private boolean avanzar;

    public Hilos(JProgressBar pg, int segundos) {
        this.pg = pg;
        this.segundos = segundos;
    }

    public JProgressBar getPg() {
        return pg;
    }

    public void setPg(JProgressBar pg) {
        this.pg = pg;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public void run() {
           }
    
    
    
    
    
}
