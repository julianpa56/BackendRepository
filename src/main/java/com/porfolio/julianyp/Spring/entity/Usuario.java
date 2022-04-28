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
    private String acerca_de;
    private String foto_perfil;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String titulo, String acerca_de, String foto_perfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acerca_de = acerca_de;
        this.foto_perfil = foto_perfil;
    }
    public Usuario(String nombre, String apellido, String titulo, String acerca_de, String foto_perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acerca_de = acerca_de;
        this.foto_perfil = foto_perfil;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAcerca_de() {
        return acerca_de;
    }

    public String getFoto_perfil() {
        return foto_perfil;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }
    
    
}
