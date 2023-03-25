package com.backend.miportfolio.services;

import com.backend.miportfolio.model.Projects;
import java.util.List;


public interface IProjectsService {
    
    public List <Projects> getProjects ();
    public Projects crearProject(Projects project);
    public void editarProjects (Projects project);
    public void eliminarProjects (Long id);
}