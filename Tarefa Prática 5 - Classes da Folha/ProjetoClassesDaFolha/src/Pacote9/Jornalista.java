package Pacote9;

public class Jornalista {
    public boolean matéria;
    public boolean entrevista;
    public boolean manchete;

    public void EntregarNotícia() {
        if (matéria && entrevista && manchete) {
            System.out.println("Entregando a notícia para todo o público.");
        }
    }
}