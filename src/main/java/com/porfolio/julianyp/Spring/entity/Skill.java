
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
    private String nombre;
    private String porcentaje;
    private String logoskill;

    public Skill() {
    }

    public Skill(String nombre, String porcentaje, String logoskill) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.logoskill = logoskill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getLogoskill() {
        return logoskill;
    }

    public void setLogoskill(String logoskill) {
        this.logoskill = logoskill;
    }
   
    
        
}
