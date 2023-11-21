package com.example.NBA.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Action")
public class Action {
    @Id
    @GeneratedValue
    long id_action;
    String nom_action;
    int valeur;

    public long getId_action() {
        return id_action;
    }

    public void setId_action(long id_action) {
        this.id_action = id_action;
    }

    public String getNom_action() {
        return nom_action;
    }

    public void setNom_action(String nom_action) {
        this.nom_action = nom_action;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Action() {
    }
}
