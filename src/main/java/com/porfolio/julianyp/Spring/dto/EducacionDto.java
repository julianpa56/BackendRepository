
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class EducacionDto {
    @NotBlank
    private String nombreInstitucion;
    private String titulo;
    private String logoInstitucion;
    private String fechaIngreso;
    private String fechaEgreso;

    public EducacionDto() {
    }

    public EducacionDto(String nombreInstitucion, String titulo, String logoInstitucion, String fechaIngreso, String fechaEgreso) {
        this.nombreInstitucion = nombreInstitucion;
        this.titulo = titulo;
        this.logoInstitucion = logoInstitucion;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
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
