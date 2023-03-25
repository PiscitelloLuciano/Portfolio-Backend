package com.backend.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String habilidad;
    private Long rangoHabilidad;

    public Skills() {
    }

    public Skills(Long id, String habilidad, Long rangoHabilidad) {
        this.id = id;
        this.habilidad = habilidad;
        this.rangoHabilidad = rangoHabilidad;
    }
    
    
}
