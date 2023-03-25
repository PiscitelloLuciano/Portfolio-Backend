package com.backend.miportfolio.services;

import com.backend.miportfolio.model.Details;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface IDetailsService {
    public List <Details> getDetails ();
    public void crearDetails (Details details);
    public void editarDetails (Details details);
}
