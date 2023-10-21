import java.util.Random;
import java.util.Scanner;

public class BuscaNumeroArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int tamanhoArray = 25;
        int[] numeros = new int[tamanhoArray];

        // Para preencher o array com numeros aleatorios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Para exibir o array para o usuario
        System.out.println("Array de numeros aleatorios:");
        
        System.out.println(); // Para pular linha
        
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Para pular linha
        System.out.println(); // Para pular linha

        // Para pedir ao usuario inserir um numero
        System.out.print("Digite um numero para buscar no array: ");
        int numeroBuscado = scanner.nextInt();

        // Para verificar se o numero esta no array
        boolean encontrado = false;
        for (int i = 0; i < tamanhoArray; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                break; // Isso encerra o loop assim que encontrar o numero
            }
        }

        // Para informar o resultado da busca
        if (encontrado) {
            System.out.println("O numero " + numeroBuscado + " esta no array.");
        } else {
            System.out.println("O numero " + numeroBuscado + " nao esta no array.");
        }

        scanner.close();
    }
}