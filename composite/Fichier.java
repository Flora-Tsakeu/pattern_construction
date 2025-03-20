package composite;

public class Fichier implements Composant {
    
    private String nom;
    private String type;

    public Fichier(){

    }

    public Fichier(String nom, String type){
        this.nom = nom;
        this.type = type;
    }

    public void decrire(){
        System.out.println("nom: "+nom + " type: " + type);
    }
}
