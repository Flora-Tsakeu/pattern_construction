package Factory;

public class Client {

    public static void main(String [] args){

        ProduitFactory1 produitFactory1= new ProduitFactory1();
        ProduitFactory2 produitFactory2= new ProduitFactory2();
        ProduitFActory3 produitFActory3 = new ProduitFActory3();

        ProduitA produitA = null ;

        System.out.println("\n Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();

        System.out.println("\n Utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitA.methodeA();
        System.out.println();

        System.out.println("\n Utilisation de la troisieme fabrique");
        produitA = produitFActory3.getProduitA();
        produitA.methodeA();
    
    }
    
}
