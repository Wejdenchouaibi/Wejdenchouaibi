class Etudiant {
    String nom;
    String prenom;
    int note;

    public Etudiant(String nom, int note) {
        this.nom = nom;
        this.note = note;
    }

    public Etudiant(String nom, String prenom, int note) {
        this.nom = nom;
        this.prenom = prenom;
        this.note = note;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom + ", Prénom : " + (prenom != null ? prenom : "N/A") + ", Note : " + note);
    }
}