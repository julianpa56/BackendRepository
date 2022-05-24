
package com.porfolio.julianyp.Spring.service;

import com.porfolio.julianyp.Spring.entity.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.porfolio.julianyp.Spring.respository.UsuarioRepository;


@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public List<Usuario> list(){
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> getOne(int id){
        return usuarioRepository.findById(id);
    }
    
    public Optional<Usuario> getByNombre(String nombre){
        return usuarioRepository.findByNombre(nombre);
    }
 
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    
    public void delete(int id){
        usuarioRepository.deleteById(id);
    }
    
    public boolean existById(int id){
        return usuarioRepository.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return usuarioRepository.existsByNombre(nombre);
    }
}
