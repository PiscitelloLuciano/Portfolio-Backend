package com.backend.miportfolio.services;

import com.backend.miportfolio.model.InfoAboutme;
import com.backend.miportfolio.repository.AboutmeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutmeService implements IAboutmeService {

    @Autowired
    private AboutmeRepository aboutmeRepository;
    
    @Override
    public List<InfoAboutme> getAboutme() {
        return aboutmeRepository.findAll();
    }

    @Override
    public void crearAboutme(InfoAboutme aboutme) {
        aboutmeRepository.save(aboutme);
    }

    @Override
    public void editarAboutme(InfoAboutme aboutme) {
        aboutmeRepository.save(aboutme);
    }

    @Override
    public InfoAboutme getAboutId(Long id) {
        return aboutmeRepository.findById(id).orElse(null);
    }
    
}