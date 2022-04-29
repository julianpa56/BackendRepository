
package com.porfolio.julianyp.Spring.dto;

import javax.validation.constraints.NotBlank;


public class SkillDto {
    
    @NotBlank
    private String nombreSkill;
    private String porcentaje;
    private String logoSkill;

        public SkillDto() {
    }
        
    public SkillDto(String nombreSkill, String porcentaje, String logoSkill) {
        this.nombreSkill = nombreSkill;
        this.porcentaje = porcentaje;
        this.logoSkill = logoSkill;
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
