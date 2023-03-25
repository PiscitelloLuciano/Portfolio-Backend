package com.backend.miportfolio.services;

import com.backend.miportfolio.model.Projects;
import com.backend.miportfolio.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsService implements IProjectsService {

    
    
    @Autowired
    private ProjectsRepository projectsRepository;
    
    @Override
    public List<Projects> getProjects() {
        return projectsRepository.findAll();
    }
    
    @Override
    public void editarProjects(Projects project) {
        projectsRepository.save(project);
    }

    @Override
    public void eliminarProjects(Long id) {
        projectsRepository.deleteById(id);
    }

    @Override
    public Projects crearProject(Projects project) {
        return projectsRepository.save(project);
    }
}
