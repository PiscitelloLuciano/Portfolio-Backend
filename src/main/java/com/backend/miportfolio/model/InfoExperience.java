
package com.backend.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter @Getter
@Entity
public class InfoExperience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empleo;
    private String detalles;
    private Long anoInicial;
    private Long anoFinal;

    public InfoExperience() {
    }

    public InfoExperience(String empleo, String detalles, Long anoInicial, Long anoFinal) {
        this.empleo = empleo;
        this.detalles = detalles;
        this.anoInicial = anoInicial;
        this.anoFinal = anoFinal;
    }
    
    
}
