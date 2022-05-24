
package com.porfolio.julianyp.Spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "educacion")
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String titulo;
    private String logoinstitucion;
    private String fechaingreso;
    private String fechaegreso;

    public Educacion() {
    }

    public Educacion(String nombre, String titulo, String logoinstitucion, String fechaingreso, String fechaegreso) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.logoinstitucion = logoinstitucion;
        this.fechaingreso = fechaingreso;
        this.fechaegreso = fechaegreso;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLogoinstitucion() {
        return logoinstitucion;
    }

    public void setLogoinstitucion(String logoinstitucion) {
        this.logoinstitucion = logoinstitucion;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getFechaegreso() {
        return fechaegreso;
    }

    public void setFechaegreso(String fechaegreso) {
        this.fechaegreso = fechaegreso;
    }

    
    
}
