package com.isms.planifCours.entity;

import com.isms.planifCours.enums.Session;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    private String Libelle;
    private String duree;
    private String dateCreation;
    private String niveau;
    private String dateExpiration;
    private Session sessionType;
    //private List<Etudiant> etudiants;
    private List<Salle> salles;
    public Professeur professeur;

}
