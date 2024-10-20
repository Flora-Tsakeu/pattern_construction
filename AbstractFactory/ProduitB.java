package AbstractFactory;

public abstract class ProduitB {
    public abstract void methodeB();
}

class ProduitB1 extends ProduitB{

    public void methodeB() {
        System.out.println("ProduitB1.methodeB()");
    }
}

class ProduitB2 extends ProduitB{

    public void methodeB() {
        System.out.println("ProduitB2.methodeB()");
    }
}
