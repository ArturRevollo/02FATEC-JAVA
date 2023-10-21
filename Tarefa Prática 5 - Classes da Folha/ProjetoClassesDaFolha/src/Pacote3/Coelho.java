package Pacote3;

public class Coelho {
    public String especie;
    public String cor;
    public String sexo;
    public float peso;

    boolean Animal;

    public void SaltarChão(){
        if(especie!= null && cor != null && sexo != null && peso > 0){
            Animal = true;
            System.out.println("O coelho está saltando no chão.");
        }
    }
}
