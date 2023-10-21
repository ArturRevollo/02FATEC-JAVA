import java.util.Random;

public class ArrayNormalEInverso {
    public static void main(String[] args) {
        Random random = new Random();

        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];

        // Para preencher o array com numeros aleatorios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Para exibir o array em ordem normal para o usuario
        System.out.println("Array de numeros aleatorios em ordem normal:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println(); // Para pular linha
        System.out.println(); // Para pular linha

        // Para imprimir o array em ordem reversa
        System.out.println("Array de numeros aleatorios em ordem reversa:");
        for (int i = tamanhoArray - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Para pular linha
    }
}