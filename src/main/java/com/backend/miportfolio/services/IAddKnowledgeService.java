package com.backend.miportfolio.services;

import com.backend.miportfolio.model.InfoAddKnowledge;
import java.util.List;


public interface IAddKnowledgeService {

    public List <InfoAddKnowledge> getAddKnowledge ();
    public void crearAddKnowledge (InfoAddKnowledge knowledge);
    public void editarAddKnowledge (InfoAddKnowledge knowledge);
    public void eliminarAddKnowledge (Long id);
}
