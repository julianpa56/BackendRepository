
package com.porfolio.julianyp.Spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre_institucion;
    private String titulo;
    private String logo_institucion;
    private String fecha_ingreso;
    private String fecha_egreso;
    private int usuario_id;

    public Educacion() {
    }

    public Educacion(String nombre_institucion, String titulo, String logo_institucion, String fecha_ingreso, String fecha_egreso, int usuario_id) {
        this.nombre_institucion = nombre_institucion;
        this.titulo = titulo;
        this.logo_institucion = logo_institucion;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = fecha_egreso;
        this.usuario_id = usuario_id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_institucion() {
        return nombre_institucion;
    }

    public void setNombre_institucion(String nombre_institucion) {
        this.nombre_institucion = nombre_institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLogo_institucion() {
        return logo_institucion;
    }

    public void setLogo_institucion(String logo_institucion) {
        this.logo_institucion = logo_institucion;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_egreso() {
        return fecha_egreso;
    }

    public void setFecha_egreso(String fecha_egreso) {
        this.fecha_egreso = fecha_egreso;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
    
}
