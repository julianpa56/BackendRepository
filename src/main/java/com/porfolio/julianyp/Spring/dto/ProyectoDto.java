
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class ProyectoDto {
    
    @NotBlank
    private String nombre_proyecto;
    private String fecha_realizacion;
    private String descripcion;
    private String link_proyecto;
    

    public ProyectoDto() {
    }

    public ProyectoDto(String nombre_proyecto, String fecha_realizacion, String descripcion, String link_proyecto, int usuario_id) {
        this.nombre_proyecto = nombre_proyecto;
        this.fecha_realizacion = fecha_realizacion;
        this.descripcion = descripcion;
        this.link_proyecto = link_proyecto;
        
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
