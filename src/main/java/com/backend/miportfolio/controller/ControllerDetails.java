package com.backend.miportfolio.controller;

import com.backend.miportfolio.model.Details;
import com.backend.miportfolio.services.DetailsService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class ControllerDetails {
    
    @Autowired
    private DetailsService detailsService;
    
    @GetMapping ("/details")
    @ResponseBody
    public List <Details> getDetails () {
        return detailsService.getDetails();
    }
    
    @PostMapping ("/details")
    public void crearDetails (@RequestBody Details details, @RequestParam ("file") MultipartFile imagen ) {
        
        if (!imagen.isEmpty()) {
            try {
                Path directorioImagenes = Paths.get("src//main//resources//static/images");
                String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
                
                byte[] bytesImg=imagen.getBytes();
                Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + imagen.getOriginalFilename());
                Files.write(rutaCompleta, bytesImg);
                
                details.setImagen(imagen.getOriginalFilename());
            } catch (IOException ex) {
                Logger.getLogger(ControllerDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        detailsService.crearDetails(details);
    }
    
    @PutMapping ("/details")
    public void editarDetails (@RequestBody Details details) {
        detailsService.editarDetails(details);
    }
}
