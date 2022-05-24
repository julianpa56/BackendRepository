/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.julianyp.Spring.security.service;

import com.porfolio.julianyp.Spring.security.entity.User;
import com.porfolio.julianyp.Spring.security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author julian
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
    @Autowired
    UserService usuarioService;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User usuario = usuarioService.getByNombreUsuario(username).get();
        return UsuarioPrincipal.build(usuario);
    }
    
}
