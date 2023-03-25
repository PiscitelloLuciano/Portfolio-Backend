package com.backend.miportfolio.services;

import com.backend.miportfolio.model.InfoAddKnowledge;
import com.backend.miportfolio.repository.AddKnowledgeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddKnowledgeService implements IAddKnowledgeService {
    
    @Autowired
    private AddKnowledgeRepository knowledgeRepository;

    @Override
    public List<InfoAddKnowledge> getAddKnowledge() {
        return knowledgeRepository.findAll();
    }

    @Override
    public void crearAddKnowledge(InfoAddKnowledge knowledge) {
        knowledgeRepository.save(knowledge);
    }

    @Override
    public void editarAddKnowledge(InfoAddKnowledge knowledge) {
        knowledgeRepository.save(knowledge);
    }

    @Override
    public void eliminarAddKnowledge(Long id) {
        knowledgeRepository.deleteById(id);
    }
    
    
}
