package com.backend.miportfolio.controller;

import com.backend.miportfolio.model.Skills;
import com.backend.miportfolio.services.SkillsService;
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
public class ControllerSkills {
    
    @Autowired
    private SkillsService skillsService;
    
    @GetMapping ("/skills")
    @ResponseBody
    public List <Skills> getSkills () {
        return skillsService.getSkills();
    }
    
    @PostMapping ("/skills")
    public void crearSkills (@RequestBody Skills skill) {
        skillsService.crearSkills(skill);
    }
    
    @PutMapping ("/skills")
    public void editarSkills (@RequestBody Skills skill) {
        skillsService.editarSkills(skill);
    }
    
    @DeleteMapping ("/skills/{id}")
    public void eliminarSkills (@PathVariable Long id) {
        skillsService.eliminarSkills(id);
    }
    
    
    
}
