package Singleton;

public class OperationMathematique {

    private static OperationMathematique instance = null;

    private int x;
    private int y;
    private int z;

    private OperationMathematique (){

    }

    private OperationMathematique(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // methode de creation d'instance 
    public static OperationMathematique getInstance(){

        if(instance == null){
            instance = new OperationMathematique();
        }
        return instance;
    }
    
    //methode de creation d'instance
    public static OperationMathematique getInstance(int x, int y, int z){
        
        if(instance == null ){
            instance = new OperationMathematique(x, y, z);
        }
        return instance;
    }

    public int somme(int x, int y, int z){

        return x+y+z;
    }

    public float moyenne(int x, int y, int z){

        return somme(x, y, z)/3;
    }

    public void affiche(){

        System.out.println("\n Je suis une instance mes valeurs sont : x = "
    + this.x +" y = "+this.y+" et z = "+ this.z);
    }

    //redefinir la methode clone pour empêcher son utilisation
    public Object clone()throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}
