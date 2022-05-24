/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.julianyp.Spring.security.service;

import com.porfolio.julianyp.Spring.security.entity.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.porfolio.julianyp.Spring.security.repository.UserRepository;

/**
 *
 * @author julian
 */
@Service
@Transactional
public class UserService {
    
    @Autowired
    UserRepository usuarioRepository;
    
    public Optional<User> getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }
    
    public void save(User usuario){
        usuarioRepository.save(usuario);
    }
    
}
