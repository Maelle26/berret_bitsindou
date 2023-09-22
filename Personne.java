package tp2;

public class Personne {

    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * méthode equals qui compare deux personnes
     * @param p la personne à comparer
     * @return true si les deux personnes sont égales, false sinon
     */
    public boolean equals (Personne p){
        boolean res = false;
        if (this.nom.equals(p.nom) && this.prenom.equals(p.prenom)){
            res = true;
        }
        return res;
    }
}
