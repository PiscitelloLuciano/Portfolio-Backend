package com.backend.miportfolio.services;

import com.backend.miportfolio.model.InfoEducation;
import java.util.List;


public interface IEducationService {
    public List<InfoEducation> getEducation ();
    public void crearEducation (InfoEducation education);
    public void eliminarEducation (Long id);
    public void editarEducation (InfoEducation education);
}
