package composite;

import java.util.ArrayList;

public class Dossier implements Composant {
    private String nom;
    private final String type = "Dossier";
    protected ArrayList<Composant> composants = new ArrayList<>();

    public Dossier(){

    }

    public Dossier(String nom){
        this.nom= nom;
        this.composants = new ArrayList<Composant>();
    }

    public boolean isEmpty(){
        return composants.isEmpty();
    }

    public void decrire(){

        System.out.println("nom: "+nom + " type: " + type);
        for (Composant composant : composants) {
            
            composant.decrire();           
        }
    }

    public void ajouter(Composant composant){
        composants.add(composant);
    }

    public void supprimer(Composant composant){
        composants.remove(composant);
    }

    public Composant obtenir(int index){
        return composants.get(index);
    }

}
