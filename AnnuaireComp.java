package tp2;

import java.util.HashMap;

public class AnnuaireComp extends HashMap <Personne, String> {

    //constructeur
    public AnnuaireComp () {
        super();
    }

    /**
     * méthode domaine qui affiche l'ensemble des noms de l'annuaire
     */
    public void domaine (){
        for (Personne p : this.keySet()){
            System.out.println(p);
        }
    }

    /**
     * méthode acces qui affiche le numero associé au nom/prénom en paramètres
     * @param nom le nom dont on veut le numéro
     * @param prenom le prénom dont on veut le numéro
     * @return le numéro associé au nom
     */
    public String acces (String nom, String prenom){
        String res;
        Personne p = new Personne(nom,prenom);
        if (this.containsKey(p)){
            res = (this.get(p));
        }
        else {
            return null;
        }
        return res;

    }

    /**
     * méthode adjonction qui ajoute un nom et un numéro à l'annuaire
     * @param p le nom à ajouter
     * @param numero le numéro à ajouter
     */
    public void adjonction (Personne p, String numero){
        if (!this.containsKey(p)){
            this.put(p,numero);
        }
    }

    /**
     * méthode suppression qui supprime une entrée de la table
     * @param p la personne à supprimer
     */
    public void suppression (Personne p){
        if (this.containsKey(p)){
            this.remove(p);
        }
    }

    /**
     * méthode changement qui modifie le numéro associé  à la personne en paramètre
     * @param p la personne dont on veut changer le numéro
     * @param numero le nouveau numéro
     */
    public void changement (Personne p , String numero) {
        if (this.containsKey(p)) {
            this.put(p, numero);
        }
    }

    /**
     * méthode hashCode qui retourne le hashCode de la classe
     * @return le hashCode de la classe
     */
    public int hashCode(){
        return super.hashCode();
    }

    /**
     * méthode equals qui compare deux annuaires
     * @param a l'annuaire à comparer
     * @return true si les deux annuaires sont égaux, false sinon
     */
    public boolean equals (AnnuaireComp a){
        boolean res = false;
        if (this.size() == a.size()){
            for (Personne p : this.keySet()){
                if (a.containsKey(p)){
                    if (this.get(p).equals(a.get(p))){
                        res = true;
                    }
                }
            }
        }
        return res;
    }

}
