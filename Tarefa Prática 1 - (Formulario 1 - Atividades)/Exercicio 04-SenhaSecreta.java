import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {

    //EXERCICIO 04
        Scanner input = new Scanner(System.in);

        String password = "javadsm123";

        System.out.print("Digite a senha: ");
        String userPassword = input.nextLine();

        while (!userPassword.equals(password)) {
            System.out.println("Senha incorreta! Tente novamente: ");
            System.out.print("Digite a senha: ");
            userPassword = input.nextLine();
        }

        System.out.println("Acesso permitido!");    
  }
}
