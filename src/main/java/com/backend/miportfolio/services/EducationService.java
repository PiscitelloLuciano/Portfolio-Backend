package com.backend.miportfolio.services;

import com.backend.miportfolio.model.InfoEducation;
import com.backend.miportfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService {
    
    @Autowired 
    private EducationRepository educationRepository;
    
    @Override
    public List<InfoEducation> getEducation() {
        return educationRepository.findAll();
    }

    @Override
    public void crearEducation(InfoEducation education) {
        educationRepository.save(education);
    }

    @Override
    public void eliminarEducation(Long id) {
        educationRepository.deleteById(id);
    }

    @Override
    public void editarEducation(InfoEducation education) {
        educationRepository.save(education);
    }
    
}
