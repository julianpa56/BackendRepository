
package com.porfolio.julianyp.Spring.Controller;

import com.porfolio.julianyp.Spring.dto.Mensaje;
import com.porfolio.julianyp.Spring.dto.UsuarioDto;
import com.porfolio.julianyp.Spring.entity.Usuario;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.porfolio.julianyp.Spring.service.UsuarioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Usuario>> list(){
        List<Usuario> list = usuarioService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable("id") int id){
        if(!usuarioService.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Usuario usuario = usuarioService.getOne(id).get();
        return new ResponseEntity(usuario, HttpStatus.OK);
    }
    @GetMapping("/detailname/{nombre}")
    public ResponseEntity<Usuario> getByNombre(@PathVariable("nombre") String nombre){
        if(!usuarioService.existByNombre(nombre))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Usuario usuario = usuarioService.getByNombre(nombre).get();
        return new ResponseEntity(usuario, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create( @RequestBody UsuarioDto usuarioDto){
        if(StringUtils.isBlank(usuarioDto.getNombre()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        Usuario usuario = new Usuario(usuarioDto.getNombre(),usuarioDto.getApellido(),usuarioDto.getTitulo(),usuarioDto.getAcerca_de(),usuarioDto.getFoto_perfil());
        usuarioService.save(usuario);
        return new ResponseEntity(new Mensaje("usuario creado"), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody UsuarioDto usuarioDto){
        if(!usuarioService.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(usuarioDto.getNombre()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(usuarioService.existByNombre(usuarioDto.getNombre())&& usuarioService.getByNombre(usuarioDto.getNombre()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ya existe con otro id"), HttpStatus.BAD_REQUEST);
        Usuario usuario = usuarioService.getOne(id).get();
        usuario.setNombre(usuarioDto.getNombre());
        usuario.setApellido(usuarioDto.getApellido());
        usuario.setTitulo(usuarioDto.getTitulo());
        usuario.setAcerca_de(usuarioDto.getAcerca_de());
        usuario.setFoto_perfil(usuarioDto.getFoto_perfil());
        usuarioService.save(usuario);
        return new ResponseEntity(new Mensaje("usuario actualizado"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!usuarioService.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        usuarioService.delete(id);
        return new ResponseEntity(new Mensaje("usuario eliminado"), HttpStatus.OK);
    }
}
