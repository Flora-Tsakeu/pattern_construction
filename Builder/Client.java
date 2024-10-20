package Builder;

public class Client {
    public static void main(String[] args) {
        // Créer le Directeur
        Directeur directeur = new Directeur();
        

        // Créer et utiliser le MonteurPizzaReine
        System.out.println("\n construction de la pizza Reine");
       MonteurPizza monteurPizza = new MonteurPizzaReine();
       directeur.setMonteur(monteurPizza);
        Pizza pizzaReine = directeur.construire();
        pizzaReine.print();

    
        

        // Créer et utiliser le MonteurPizzaPiquante
        System.out.println("\n construction de la pizza Piquante");
        monteurPizza = new MonteurPizzaPiquante();
        directeur.setMonteur(monteurPizza);
        Pizza pizzaPiquante = directeur.construire();
        pizzaPiquante.print();
        
    }
    
}
