
package com.porfolio.julianyp.Spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_skill;
    private String porcentaje;
    private String logo_skill;
    private int usuario_id;

    public Skill() {
    }
   
    public Skill( String nombre_skill, String porcentaje, String logo_skill, int usuario_id) {
        this.nombre_skill = nombre_skill;
        this.porcentaje = porcentaje;
        this.logo_skill = logo_skill;
        this.usuario_id = usuario_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_skill() {
        return nombre_skill;
    }

    public void setNombre_skill(String nombre_skill) {
        this.nombre_skill = nombre_skill;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getLogo_skill() {
        return logo_skill;
    }

    public void setLogo_skill(String logo_skill) {
        this.logo_skill = logo_skill;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
    
}