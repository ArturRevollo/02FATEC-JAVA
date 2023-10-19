public class Cadeira {
    String tipo;
    String material;
    float preço;

    void CadeiraOcupada(){
        if(tipo != null && material != null && preço > 0){
            System.out.println("Alguém está usando esta cadeira confortável.");
        }
    }
}