
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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/proyectos")
@CrossOrigin("*")
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
        if (!proyectoService.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Proyecto proyecto= proyectoService.getOne(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{nombre_proyecto}")
    public ResponseEntity<Proyecto> getByNombre(@PathVariable("nombre_proyecto")String nombreProyecto){
        if (!proyectoService.existsByNombre(nombreProyecto))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Proyecto proyecto = (Proyecto) proyectoService.getByNombre(nombreProyecto).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ProyectoDto proyectoDto){
        if(StringUtils.isBlank(proyectoDto.getNombre()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        Proyecto proyecto = new Proyecto(proyectoDto.getNombre(),proyectoDto.getFecharealizacion(),proyectoDto.getDescripcion(),proyectoDto.getLinkproyecto());
        proyectoService.save(proyecto);
        return new ResponseEntity(new Mensaje("proyecto creado"), HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody ProyectoDto proyectoDto){
        if (!proyectoService.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        if(StringUtils.isBlank(proyectoDto.getNombre()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(proyectoService.existsByNombre(proyectoDto.getNombre())&& proyectoService.getByNombre(proyectoDto.getNombre()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ya existe con otro id"), HttpStatus.BAD_REQUEST);
        Proyecto proyecto = proyectoService.getOne(id).get();
        proyecto.setNombre(proyectoDto.getNombre());
        proyecto.setFecharealizacion(proyectoDto.getFecharealizacion());
        proyecto.setDescripcion(proyectoDto.getDescripcion());
        proyecto.setLinkproyecto(proyectoDto.getLinkproyecto());
        proyectoService.save(proyecto);
        return new ResponseEntity(new Mensaje("proyecto actualizado"), HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if (!proyectoService.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        proyectoService.delete(id);
        return new ResponseEntity(new Mensaje("proyecto eliminado"), HttpStatus.OK);
    }
}
