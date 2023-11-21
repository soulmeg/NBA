package com.example.NBA.repository;

import com.example.NBA.modele.Saison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaisonRepository extends JpaRepository<Saison,Long> {
}
