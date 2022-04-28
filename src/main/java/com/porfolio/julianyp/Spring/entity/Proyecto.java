
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
    private String nombre_proyecto;
    private String fecha_realizacion;
    private String descripcion;
    private String link_proyecto;

    public Proyecto() {
    }

    public Proyecto( String nombre_proyecto, String fecha_realizacion, String descripcion, String link_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
        this.fecha_realizacion = fecha_realizacion;
        this.descripcion = descripcion;
        this.link_proyecto = link_proyecto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(String fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink_proyecto() {
        return link_proyecto;
    }

    public void setLink_proyecto(String link_proyecto) {
        this.link_proyecto = link_proyecto;
    }
    
}
