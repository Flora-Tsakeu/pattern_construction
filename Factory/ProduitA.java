package Factory;

public abstract class ProduitA {

    public abstract void methodeA();

}

 class ProduitA1 extends ProduitA{

    public void methodeA(){
        System.out.println("je suis un produit de classe A1");
        System.out.println("ProduitA1.methodeA()");
    }
}

 class ProduitA2 extends ProduitA{
    public void methodeA(){
    System.out.println("Je suis un produit de classe A2");
    System.out.println("ProduitA2.methodeA()");
    }
}

class ProduitA3 extends ProduitA{
    public void methodeA(){
        System.out.println("je suis un produit de classe A3");
        System.out.println("ProduitA3.methodeA()");
    }
}
