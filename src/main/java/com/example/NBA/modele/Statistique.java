package com.example.NBA.modele;

import javax.persistence.*;

@Entity
@Table(name = "Statistique")
public class Statistique {
    @Id
    @GeneratedValue
    long id_stat;
    @ManyToOne
    @JoinColumn(name = "id_joueur")
    Joueur id_joueur;
    double temps;
    @ManyToOne
    @JoinColumn(name = "id_action")
    Action id_action;
    @ManyToOne
    @JoinColumn(name = "id_match")
    Match id_match;

    public long getId_stat() {
        return id_stat;
    }

    public void setId_stat(long id_stat) {
        this.id_stat = id_stat;
    }

    public Joueur getId_joueur() {
        return id_joueur;
    }

    public void setId_joueur(Joueur id_joueur) {
        this.id_joueur = id_joueur;
    }

    public double getTemps() {
        return temps;
    }

    public void setTemps(double temps) {
        this.temps = temps;
    }

    public Action getId_action() {
        return id_action;
    }

    public void setId_action(Action id_action) {
        this.id_action = id_action;
    }

    public Match getId_match() {
        return id_match;
    }

    public void setId_match(Match id_match) {
        this.id_match = id_match;
    }

    public Statistique() {
    }
}
