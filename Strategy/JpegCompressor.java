package Strategy;

public class JpegCompressor implements Compressor{
    
    public void compress(){
        System.out.println("Compression spécifique à JPEG");
    }
}
