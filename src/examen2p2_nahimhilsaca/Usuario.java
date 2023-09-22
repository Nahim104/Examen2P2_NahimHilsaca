/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Usuario {
    private String username;
    private String contrasena;
    private int edad;

    public Usuario(String username, String contrasena, int edad) {
        this.username = username;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public Usuario() {
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", edad=" + edad + '}';
    }
    
    
}
