package com.backend.miportfolio.controller;

import com.backend.miportfolio.model.InfoEducation;
import com.backend.miportfolio.services.EducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class ControllerEducation {
    
    /* ---------------FUNCIONES DE EDUCACION---------------------- */
    
    @Autowired
    private EducationService educationService;
    
    @GetMapping ("/education")
    @ResponseBody
    public List<InfoEducation> getEducation () {
        return educationService.getEducation();
    }
    
    @PostMapping ("/education")
    public void crearEducation (@RequestBody InfoEducation education) {
        educationService.crearEducation(education);
    }
    
    @DeleteMapping ("/education/{id}")
    public void eliminarEducation(@PathVariable Long id){
        educationService.eliminarEducation(id);
    }
    
    @PutMapping ("/education")
    public void editarEducation (@RequestBody InfoEducation education) {
        educationService.editarEducation(education);
    } 
   
}
