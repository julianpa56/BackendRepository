
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class ProyectoDto {
    
    @NotBlank
    private String nombre;
    private String fecharealizacion;
    private String descripcion;
    private String linkproyecto;

    public ProyectoDto() {
    }

    public ProyectoDto(String nombre, String fecharealizacion, String descripcion, String linkproyecto) {
        this.nombre = nombre;
        this.fecharealizacion = fecharealizacion;
        this.descripcion = descripcion;
        this.linkproyecto = linkproyecto;
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
