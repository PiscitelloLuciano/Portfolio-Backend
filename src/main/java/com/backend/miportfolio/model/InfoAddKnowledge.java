package com.backend.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter @Getter
@Entity
public class InfoAddKnowledge {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String conocimiento;
    private Long rangoConocimiento;

    public InfoAddKnowledge() {
    }

    public InfoAddKnowledge(Long id, String conocimiento, Long rangoConocimiento) {
        this.id = id;
        this.conocimiento = conocimiento;
        this.rangoConocimiento = rangoConocimiento;
    }
    
    
}
