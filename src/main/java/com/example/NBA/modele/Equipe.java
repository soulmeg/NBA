package com.example.NBA.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Equipe")
public class Equipe {
    @Id
    @GeneratedValue
    long id_equipe;
    String nom_equipe;

    public long getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(long id_equipe) {
        this.id_equipe = id_equipe;
    }

    public String getNom_equipe() {
        return nom_equipe;
    }

    public void setNom_equipe(String nom_equipe) {
        this.nom_equipe = nom_equipe;
    }

    public Equipe() {
    }
}
