package Singleton;

public class TestOperationMathematique {

    public static void main(String[] args) {
        
       int som = OperationMathematique.getInstance().somme(2, 3, 4);
        System.out.println("\n La somme est "+ som);

        float moy = OperationMathematique.getInstance().moyenne(2, 3, 4);
        System.out.println("\n La moyenne est "+ moy);

        OperationMathematique s1 = OperationMathematique.getInstance(8, 3, 5);
        s1.affiche();

        OperationMathematique s2 = OperationMathematique.getInstance(5, 9, 2);
        s2.affiche();

    }
    
}
