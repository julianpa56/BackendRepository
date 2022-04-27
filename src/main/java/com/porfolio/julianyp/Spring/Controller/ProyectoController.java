/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.julianyp.Spring.Controller;

import com.porfolio.julianyp.Spring.dto.Mensaje;
import com.porfolio.julianyp.Spring.dto.ProyectoDto;
import com.porfolio.julianyp.Spring.entity.Proyecto;
import com.porfolio.julianyp.Spring.service.ProyectoService;
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
@RequestMapping("/proyectos")
public class ProyectoController {
    
    @Autowired
    ProyectoService proyectoService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> list(){
        List<Proyecto> list = proyectoService.list();
        return new ResponseEntity<List<Proyecto>>(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id")int id){
        if (!proyectoService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Proyecto proyecto= proyectoService.getOne(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{nombre_proyecto}")
    public ResponseEntity<Proyecto> getByNombre(@PathVariable("nombre_proyecto")String nombre_proyecto){
        if (!proyectoService.existsByNombre(nombre_proyecto))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Proyecto proyecto = (Proyecto) proyectoService.getByNombre(nombre_proyecto);
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ProyectoDto proyectoDto){
        if(StringUtils.isBlank(proyectoDto.getNombre_proyecto()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        Proyecto proyecto = new Proyecto(proyectoDto.getNombre_proyecto(),proyectoDto.getFecha_realizacion(),proyectoDto.getDescripcion(),proyectoDto.getLink_proyecto(),proyectoDto.getUsuario_id());
        proyectoService.save(proyecto);
        return new ResponseEntity(new Mensaje("proyecto creado"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody ProyectoDto proyectoDto){
        if (!proyectoService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        if(StringUtils.isBlank(proyectoDto.getNombre_proyecto()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        Proyecto proyecto = new Proyecto(proyectoDto.getNombre_proyecto(),proyectoDto.getFecha_realizacion(),proyectoDto.getDescripcion(),proyectoDto.getLink_proyecto(),proyectoDto.getUsuario_id());
        proyectoService.save(proyecto);
        return new ResponseEntity(new Mensaje("proyecto actualizado"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if (!proyectoService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        proyectoService.delete(id);
        return new ResponseEntity(new Mensaje("proyecto eliminado"), HttpStatus.OK);
    }
}
