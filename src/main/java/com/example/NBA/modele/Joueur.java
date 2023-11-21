package com.example.NBA.modele;

import javax.persistence.*;

@Entity
@Table(name = "Joueur")
public class Joueur {
    @Id
    @GeneratedValue
    long id_joueur;
    String nom_joueur;

    @ManyToOne
    @JoinColumn(name = "id_equipe")
    Equipe id_equipe;
    public long getId_joueur() {
        return id_joueur;
    }

    public void setId_joueur(long id_joueur) {
        this.id_joueur = id_joueur;
    }

    public String getNom_joueur() {
        return nom_joueur;
    }

    public void setNom_joueur(String nom_joueur) {
        this.nom_joueur = nom_joueur;
    }

    public Equipe getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(Equipe id_equipe) {
        this.id_equipe = id_equipe;
    }
}
