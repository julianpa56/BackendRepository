
package com.porfolio.julianyp.Spring.respository;

import com.porfolio.julianyp.Spring.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
