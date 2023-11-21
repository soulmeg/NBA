package com.example.NBA.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Terrain")
public class Terrain {
    @Id
    @GeneratedValue
    long id_terrain;
    String nom_terrain;
    String localisation;

    public long getId_terrain() {
        return id_terrain;
    }

    public void setId_terrain(long id_terrain) {
        this.id_terrain = id_terrain;
    }

    public String getNom_terrain() {
        return nom_terrain;
    }

    public void setNom_terrain(String nom_terrain) {
        this.nom_terrain = nom_terrain;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Terrain() {
    }
}
