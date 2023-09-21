import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    //EXERCICIO 02
        Scanner input = new Scanner(System.in);

        int n;
        int impares = 1;
        int soma = 0;

        System.out.print("Digite a quantidade de numeros impares: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            soma += impares;
            System.out.print(impares + " + ");
            impares += 2;
        }

        System.out.println(" = " + soma);    
  }
}
