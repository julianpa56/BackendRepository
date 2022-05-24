
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class SkillDto {
    
    @NotBlank
    private String nombre;
    private String porcentaje;
    private String logoskill;

        public SkillDto() {
    }

    public SkillDto(String nombre, String porcentaje, String logoskill) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.logoskill = logoskill;
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
