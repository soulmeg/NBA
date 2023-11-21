package com.example.NBA.repository;

import com.example.NBA.modele.Joueur;
import com.example.NBA.modele.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur,Long> {

}
