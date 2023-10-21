package Pacote10;

public class Predio {
    public int altura;
    public float metragem;
    public int QuantidadeApartamentos;
    public String estacionamento;

    public void AbrigarPessoas(){
        if(altura > 0 && metragem > 0 && QuantidadeApartamentos > 0 && estacionamento != null){
            System.out.println("O prédio está cheio de moradores e funcionários.");
        }
    }
}