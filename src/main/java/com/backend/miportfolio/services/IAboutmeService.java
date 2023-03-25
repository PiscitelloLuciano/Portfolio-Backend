package com.backend.miportfolio.services;

import com.backend.miportfolio.model.InfoAboutme;
import java.util.List;


public interface IAboutmeService {
    
    public List <InfoAboutme> getAboutme ();
    public void crearAboutme (InfoAboutme aboutme);
    public void editarAboutme (InfoAboutme aboutme);
    public InfoAboutme getAboutId (Long id);
}
