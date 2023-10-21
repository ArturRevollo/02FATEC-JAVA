import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO 01
    
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        if (idade >= 18 && idade <= 60) {
            System.out.println("Voce e adulto");
        } else if (idade >= 60) {
            System.out.println("Voce e idoso");
        }
        else {
            System.out.println("Voce e menor de idade");
        }    
  }
}