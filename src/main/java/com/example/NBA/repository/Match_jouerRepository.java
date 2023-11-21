package com.example.NBA.repository;

import com.example.NBA.modele.Match_jouer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Match_jouerRepository extends JpaRepository<Match_jouer,Long> {
}
