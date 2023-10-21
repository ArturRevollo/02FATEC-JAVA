package Pacote6;

public class Helicoptero {
    public boolean hélice;
    public boolean modelo;
    public boolean cor;
    public int capacidade;
    
    public void Voar(){
        if( hélice && modelo && cor && capacidade > 0){
            System.out.println("O helicóptero está voando pelo céu.");
        }
    }
}