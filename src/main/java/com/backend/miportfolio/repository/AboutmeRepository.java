package com.backend.miportfolio.repository;

import com.backend.miportfolio.model.InfoAboutme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutmeRepository extends JpaRepository <InfoAboutme, Long> {

    
}