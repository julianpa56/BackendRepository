
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class UsuarioDto {
    
    @NotBlank
    private String nombre;
    private String apellido;
    private String titulo;
    private String acercaDe;
    private String fotoPerfil;

    public UsuarioDto() {
    }

    public UsuarioDto(String nombre, String apellido, String titulo, String acercaDe, String fotoPerfil) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acercaDe = acercaDe;
        this.fotoPerfil = fotoPerfil;
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

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

       
    
}
