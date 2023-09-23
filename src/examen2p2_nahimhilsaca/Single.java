/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Single extends Lanzamiento {
    private Cancion cancion_single;

    public Single() {
        super();
    }

    public Single(Cancion cancion_single, String titulo_publicacion, String fecha_lanzamiento, int cont_likes) {
        super(titulo_publicacion, fecha_lanzamiento, cont_likes);
        this.cancion_single = cancion_single;
    }

    public Cancion getCancion_single() {
        return cancion_single;
    }

    public void setCancion_single(Cancion cancion_single) {
        this.cancion_single = cancion_single;
    }

    @Override
    public String toString() {
        return "Single" +super.toString()+ "cancion_single=" + cancion_single ;
    }
    
    
   

    

   
    
    
    
}
