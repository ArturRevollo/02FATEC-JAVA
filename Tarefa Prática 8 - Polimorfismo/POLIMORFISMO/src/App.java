import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Endereco end = new Endereco("Rua dos Alecrins", "PG", "SP");
        Pessoa pes = new Pessoa("Artur", 20, end);
        Compra com = new Compra("Guarda-Chuva", 40);
        Cupom cu = new Cupom(2);
        Disciplina dis = new Disciplina("DSM");
        Aluno al = new Aluno("Artur", 5);


        dis.mostrarDisiplina();
        pes.mostrarInformacoes();
        com.gerarCupom(cu);
        com.finalizar(cu);
    }    
}