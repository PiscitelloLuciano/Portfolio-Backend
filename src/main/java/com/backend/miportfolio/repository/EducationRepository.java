package com.backend.miportfolio.repository;

import com.backend.miportfolio.model.InfoEducation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository <InfoEducation, Long> {
    
}
