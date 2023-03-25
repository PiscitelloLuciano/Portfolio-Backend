package com.backend.miportfolio.services;

import com.backend.miportfolio.model.InfoExperience;
import com.backend.miportfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService {
    
    @Autowired
    private ExperienceRepository experienceRepository;
    
    @Override
    public List<InfoExperience> getExperience() {
        return experienceRepository.findAll();
    }

    @Override
    public void crearExperience(InfoExperience education) {
        experienceRepository.save(education);
    }

    @Override
    public void eliminarExperience(Long id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public void editarExperience(InfoExperience education) {
        experienceRepository.save(education);
    }
    
}
