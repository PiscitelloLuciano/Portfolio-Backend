package com.backend.miportfolio.controller;

import com.backend.miportfolio.model.InfoAboutme;
import com.backend.miportfolio.services.AboutmeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class ControllerAboutme {
    
    @Autowired 
    private AboutmeService aboutmeService;
    
    @GetMapping ("/aboutme")
    @ResponseBody
    public List <InfoAboutme> getAboutme () {
        return aboutmeService.getAboutme();
    }
    
    @PostMapping ("/aboutme")
    public void crearAboutme (@RequestBody InfoAboutme aboutme) {
        aboutmeService.crearAboutme(aboutme);
    }
    
    @PutMapping ("/aboutme")
    public void editarAboutme (@RequestBody InfoAboutme aboutme) {
        aboutmeService.editarAboutme(aboutme);
    }
    
    @GetMapping ("/aboutme/{id}")
    public InfoAboutme getAboutId (@PathVariable Long id) {
        return aboutmeService.getAboutId(id);
    }
    
    
}