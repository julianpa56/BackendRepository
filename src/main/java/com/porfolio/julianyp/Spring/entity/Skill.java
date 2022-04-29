
package com.porfolio.julianyp.Spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreSkill;
    private String porcentaje;
    private String logoSkill;

    public Skill() {
    }
   
    public Skill( String nombreSkill, String porcentaje, String logoSkill) {
        this.nombreSkill = nombreSkill;
        this.porcentaje = porcentaje;
        this.logoSkill = logoSkill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getLogoSkill() {
        return logoSkill;
    }

    public void setLogoSkill(String logoSkill) {
        this.logoSkill = logoSkill;
    }

        
}
