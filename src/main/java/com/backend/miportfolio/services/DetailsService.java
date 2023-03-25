package com.backend.miportfolio.services;

import com.backend.miportfolio.model.Details;
import com.backend.miportfolio.repository.DetailsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DetailsService implements IDetailsService {

    @Autowired
    private DetailsRepository detailsRepository;
    
    @Override
    public List<Details> getDetails() {
        return detailsRepository.findAll();
    }

    @Override
    public void crearDetails(Details details) {
        detailsRepository.save(details);
    }

    @Override
    public void editarDetails(Details details) {
        detailsRepository.save(details);
    }
}
