package com.backend.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class InfoAboutme {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String contenido;

    public InfoAboutme() {
    }

    public InfoAboutme(Long id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }
    
    
}