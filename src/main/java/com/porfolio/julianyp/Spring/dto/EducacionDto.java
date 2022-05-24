
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class EducacionDto {
    @NotBlank
    private String nombre;
    private String titulo;
    private String logoInstitucion;
    private String fechaIngreso;
    private String fechaEgreso;

    public EducacionDto() {
    }

    public EducacionDto(String nombre, String titulo, String logoInstitucion, String fechaIngreso, String fechaEgreso) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.logoInstitucion = logoInstitucion;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
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

    public String getLogoInstitucion() {
        return logoInstitucion;
    }

    public void setLogoInstitucion(String logoInstitucion) {
        this.logoInstitucion = logoInstitucion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    
}
