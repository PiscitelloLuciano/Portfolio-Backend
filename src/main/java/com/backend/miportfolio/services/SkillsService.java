package com.backend.miportfolio.services;

import com.backend.miportfolio.model.Skills;
import com.backend.miportfolio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{

    @Autowired
    private SkillsRepository skillsRepository;
    
    @Override
    public List<Skills> getSkills() {
        return skillsRepository.findAll();
    }

    @Override
    public void crearSkills(Skills skill) {
        skillsRepository.save(skill);
    }

    @Override
    public void editarSkills(Skills skill) {
        skillsRepository.save(skill);
    }

    @Override
    public void eliminarSkills(Long id) {
        skillsRepository.deleteById(id);
    }
    
}
