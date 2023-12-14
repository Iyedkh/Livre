package com.GestionLivre.Livre.controller;

import com.GestionLivre.Livre.Model.ModelLivre;
import com.GestionLivre.Livre.Service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LivreController {


    private final LivreService livreService;

    @Autowired
    public LivreController(LivreService livreService) {

        this.livreService = livreService;
    }
    @RequestMapping("/test")
    public String test()
    {

        return("Je fonctionne correctement" );
    }

    @PostMapping
    public ModelLivre addItem(@RequestBody ModelLivre livre) {

        return livreService.ajouterLivre(livre);
    }

    @GetMapping
    public List<ModelLivre> afficherLivres()
    {
        return livreService.afficherLivres();
    }
    @GetMapping("/{id}")
    public ModelLivre getItemById(@PathVariable Long id) {
        Optional<ModelLivre> item = livreService.getLivreById(id);
        return item.orElse(null); // You can handle the null case as needed
    }
    @PutMapping("/{id}")
    public ModelLivre updateItem(@PathVariable int id, @RequestBody ModelLivre livre) {
        livre.setId(id);
        return livreService.ajouterLivre(livre);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {

        livreService.supprimerLivre(id);
    }

    }


