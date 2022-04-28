
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class UsuarioDto {
    
    @NotBlank
    private String nombre;
    private String apellido;
    private String titulo;
    private String acerca_de;
    private String foto_perfil;

    public UsuarioDto() {
    }

    public UsuarioDto(String nombre, String apellido, String titulo, String acerca_de, String foto_perfil) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acerca_de = acerca_de;
        this.foto_perfil = foto_perfil;
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

    public String getAcerca_de() {
        return acerca_de;
    }

    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }

    public String getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }
    
    
    
}
