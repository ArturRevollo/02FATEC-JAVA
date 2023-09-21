import java.util.Random;

public class ContagemNumerosImpares {
    public static void main(String[] args) {
        Random random = new Random();

        int tamanhoArray = 30;
        int[] numeros = new int[tamanhoArray];

        // Para preencher o array com numeros aleatorios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Para contar quantos numeros sao impares
        int contadorImpares = 0;

        for (int i = 0; i < tamanhoArray; i++) {
            if (numeros[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        // Para imprimir o array de numeros aleatorios e o numero de impares
        System.out.println("Array de numeros aleatorios:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Para pular linha
        System.out.println("Numero de impares: " + contadorImpares);
    }
}
