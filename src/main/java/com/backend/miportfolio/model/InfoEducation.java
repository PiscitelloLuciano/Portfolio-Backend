package com.backend.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class InfoEducation {
        
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        
        private String institucion;
        private String titulo;
        private Long anoFin;
        
        
        
        public InfoEducation() {
    }

    public InfoEducation(Long id, String institucion, String titulo, Long anoFin) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.anoFin = anoFin;
    }
    
}
