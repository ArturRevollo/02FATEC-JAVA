import java.util.Random;

public class SimulacaoLancamentoDados {
    public static void main(String[] args) {
        Random random = new Random(); // Cria um objeto Random para gerar numeros aleatorios

        int totalLancamentos = 100; // Total de lancamentos
        int contagemSete = 0; // Inicializa a contagem de soma igual a 7

        for (int i = 0; i < totalLancamentos; i++) {
            // Simula o lancamento de dois dados (cada dado de 1 a 6)
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            int somaDados = dado1 + dado2;

            // Verifica se a soma dos dados e igual a 7
            if (somaDados == 7) {
            contagemSete++;
            }
        }

        // Imprime o resultado
        System.out.println("Resultados dos lancamentos:");
        System.out.println("Total de lancamentos: " + totalLancamentos);
        System.out.println("Quantidade de vezes que a soma foi igual a 7: " + contagemSete);
    }
}