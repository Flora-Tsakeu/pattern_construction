package AbstractFactory;

public interface IProduitFactory {

    public ProduitA getProduitA();
    public ProduitB getProduitB();
}

class ProduitFactory1 implements IProduitFactory {
    
    public ProduitA getProduitA() {
        return new ProduitA1();
    }
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}

class ProduitFactory2 implements IProduitFactory {
    public ProduitA getProduitA() {
        return new ProduitA2();
    }
    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}