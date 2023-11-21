package com.example.NBA.modele;

import javax.persistence.*;

@Entity
@Table(name = "Match_jouer")
public class Match_jouer {
    @Id
    @GeneratedValue
    long id;
    @ManyToOne
    @JoinColumn(name = "id_match")
    Match id_match;
    @ManyToOne
    @JoinColumn(name = "id_equipe1")
    Equipe id_equipe1;
    @ManyToOne
    @JoinColumn(name = "id_equipe2")
    Equipe id_equipe2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Match getId_match() {
        return id_match;
    }

    public void setId_match(Match id_match) {
        this.id_match = id_match;
    }

    public Equipe getId_equipe1() {
        return id_equipe1;
    }

    public void setId_equipe1(Equipe id_equipe1) {
        this.id_equipe1 = id_equipe1;
    }

    public Equipe getId_equipe2() {
        return id_equipe2;
    }

    public void setId_equipe2(Equipe id_equipe2) {
        this.id_equipe2 = id_equipe2;
    }

    public Match_jouer() {
    }
}
