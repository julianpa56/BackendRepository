package com.porfolio.julianyp.Spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String acercade;
    private String fotoperfil;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String titulo, String acercade, String fotoperfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acercade = acercade;
        this.fotoperfil = fotoperfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAcercade() {
        return acercade;
    }

    public void setAcercade(String acercade) {
        this.acercade = acercade;
    }

    public String getFotoperfil() {
        return fotoperfil;
    }

    public void setFotoperfil(String fotoperfil) {
        this.fotoperfil = fotoperfil;
    }

    
    
}