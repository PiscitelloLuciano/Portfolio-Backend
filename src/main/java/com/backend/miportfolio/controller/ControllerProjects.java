package com.backend.miportfolio.controller;

import com.backend.miportfolio.model.Projects;
import com.backend.miportfolio.services.ProjectsService;
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
public class ControllerProjects {
    
    
    @Autowired
    private ProjectsService projectsService;
    
    @GetMapping ("/projects")
    @ResponseBody
    public List<Projects> getProjects () {
        return projectsService.getProjects();
    }
    
    @PostMapping ("/projects")
    public void crearProjects (@RequestBody Projects project){
        projectsService.crearProject(project);
    }
    
    @PutMapping ("/projects")
    public void editarProjects (@RequestBody Projects project) {
        projectsService.editarProjects(project);
    }
    
    @DeleteMapping ("/projects/{id}")
    public void eliminarProjects (@PathVariable Long id) {
        projectsService.eliminarProjects(id);
    }
    
}
