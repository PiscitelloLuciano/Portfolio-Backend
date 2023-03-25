package com.backend.miportfolio.repository;

import com.backend.miportfolio.model.InfoAddKnowledge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddKnowledgeRepository extends JpaRepository <InfoAddKnowledge, Long> {
    
}
