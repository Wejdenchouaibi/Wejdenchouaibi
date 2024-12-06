public class Main {
    public static void main(String[] args) {
        Etudiant[] T = new Etudiant[5];


        T[0] = new Etudiant("Alice", 14);
        T[1] = new Etudiant("Bob", 16);
        T[2] = new Etudiant("Carla", 12);
        T[3] = new Etudiant("David", 15);
        T[4] = new Etudiant("Emma", 18);

        System.out.println("Informations des étudiants :");
        for (Etudiant etudiant : T) {
            etudiant.afficherInfos();
        }

        System.out.println("Nombre total d'étudiants : " + T.length);


        for (Etudiant etudiant : T) {
            if (etudiant.nom.equals("Carla")) {
                etudiant.note = 13;
                break;
            }
        }


        boolean miseAJourReussie = false;
        for (Etudiant etudiant : T) {
            if (etudiant.nom.equals("Alice")) {
                if (19 >= 0 && 19 <= 20) {
                    etudiant.note = 19;
                    miseAJourReussie = true;
                }
                break;
            }
        }
        System.out.println("Mise à jour de la note d'Alice : " + (miseAJourReussie ? "Réussie" : "Échec"));


        Etudiant e1 = new Etudiant("Lucas", "Marc", 17);


        System.out.println("Informations de e1 :");
        e1.afficherInfos();


        Etudiant e2 = new Etudiant("Chloé", "Léa", 10);


        System.out.println("Prénom de e2 : " + e2.prenom);
    }
}