package com.backend.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Projects {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;
            
   private String nombre;
   private String detalles;
   private String link;
   private String imagen;

    public Projects() {
    }

    public Projects(Long id, String nombre, String detalles, String link, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.detalles = detalles;
        this.link = link;
        this.imagen = imagen;
    }
    
}