package Pacote2;

public class Cadeira {
    public String tipo;
    public String material;
    public float preço;

    public void CadeiraParada(){
        if(tipo != null && material != null && preço > 0){
            System.out.println("A cadeira está livre e pode ser usada!");
        }
    }
}
