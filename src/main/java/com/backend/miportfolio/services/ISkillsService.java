package com.backend.miportfolio.services;

import com.backend.miportfolio.model.Skills;
import java.util.List;

public interface ISkillsService {
    
    public List <Skills> getSkills ();
    public void crearSkills (Skills skill);
    public void editarSkills (Skills skill);
    public void eliminarSkills (Long id);
}
