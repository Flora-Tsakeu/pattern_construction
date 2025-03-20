package adaptateur;

public class Client {

    public static void main(String [] args){

        Square square = new Adapter(5);
        System.err.println("le perimètre de ce carré est: " + square.perimeter() + "\n");
        System.out.println("l'aire de ce carre est: " + square.area());


    }
    
}
