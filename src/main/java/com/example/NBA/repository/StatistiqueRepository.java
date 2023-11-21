package com.example.NBA.repository;

import com.example.NBA.modele.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatistiqueRepository extends JpaRepository<Statistique,Long> {
    @Query("SELECT s FROM Statistique s WHERE s.id_joueur.id_joueur = :joueurId")
    List<Statistique> findByJoueurId(@Param("joueurId") Long joueurId);

}
