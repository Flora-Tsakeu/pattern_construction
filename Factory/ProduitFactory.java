package Factory;

public abstract class ProduitFactory {
    public ProduitA getProduitA(){
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}

class ProduitFactory1 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA1();
    }
}

class ProduitFactory2 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
}

class ProduitFActory3 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA3();
    }
}


