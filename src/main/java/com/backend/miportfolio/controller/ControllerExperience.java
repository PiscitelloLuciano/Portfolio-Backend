
package com.backend.miportfolio.controller;

import com.backend.miportfolio.model.InfoExperience;
import com.backend.miportfolio.services.ExperienceService;
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
public class ControllerExperience {
    
    @Autowired
    private ExperienceService experienceService;
    
    @GetMapping ("/experience")
    @ResponseBody
    public List<InfoExperience> getExperience () {
        return experienceService.getExperience();
    }
    
    @PostMapping ("/experience")
    public void crearExperience (@RequestBody InfoExperience experience) {
        experienceService.crearExperience(experience);
    }
    
    @PutMapping ("/experience")
    public void editarExperience (@RequestBody InfoExperience experience) {
        experienceService.editarExperience(experience);
    }
    
    @DeleteMapping("/experience/{id}")
    public void eliminarExperience (@PathVariable Long id) {
        experienceService.eliminarExperience(id);
    }
}
