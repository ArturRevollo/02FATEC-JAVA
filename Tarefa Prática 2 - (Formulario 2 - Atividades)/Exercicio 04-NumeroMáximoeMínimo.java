import java.util.Random;

public class MaiorMenorArray {
    public static void main(String[] args) {
        Random random = new Random();

        int tamanhoArray = 15;
        int[] numeros = new int[tamanhoArray];

        // Para preencher o array com numeros aleatorios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Para encontrar o maior e o menor valor no array
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < tamanhoArray; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Para imprimir o array de numeros aleatorios, o maior e o menor valor
        System.out.println("Array de numeros aleatorios:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Para pular linha
        System.out.println("Maior valor: " + maior);
        System.out.println(); // Para pular linha
        System.out.println("Menor valor: " + menor);
    }
}