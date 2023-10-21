package Pacote1;

public class Aguia {
    public String especie;
    public String penas;
    public String asas;
    public String bico;
    public String garras;
    public float tamanhoComprimentoCentímetro;

    public void Caçar(){ 
        if(especie != null && penas != null && asas != null && bico != null && garras != null && tamanhoComprimentoCentímetro > 0){
            System.out.println("A águia está caçando.");
        }
    }
}
