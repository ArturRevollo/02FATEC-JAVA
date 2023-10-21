package Pacote4;

public class Fotografia {
    public String pixels;
    public float tamanhoMegaBytes;
    public String tipo;
    public String elementos;
    public String cores;

    public void RegistrarMomento(){
        if(pixels != null && tamanhoMegaBytes > 0 && tipo != null && elementos != null && cores != null){
            System.out.println("A fotografia registrou um momento muito importante.");
        }
    }
}
