package com.example.NBA.repository;

import com.example.NBA.modele.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatistiqueRepository extends JpaRepository<Statistique,Long> {
//    List<Statistique> findByJoueurId(@Param("joueurId") Long joueurId);
}
