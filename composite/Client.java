package composite;

public class Client {
    
    public static void main(String [] args){

        Fichier fichier1 = new Fichier("file1","txt");
        Fichier fichier2 = new Fichier("file2","txt");
        Fichier fichier3 = new Fichier("file3","pdf");
        Fichier fichier4 = new Fichier("file4","pdf");

        Dossier dossier1 = new Dossier("dossier1");
        Dossier dossier2 = new Dossier("dossier2");
        Dossier dossier3 = new Dossier("dossier3");
        Dossier dossier4 = new Dossier("dossier4");

        System.out.println("\n description du fichier1 et du dossier1\n");
        fichier1.decrire();
        dossier1.decrire();

        System.out.println("\n ajout de fichiers et dossiers dans le dossier 1\n");
        dossier1.ajouter(fichier1);
        dossier1.ajouter(fichier3);
        dossier1.ajouter(dossier3);
        dossier2.ajouter(fichier2);
        dossier1.ajouter(dossier2);
        dossier4.ajouter(fichier4);
        dossier4.ajouter(dossier3);
        dossier1.ajouter(dossier4);

        System.out.println("\n description du dossier 1\n");
        dossier1.decrire();

        System.out.println("\n suppression du dossier 2 et du fichier 1 du dossier 1\n");
        dossier1.supprimer(fichier1);
        dossier1.supprimer(dossier2);

        System.out.println("\n nouvelle description après affichage\n");
        dossier1.decrire();
    }
}
