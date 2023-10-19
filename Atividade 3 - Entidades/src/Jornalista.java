public class Jornalista {
    boolean matéria;
    boolean entrevista;
    boolean manchete;

    void EntregarNotícia() {
        if (matéria && entrevista && manchete) {
            System.out.println("Entregando a notícia para todo o público.");
        }
    }
}