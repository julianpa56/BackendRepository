
package com.porfolio.julianyp.Spring.service;

import com.porfolio.julianyp.Spring.entity.Proyecto;
import com.porfolio.julianyp.Spring.respository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



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
    
    public Optional<Proyecto> getByNombre(String nombreProyecto){
        return proyectoRepository.findByNombre(nombreProyecto);
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
    
    public boolean existsByNombre(String nombreProyecto){
        return proyectoRepository.existsByNombre(nombreProyecto);
    }
}
