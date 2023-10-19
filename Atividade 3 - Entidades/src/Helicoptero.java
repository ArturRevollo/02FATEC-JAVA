public class Helicoptero {
    boolean hélice;
    boolean modelo;
    boolean cor;
    int capacidade;
    
    void Voar(){
        if( hélice && modelo && cor && capacidade > 0){
            System.out.println("O helicóptero está voando pelo céu.");
        }
    }
}