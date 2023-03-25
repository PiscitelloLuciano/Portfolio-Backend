package com.backend.miportfolio.services;

import com.backend.miportfolio.model.InfoExperience;
import java.util.List;


public interface IExperienceService {
    public List<InfoExperience> getExperience ();
    public void crearExperience (InfoExperience education);
    public void eliminarExperience (Long id);
    public void editarExperience (InfoExperience education);
}
