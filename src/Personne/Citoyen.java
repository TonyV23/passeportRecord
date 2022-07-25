package Personne;

import InputOutput.Io;

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

    // les methodes de la classe

    public static void EnregistrerCitoyen(){
        new Citoyen(InputOutput.Io.setString("\nNom : "),InputOutput.Io.setString("\nPrenom : "),
                Io.setString("Sexe :"),Io.setINT("Année de naissance :"),Io.setString("Lieu de naissance :"));
        System.out.print("\n******* Le Citoyen a été enregistré avec success *******\n");
    }

    public static void AfficherCitoyen(){
        if (!liste_de_tous_les_citoyens.isEmpty()){
            System.err.print("\n******* LISTE DE TOUS LES CITOYENS *******\n");
            for (int i = 0; i < liste_de_tous_les_citoyens.size(); i++) {
                System.out.print(
                        i+1+"  Nom :"+liste_de_tous_les_citoyens.get(i).getNom()+"\t"+
                                "Prenom :"+liste_de_tous_les_citoyens.get(i).getPrenom()+"\t"+
                                "Sexe :"+liste_de_tous_les_citoyens.get(i).getSexe()+"\t"+
                                "Année Naissance :"+liste_de_tous_les_citoyens.get(i).getAnnee_de_naissance()+"\t"+
                                "Lieu de naissance :"+liste_de_tous_les_citoyens.get(i).getLieu_de_naissance()+"\n"+"\n"
                );
            }
        }else
            System.err.print("\n******* Erreur Aucun Citoyen n'a été enregistré *******\n");
    }

    public static void modifierCitoyen(){
        if (!liste_de_tous_les_citoyens.isEmpty()){
            System.err.print("\n******* LISTE DE TOUS LES DONNEURS *******\n");
            AfficherCitoyen();
            liste_de_tous_les_citoyens.set(InputOutput.Io.setINT("Numero du citoyen à modifier :")-1,
                    new Citoyen(InputOutput.Io.setString("\nNom : "),InputOutput.Io.setString("\nPrenom : "),
                            Io.setString("Sexe :"),Io.setINT("Année de naissance :"),Io.setString("Lieu de naissance :")));
            System.err.print("\n******* LISTE DE TOUS LES CITOYENS MISE A JOUR *******\n");
            liste_de_tous_les_citoyens.remove(liste_de_tous_les_citoyens.size()-1);
            AfficherCitoyen();
        }else
            System.err.print("\n******* Erreur Aucun Citoyen n'a été enregistré *******\n");

    }

    public static void supprimerCitoyen(){
        if (!liste_de_tous_les_citoyens.isEmpty()){
            AfficherCitoyen();
            liste_de_tous_les_citoyens.remove(InputOutput.Io.setINT("Numero du citoyen à supprimer :")-1);
            AfficherCitoyen();
        }else
            System.err.print("\n******* Erreur Aucun Citoyen n'a été enregistré *******\n");
    }



}
