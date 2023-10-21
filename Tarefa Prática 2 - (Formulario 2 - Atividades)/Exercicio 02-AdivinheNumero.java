import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        // Isso gera um numero aleatorio entre 1 e 100
        
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Tente adivinhar o numero entre 1 e 100.");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");

            int palpite = scanner.nextInt();

            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Tente um numero mais alto.");

            } else if (palpite > numeroAleatorio) {
                System.out.println("Tente um numero mais baixo.");
            } else {
                acertou = true;
                System.out.println("MUITO BEM! Voce acertou o numero em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}
