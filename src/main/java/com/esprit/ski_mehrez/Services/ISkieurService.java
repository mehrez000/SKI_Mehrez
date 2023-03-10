package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Abonnement;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Entities.TypeAbonnement;

import java.util.List;
import java.util.Optional;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addS(Skieur skieur);
    Skieur updateSkieur (Skieur skieur);
    Optional retrieveSkieur (Long numSkieur);
    void RemoveSkieur(Long numSkieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

}
