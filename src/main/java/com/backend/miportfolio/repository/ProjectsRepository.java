package com.backend.miportfolio.repository;

import com.backend.miportfolio.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository <Projects, Long>{
    
}
