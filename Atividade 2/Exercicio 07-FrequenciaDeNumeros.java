import java.util.Random;

public class ContagemNumerosArray {
    public static void main(String[] args) {
        Random random = new Random();

        int tamanhoArray = 50;
        int[] numeros = new int[tamanhoArray];

        // Para preencher o array com numeros aleatorios entre 1 e 10
        for (int i = 0; i < tamanhoArray; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }

        // Exibir o array para o usuario
        System.out.println("Array de numeros aleatorios:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Para pular linha

        // Para criar um array para armazenar a contagem de cada numero
        int[] contagem = new int[10];

        // Contar quantas vezes cada numero aparece no array
        for (int i = 0; i < tamanhoArray; i++) {
            int numero = numeros[i];
            contagem[numero - 1]++;
        }
    
        System.out.println(); // Para pular linha

        // Para imprimir a contagem de quantas vezes cada numero aparece no array
        System.out.println("Contagem de quantas vezes cada numero de 1 a 10 aparece no array:");
        System.out.println(); // Para pular linha
        
         
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1) + " apareceu" + ": " + contagem[i] + " vezes no array");
        }
    }
}