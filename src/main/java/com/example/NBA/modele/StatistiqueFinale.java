package com.example.NBA.modele;

import com.example.NBA.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StatistiqueFinale {
    Joueur joueur;
    double M;
    double MJ;
    double PPM;
    double RPM;
    double PDPM;
    double MPM;
    double EFF;
    double FG;
    double THREEPOINTS;
    double LF;
    double desactive;

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }


    public double getM() {
        return M;
    }

    public void setM(double m) {
        M = m;
    }

    public double getMJ() {
        return MJ;
    }

    public void setMJ(double MJ) {
        this.MJ = MJ;
    }

    public double getPPM() {
        return PPM;
    }

    public void setPPM(double PPM) {
        this.PPM = PPM;
    }

    public double getRPM() {
        return RPM;
    }

    public void setRPM(double RPM) {
        this.RPM = RPM;
    }

    public double getPDPM() {
        return PDPM;
    }

    public void setPDPM(double PDPM) {
        this.PDPM = PDPM;
    }

    public double getMPM() {
        return MPM;
    }

    public void setMPM(double MPM) {
        this.MPM = MPM;
    }

    public double getEFF() {
        return EFF;
    }

    public void setEFF(double EFF) {
        this.EFF = EFF;
    }

    public double getFG() {
        return FG;
    }

    public void setFG(double FG) {
        this.FG = FG;
    }

    public double getTHREEPOINTS() {
        return THREEPOINTS;
    }

    public void setTHREEPOINTS(double THREEPOINTS) {
        this.THREEPOINTS = THREEPOINTS;
    }

    public double getLF() {
        return LF;
    }

    public void setLF(double LF) {
        this.LF = LF;
    }

    public double getDesactive() {
        return desactive;
    }

    public void setDesactive(double desactive) {
        this.desactive = desactive;
    }


    public StatistiqueFinale() {
    }

}
