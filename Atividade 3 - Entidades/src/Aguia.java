public class Aguia {
    String especie;
    String penas;
    String asas;
    String bico;
    String garras;
    float tamanhoComprimentoCentímetro;

    void Caçar(){ 
        if(especie != null && penas != null && asas != null && bico != null && garras != null && tamanhoComprimentoCentímetro > 0){
            System.out.println("A águia está caçando.");
        }
    }
}