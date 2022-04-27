/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.julianyp.Spring.service;

import com.porfolio.julianyp.Spring.entity.Skill;
import com.porfolio.julianyp.Spring.respository.SkillRepository;
import java.util.List;
import java.util.Optional;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author julia
 */

@Service 
@Transactional
public class SkillService {
    
    @Autowired
    SkillRepository skillRepository;
    
    public List<Skill> list(){
        return skillRepository.findAll();
    }
    
    public Optional<Skill> getOne(int id){
        return skillRepository.findById(id);
    }
    
    public DynamicType.Builder.FieldDefinition.Optional<Skill> getByNombre(String nombre_skill){
        return skillRepository.findByNombre(nombre_skill);
    }
    
    public void save(Skill skill){
        skillRepository.save(skill);
    }
    
    public void delete(int id){
        skillRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return skillRepository.existsById(id);
    }
    
    public boolean existsByNombre(String nombre_skill){
        return skillRepository.existsByNombre(nombre_skill);
    }
}
