package com.GestionLivre.Livre.Service;

import com.GestionLivre.Livre.Model.ModelLivre;
import com.GestionLivre.Livre.controller.LivreController;
import com.GestionLivre.Livre.Reposoitory.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class LivreService {

    private final LivreRepository livreRepository;

    @Autowired
    public LivreService(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    public ModelLivre ajouterLivre(ModelLivre livre) {
        return livreRepository.save(livre);
    }

    public List<ModelLivre> afficherLivres() {
        return livreRepository.findAll();
    }

    public Optional<ModelLivre> getLivreById(Long id) {
        return livreRepository.findById(id);
    }
    public void supprimerLivre(Long id) {
        livreRepository.deleteById(id);
    }



    }

