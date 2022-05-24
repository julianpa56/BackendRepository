
package com.porfolio.julianyp.Spring.respository;

import java.util.Optional;
import com.porfolio.julianyp.Spring.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{
    Optional<Educacion> findByNombre(String nombreInstitucion);
    boolean existsByNombre(String nombreInstitucion);
}
