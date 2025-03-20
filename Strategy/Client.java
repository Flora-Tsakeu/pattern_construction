package Strategy;

public class Client {

    public static void main(String [] args){
        ImageStorage imageStorage;

        System.out.println("//****** compression Jpeg et filtre BlackAndWhite *********//\n");
        imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store();

        System.out.println("\n//******compression png et filtre highConstrastFilter *******//\n");
        imageStorage = new ImageStorage(new PngCompressor(), new HighContrastFilter());
        imageStorage.store();


    }
    
}
