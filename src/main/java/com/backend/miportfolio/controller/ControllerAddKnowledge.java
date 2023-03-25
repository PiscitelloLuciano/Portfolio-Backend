package com.backend.miportfolio.controller;

import com.backend.miportfolio.model.InfoAddKnowledge;
import com.backend.miportfolio.services.AddKnowledgeService;
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
public class ControllerAddKnowledge {
    
    @Autowired
    private AddKnowledgeService knowledgeService;
     
    @GetMapping ("/addknowledge")
    @ResponseBody
    public List<InfoAddKnowledge> getAddKnowledge () {
        return knowledgeService.getAddKnowledge();
    }
    
    @PostMapping ("/addknowledge")
    public void crearAddKnowledge (@RequestBody InfoAddKnowledge knowledge) {
        knowledgeService.crearAddKnowledge(knowledge);
    }
    
    @PutMapping ("/addknowledge")
    public void editarAddKnowledge (@RequestBody InfoAddKnowledge knowledge) {
        knowledgeService.editarAddKnowledge(knowledge);
    }
    
    @DeleteMapping ("/addknowledge/{id}")
    public void eliminaAddKnowledge (@PathVariable Long id) {
        knowledgeService.eliminarAddKnowledge(id);
    }
}
