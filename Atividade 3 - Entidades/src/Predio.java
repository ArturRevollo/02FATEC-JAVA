public class Predio {
    int altura;
    float metragem;
    int QuantidadeApartamentos;
    String estacionamento;

    void AbrigarPessoas(){
        if(altura > 0 && metragem > 0 && QuantidadeApartamentos > 0 && estacionamento != null){
            System.out.println("O prédio está cheio de moradores e funcionários.");
        }
    }
}