/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_proyecto_entornos;

/**
 *
 * @author Saul
 */
public class Usuario {
    private String username;
    private String contraseña;
    private String localidad;
    private String mail;
    private String tipo_usuario;

    public Usuario(String username, String contraseña, String localidad, String mail, String tipo_usuario) {
        this.username = username;
        this.contraseña = contraseña;
        this.localidad = localidad;
        this.mail = mail;
        this.tipo_usuario = tipo_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    
    
}
