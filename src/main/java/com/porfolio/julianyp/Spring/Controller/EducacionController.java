
package com.porfolio.julianyp.Spring.Controller;

import com.porfolio.julianyp.Spring.dto.EducacionDto;
import com.porfolio.julianyp.Spring.dto.Mensaje;
import com.porfolio.julianyp.Spring.entity.Educacion;
import com.porfolio.julianyp.Spring.service.EducacionService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/educacion")
@CrossOrigin("*")
public class EducacionController {
    @Autowired
    EducacionService educacionService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = educacionService.list();
        return new ResponseEntity<List<Educacion>>(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id")int id){
        if (!educacionService.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion= educacionService.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{nombre_institucion}")
    public ResponseEntity<Educacion> getByNombre(@PathVariable("nombre_institucion")String nombreInstitucion){
        if (!educacionService.existByNombre(nombreInstitucion))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = (Educacion) educacionService.getByNombre(nombreInstitucion).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody EducacionDto educacionDto){
        if(StringUtils.isBlank(educacionDto.getNombreInstitucion()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        Educacion educacion = new Educacion(educacionDto.getNombreInstitucion(),educacionDto.getTitulo(),educacionDto.getLogoInstitucion(),educacionDto.getFechaIngreso(),educacionDto.getFechaEgreso());
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("educacion creada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody EducacionDto educacionDto){
        if (!educacionService.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        if(StringUtils.isBlank(educacionDto.getNombreInstitucion()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(educacionService.existByNombre(educacionDto.getNombreInstitucion())&& educacionService.getByNombre(educacionDto.getNombreInstitucion()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ya existe con otro id"), HttpStatus.BAD_REQUEST);
        Educacion educacion = educacionService.getOne(id).get();
        educacion.setNombreInstitucion(educacionDto.getNombreInstitucion());
        educacion.setTitulo(educacionDto.getTitulo());
        educacion.setLogoInstitucion(educacionDto.getLogoInstitucion());
        educacion.setFechaIngreso(educacionDto.getFechaIngreso());
        educacion.setFechaEgreso(educacionDto.getFechaEgreso());
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("educacion actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if (!educacionService.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        educacionService.delete(id);
        return new ResponseEntity(new Mensaje("educacion eliminada"), HttpStatus.OK);
    }
    
} 
