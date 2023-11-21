package com.example.NBA.modele;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Match")
public class Match {
    @Id
    @GeneratedValue
    long id_match;
    String nom_match;
    @ManyToOne
    @JoinColumn(name = "id_saison")
    Saison id_saison;
    Timestamp dateHeureDebut;
    Timestamp dateHeureFin;
    @ManyToOne
    @JoinColumn(name = "id_terrain")
    Terrain id_terrain;

    public long getId_match() {
        return id_match;
    }

    public void setId_match(long id_match) {
        this.id_match = id_match;
    }

    public String getNom_match() {
        return nom_match;
    }

    public void setNom_match(String nom_match) {
        this.nom_match = nom_match;
    }

    public Saison getId_saison() {
        return id_saison;
    }

    public void setId_saison(Saison id_saison) {
        this.id_saison = id_saison;
    }

    public Timestamp getDateHeureDebut() {
        return dateHeureDebut;
    }

    public void setDateHeureDebut(Timestamp dateHeureDebut) {
        this.dateHeureDebut = dateHeureDebut;
    }

    public Timestamp getDateHeureFin() {
        return dateHeureFin;
    }

    public void setDateHeureFin(Timestamp dateHeureFin) {
        this.dateHeureFin = dateHeureFin;
    }

    public Terrain getId_terrain() {
        return id_terrain;
    }

    public void setId_terrain(Terrain id_terrain) {
        this.id_terrain = id_terrain;
    }

    public Match() {
    }
}
