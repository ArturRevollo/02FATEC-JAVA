public class Coelho {
    String especie;
    String cor;
    String sexo;
    float peso;

    boolean Animal;

    void SaltarChão(){
        if(especie!= null && cor != null && sexo != null && peso > 0){
            Animal = true;
            System.out.println("O coelho está saltando no chão.");
        }
    }
}