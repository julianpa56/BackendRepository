/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.julianyp.Spring.service;

import com.porfolio.julianyp.Spring.entity.Proyecto;
import com.porfolio.julianyp.Spring.respository.ProyectoRepository;
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
public class ProyectoService {
    
    @Autowired
    ProyectoRepository proyectoRepository;
    
    public List<Proyecto> list(){
        return proyectoRepository.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return proyectoRepository.findById(id);
    }
    
    public DynamicType.Builder.FieldDefinition.Optional<Proyecto> getByNombre(String nombre_proyecto){
        return proyectoRepository.findByNombre(nombre_proyecto);
    }
    
    public void save(Proyecto proyecto){
        proyectoRepository.save(proyecto);
    }
    
    public void delete(int id){
        proyectoRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return proyectoRepository.existsById(id);
    }
    
    public boolean existsByNombre(String nombre_proyecto){
        return proyectoRepository.existsByNombre(nombre_proyecto);
    }
}
