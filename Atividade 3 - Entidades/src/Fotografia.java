public class Fotografia {
    String pixels;
    float tamanhoMegaBytes;
    String tipo;
    String elementos;
    String cores;

    void RegistrarMomento(){
        if(pixels != null && tamanhoMegaBytes > 0 && tipo != null && elementos != null && cores != null){
            System.out.println("A fotografia registrou um momento muito importante.");
        }
    }
}