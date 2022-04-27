/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.julianyp.Spring.Controller;

import com.porfolio.julianyp.Spring.dto.Mensaje;
import com.porfolio.julianyp.Spring.dto.SkillDto;
import com.porfolio.julianyp.Spring.entity.Skill;
import com.porfolio.julianyp.Spring.service.SkillService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author julia
 */
@RestController
@RequestMapping("/skills")
public class SkillController {
    @Autowired
    SkillService skillService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Skill>> list(){
        List<Skill> list = skillService.list();
        return new ResponseEntity<List<Skill>>(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Skill> getById(@PathVariable("id")int id){
        if (!skillService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Skill skill= skillService.getOne(id).get();
        return new ResponseEntity(skill, HttpStatus.OK);
    }
    @GetMapping("/detail/{nombre_skill}")
    public ResponseEntity<Skill> getByNombre(@PathVariable("nombre_skill")String nombre_skill){
        if (!skillService.existsByNombre(nombre_skill))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Skill skill = (Skill) skillService.getByNombre(nombre_skill);
        return new ResponseEntity(skill, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody SkillDto skillDto){
        if(StringUtils.isBlank(skillDto.getNombre_skill()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        Skill skill = new Skill(skillDto.getNombre_skill(),skillDto.getPorcentaje(),skillDto.getLogo_skill(),skillDto.getUsuario_id());
        skillService.save(skill);
        return new ResponseEntity(new Mensaje("skill creado"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody SkillDto skillDto){
        if (!skillService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        if(StringUtils.isBlank(skillDto.getNombre_skill()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        Skill skill = new Skill(skillDto.getNombre_skill(),skillDto.getPorcentaje(),skillDto.getLogo_skill(),skillDto.getUsuario_id());
        skillService.save(skill);
        return new ResponseEntity(new Mensaje("skill actualizado"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if (!skillService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        skillService.delete(id);
        return new ResponseEntity(new Mensaje("skill eliminado"), HttpStatus.OK);
    }
}