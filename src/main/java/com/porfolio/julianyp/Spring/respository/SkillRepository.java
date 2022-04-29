
package com.porfolio.julianyp.Spring.respository;

import com.porfolio.julianyp.Spring.entity.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
    Optional<Skill> findByNombre(String nombreSkill);
    boolean existsByNombre(String nombreSkill);
}
