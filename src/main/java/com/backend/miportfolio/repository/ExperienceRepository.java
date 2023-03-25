
package com.backend.miportfolio.repository;

import com.backend.miportfolio.model.InfoExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository <InfoExperience, Long>{
    
}
