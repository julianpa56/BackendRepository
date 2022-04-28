
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class SkillDto {
    
    @NotBlank
    private String nombre_skill;
    private String porcentaje;
    private String logo_skill;

        public SkillDto() {
    }
        
    public SkillDto(String nombre_skill, String porcentaje, String logo_skill, int usuario_id) {
        this.nombre_skill = nombre_skill;
        this.porcentaje = porcentaje;
        this.logo_skill = logo_skill;
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

    
    
}
