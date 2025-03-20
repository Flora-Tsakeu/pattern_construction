package adaptateur;


public class Adapter implements Square{
    
    private float side;
    private Rectangle rectangle = new Rectangle();

    public Adapter(float side) {
        rectangle.define(side, side);    
    }

    public Adapter(){
        
    }

    public float perimeter(){
        return rectangle.perimeter();
    }

    public float area(){
        return rectangle.area();
    }
}
