
package com.porfolio.julianyp.Spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String fecharealizacion;
    private String descripcion;
    private String linkproyecto;

    public Proyecto() {
    }

    public Proyecto(String nombre, String fecharealizacion, String descripcion, String linkproyecto) {
        this.nombre = nombre;
        this.fecharealizacion = fecharealizacion;
        this.descripcion = descripcion;
        this.linkproyecto = linkproyecto;
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

    public String getFecharealizacion() {
        return fecharealizacion;
    }

    public void setFecharealizacion(String fecharealizacion) {
        this.fecharealizacion = fecharealizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLinkproyecto() {
        return linkproyecto;
    }

    public void setLinkproyecto(String linkproyecto) {
        this.linkproyecto = linkproyecto;
    }

    

    
    
}
