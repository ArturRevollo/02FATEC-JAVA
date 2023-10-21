import java.util.Random;

public class NumerosParesArray {
    public static void main(String[] args) {
       
        Random random = new Random();

        int[] numeros = new int[10];

        // Preencher o array com numeros aleatorios
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100);
        // Para gerar numeros aleatorios de 0 a 99
        }

        // Para imprimir apenas os numeros pares
        System.out.println("Numeros pares no array:");

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}