package Personne;

import java.util.ArrayList;

public class Citoyen {
    private String nom;
    private String prenom;
    private String sexe;
    private int annee_de_naissance;
    private String lieu_de_naissance;


    // le constructeur de la classe
    public Citoyen(String nom, String prenom, String sexe, int annee_de_naissance, String lieu_de_naissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.annee_de_naissance = annee_de_naissance;
        this.lieu_de_naissance = lieu_de_naissance;
        liste_de_tous_les_citoyens.add(this);
    }
    // la liste qui va contenir tous les citoyens

    public static ArrayList<Citoyen> liste_de_tous_les_citoyens = new ArrayList<>();

    // le constructeur de la classe vide par default
    public Citoyen() {}


    // les setters et les getters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getAnnee_de_naissance() {
        return annee_de_naissance;
    }

    public void setAnnee_de_naissance(int annee_de_naissance) {
        this.annee_de_naissance = annee_de_naissance;
    }

    public String getLieu_de_naissance() {
        return lieu_de_naissance;
    }

    public void setLieu_de_naissance(String lieu_de_naissance) {
        this.lieu_de_naissance = lieu_de_naissance;
    }



}
