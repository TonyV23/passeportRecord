package Main;

import InputOutput.Io;
import Personne.Citoyen;

public class run {

    private static final String[] liste_sexe = new String[]{"M", "F"};

    public static String saisirEtVerificationSexe() {
        String sexe_utilisateur = Io.setString("\nSexe : ");
        String sexe = null;
        for (int i = 0; i < liste_sexe.length; i++) {
            if (liste_sexe[i].contentEquals(sexe_utilisateur)) {
                sexe = liste_sexe[i];
                return sexe;
            }
        }
        System.err.print("\n****** CE GENRE N'EXISTE PAS ******\n");
        saisirEtVerificationSexe();

        return sexe;
    }

    // fonction de demarrage
    static void Menu () {
        System.out.print("\n1.Enregistrer un Citoyen");
        System.out.print("\n2.Afficher les citoyens");
        System.out.print("\n3.Modifier un citoyen");
        System.out.print("\n4.Supprimer un citoyen");
        System.out.print("\n5.Fermer et Quitter le programme");
    }

    private static void Operation () {
        Menu();
        int choix_utilisateur = Io.setINT("\n\nChoisir une action : ");
        switch (choix_utilisateur) {
            case 1 -> Citoyen.EnregistrerCitoyen();
            case 2 -> Citoyen.AfficherCitoyen();
            case 3 -> Citoyen.modifierCitoyen();
            case 4 -> Citoyen.supprimerCitoyen();
            case 5 -> {
                System.out.print("\n\n***** MERCI D'UTILISER NOTRE PROGRAMME AUREVOIR ******\n\n");
                System.exit(0);
            }
            default -> System.err.print("\n***** MAUVAISE ENTREE REESSAYER ******\n");
        }
    }
    public static void main (String[]args){
        while (true) {
            Operation();
        }
    }

}
