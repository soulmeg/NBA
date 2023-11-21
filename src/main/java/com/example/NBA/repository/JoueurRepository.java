package com.example.NBA.repository;

import com.example.NBA.modele.Joueur;
import com.example.NBA.modele.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur,Long> {
    @Query("SELECT j FROM Joueur j WHERE j.id_equipe = :id_equipe")
    List<Joueur> findByIdEquipe(@Param("id_equipe") Long id_equipe);
}
