
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class UsuarioDto {
    
    @NotBlank
    private String nombre;
    private String apellido;
    private String titulo;
    private String acercade;
    private String fotoperfil;

    public UsuarioDto() {
    }

    public UsuarioDto(String nombre, String apellido, String titulo, String acercade, String fotoperfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acercade = acercade;
        this.fotoperfil = fotoperfil;
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

    public String getAcercade() {
        return acercade;
    }

    public void setAcercade(String acercade) {
        this.acercade = acercade;
    }

    public String getFotoperfil() {
        return fotoperfil;
    }

    public void setFotoperfil(String fotoperfil) {
        this.fotoperfil = fotoperfil;
    }

    
}
