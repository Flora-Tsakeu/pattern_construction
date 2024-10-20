package AbstractFactory;



public abstract class ProduitA {
    public abstract void methodeA();
    
}



class ProduitA1 extends ProduitA {
    public void methodeA() {
      System.out.println("ProduitA1.methodeA()"); 
    }  
}

class ProduitA2 extends ProduitA { 
  public void methodeA() {
      System.out.println("ProduitA2.methodeA()");
  } 
}