package com.GestionLivre.Livre.Reposoitory;

import com.GestionLivre.Livre.Model.ModelLivre;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LivreRepository extends JpaRepository<ModelLivre, Long> {
}
