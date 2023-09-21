import java.util.Random;

public class MediaArray {
    public static void main(String[] args) {
        Random random = new Random();

        int tamanhoArray = 20;
        int[] numeros = new int[tamanhoArray];

        // Para preencher o array com numeros aleatorios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Para calcular a soma dos numeros no array
        int soma = 0;
        for (int i = 0; i < tamanhoArray; i++) {
            soma += numeros[i];
        }

        // Para calcular a media
        double media = (double) soma / tamanhoArray;

        // Para imprimir a media
        System.out.println("Array de numeros aleatorios:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Para pular linha
        
        System.out.println("Media dos numeros: " + media);
    }
}