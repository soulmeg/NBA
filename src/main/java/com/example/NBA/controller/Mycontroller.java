package com.example.NBA.controller;

import com.example.NBA.modele.*;
import com.example.NBA.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "/nba")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class Mycontroller {
    @Autowired
    MatchRepository match_repo;
    @Autowired
    JoueurRepository joueur_repo;
    @Autowired
    StatistiqueRepository stat_repo;
    @Autowired
    Match_jouerRepository match_jouer_repo;
    @Autowired
    SaisonRepository saison_repo;
    @Autowired
    ActionRepository action_repo;
    @Autowired
    EquipeRepository equipe_repo;

    @GetMapping("/getAllJoueur")
    public List<Joueur> getAllJoueur(){
        List<Joueur> joueurList = joueur_repo.findAll();
        return joueurList;
    }

    @GetMapping("/findByJoueurId/{id}")
    public Joueur findByJoueurId(@PathVariable long id){
        Joueur voiture = joueur_repo.findById(id).get();
        return voiture;
    }


    @PostMapping("/addJoueur")
    public void addJoueur(@RequestBody Joueur j){
        joueur_repo.save(j);
    }


    @GetMapping("/getAllEquipe")
    public List<Equipe> getAllEquipe() {
        List<Equipe> joueurList = equipe_repo.findAll();
        return joueurList;
    }
    @PostMapping("/addEquipe")
    public void addJoueur(@RequestBody Equipe j){
        equipe_repo.save(j);
    }



    @GetMapping("/getAllMatch")
    public List<Match> getAllMatch() {
        List<Match> joueurList = match_repo.findAll();
        return joueurList;
    }
    @PostMapping("/addMatch")
    public void addMatch(@RequestBody Match j){
        match_repo.save(j);
    }


    @GetMapping("/getAllSaison")
    public List<Saison> getAllSaison() {
        List<Saison> joueurList = saison_repo.findAll();
        return joueurList;
    }
    @PostMapping("/addSaison")
    public void addMatch(@RequestBody Saison j){
        saison_repo.save(j);
    }


    @GetMapping("/getAllAction")
    public List<Action> getAllAction() {
        List<Action> joueurList = action_repo.findAll();
        return joueurList;
    }
    @PostMapping("/addAction")
    public void addAction(@RequestBody Action j){
        action_repo.save(j);
    }



    @GetMapping("/getAllStatistique")
    public List<Statistique> getAllStatistique() {
        List<Statistique> joueurList = stat_repo.findAll();
        return joueurList;
    }
    @PostMapping("/addStatistique")
    public void addStatistique(@RequestBody Statistique j){
        stat_repo.save(j);
    }



    @GetMapping("/getAllMatch_jouer")
    public List<Match_jouer> getAllMatch_jouer() {
        List<Match_jouer> joueurList = match_jouer_repo.findAll();
        return joueurList;
    }

    @PostMapping("/addMatch_jouer")
    public void addMatch_jouer(@RequestBody Match_jouer j){
        match_jouer_repo.save(j);
    }

    public double calculate(Long id_joueur){
        return 0;
    }

    @GetMapping("/getFinalStat")
    public List<StatistiqueFinale> allStat(){
        List<Joueur> joueurs = joueur_repo.findAll();
        List<StatistiqueFinale> stats = new ArrayList<>();
        for (int i = 0 ;i<joueurs.size();i++){
            StatistiqueFinale ss = new StatistiqueFinale();
            ss.setJoueur(joueurs.get(i));
            ss.setM(calculate(joueurs.get(i).getId_joueur()));
            ss.setMJ(calculate(joueurs.get(i).getId_joueur()));
            ss.setPPM(calculate(joueurs.get(i).getId_joueur()));
            ss.setRPM(calculate(joueurs.get(i).getId_joueur()));
            ss.setPDPM(calculate(joueurs.get(i).getId_joueur()));
            ss.setMPM(calculate(joueurs.get(i).getId_joueur()));
            ss.setEFF(calculate(joueurs.get(i).getId_joueur()));
            ss.setFG(calculate(joueurs.get(i).getId_joueur()));
            ss.setTHREEPOINTS(calculate(joueurs.get(i).getId_joueur()));
            ss.setLF(calculate(joueurs.get(i).getId_joueur()));
            ss.setDesactive(calculate(joueurs.get(i).getId_joueur()));
            stats.add(ss);
        }
        return stats;
    }


//    // Nombre total de matchs joués
//    @GetMapping("/nombreTotalMatchsJoues/{joueurId}")
//    public Long calculateNombreTotalMatchsJoues(@PathVariable Long joueurId) {
//        Optional<Joueur> joueurOptional = joueur_repo.findById(joueurId);
//
//        if (joueurOptional.isPresent()) {
//            Joueur joueur = joueurOptional.get();
//            List<Statistique> statistiques = stat_repo.findByJoueurId(joueur.getId_joueur());
//            return statistiques.stream().map(stat -> stat.getId_match().getId_match()).distinct().count();
//        } else {
//            // Gérer le cas où le joueur n'est pas trouvé
////            throw new ChangeSetPersister.NotFoundException("Joueur non trouvé");
//        }
//        return null;
//    }




}
