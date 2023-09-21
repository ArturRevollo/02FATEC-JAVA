import java.util.Scanner;

public class ValorMaisFrequente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];

        // Pedir para o usuario inserir 10 numeros
        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Para encontrar o valor mais frequente e sua frequencia
        int valorMaisFrequente = 0;
        int frequenciaMaisFrequente = 0;

        for (int i = 0; i < tamanhoArray; i++) {
            int valorAtual = numeros[i];
            int frequenciaAtual = 1;

            for (int j = i + 1; j < tamanhoArray; j++) {
                if (numeros[j] == valorAtual) {
                    frequenciaAtual++;
                }
            }

            if (frequenciaAtual > frequenciaMaisFrequente) {
                frequenciaMaisFrequente = frequenciaAtual;
                valorMaisFrequente = valorAtual;
            }
        }

        // Para imprimir o valor mais frequente e sua frequencia
        System.out.println("O valor mais frequente: " + valorMaisFrequente);
        System.out.println("Frequencia: " + frequenciaMaisFrequente);

        scanner.close();
    }
}