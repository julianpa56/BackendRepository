
package com.porfolio.julianyp.Spring.respository;

import com.porfolio.julianyp.Spring.entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectoRepository extends  JpaRepository<Proyecto, Integer>{
    Optional<Proyecto> findByNombre(String nombreProyecto);
    boolean existsByNombre(String nombreProyecto);
}
