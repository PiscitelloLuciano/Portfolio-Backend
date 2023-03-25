package com.backend.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Details {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String nacimiento;
    private String ubicacion;
    private String direccion;
    private String email;
    private Long celular;
    private String imagen;


    public Details() {
    }

    public Details(Long id, String nombre, String apellido, String titulo, String nacimiento, String ubicacion, String direccion, String email, Long celular, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.nacimiento = nacimiento;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.email = email;
        this.celular = celular;
        this.imagen = imagen;
    }
    
    
}
