package com.example.NBA.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Saison")
public class Saison {
    @Id
    @GeneratedValue
    long id_saison;
    String nom_saison;

    public long getId_saison() {
        return id_saison;
    }

    public void setId_saison(long id_saison) {
        this.id_saison = id_saison;
    }

    public String getNom_saison() {
        return nom_saison;
    }

    public void setNom_saison(String nom_saison) {
        this.nom_saison = nom_saison;
    }

    public Saison() {
    }
}
