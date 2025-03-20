package adaptateur;

public class Rectangle {

    private float length;
    private float width;

    public void define (float length, float width){
        this.length = length;
        this.width = width;
    }

    public float perimeter(){
        return (length + width)*2;
    }

    public float area(){
        return length*width;
    }
    
}
