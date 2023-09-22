package tp2;

import java.io.ObjectStreamException;
import java.util.HashMap;

public class Annuaire extends HashMap <String, String> {
    //On va pouvoir utiliser les méthodes put et get de HashMap

    //constructeur de la classe Annuaire
    public Annuaire () { //pas sure
        super();
    }

    /**
     * méthode domaine qui affiche l'ensemble des noms de l'annuaire
     */
    public void domaine (){
        for (String s : this.keySet()){
            System.out.println(s);
        }
    }

    /**
     * méthode acces qui affiche le numero associé au nom en paramètre
     * @param nom le nom dont on veut le numéro
     * @return le numéro associé au nom
     */
    public String acces (String nom){
        String res;
        if (this.containsKey(nom)){
            res = (this.get(nom));
        }
        else {
            return null;
        }
        return res;
    }

    /**
     * méthode adjonction qui ajoute un nom et un numéro à l'annuaire
     * @param nom le nom à ajouter
     * @param numero le numéro à ajouter
     */
    public void adjonction (String nom, String numero){
        if (!this.containsKey(nom)){
            this.put(nom,numero);
        }
    }

    /**
     * méthode suppression qui supprime une entrée de la table
     */
    public void suppression (String nom){
        if (this.containsKey(nom)){
            this.remove(nom);
        }
    }

    /**
     * méthode changement qui modifie le numéro associé au nom en paramètre
     */
    public void changement (String nom, String numero) {
        if (this.containsKey(nom)) {
            this.put(nom, numero);
        }
    }

    //méthode hashCode
    public int hashCode(){
        return super.hashCode();
    }

    //méthode equals
    public boolean equals (Annuaire a){
        boolean res = false;
        if (this.hashCode() == a.hashCode()){
            res = true;
        }
        return res;
    }
}
