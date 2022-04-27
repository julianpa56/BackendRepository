/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.julianyp.Spring.respository;

import com.porfolio.julianyp.Spring.entity.Skill;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author julia
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
    Optional<Skill> findByNombre(String nombre_skill);
    boolean existsByNombre(String nombre_skill);
}
