package aplicacao.principal;

import automovel.carro.Carro;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema Virtual de Automóveis!");

        System.out.print("Qual a marca do veículo que você deseja?   ");
        String marca = scanner.next();

        System.out.print("Qual o modelo do veículo que você deseja?   ");
        String modelo = scanner.next();

        System.out.print("Qual o ano do veículo que você deseja?   ");
        int ano = scanner.nextInt();

        System.out.print("Qual a potência do motor do veículo que você deseja?   ");
        double motor = scanner.nextDouble();

        System.out.print("Quantos litros de gasolina cabem no tanque do veículo que você deseja?   ");
        double quantidadeTanque = scanner.nextDouble();

        Carro car = new Carro(marca, modelo, ano, motor, quantidadeTanque);

        System.out.print("Deseja abastecer o carro? (s / n)   ");
        String abastecer = scanner.next();

        if (abastecer.equals("n")) {
            return;
        }

        if (abastecer.equals("s")) {
            System.out.print("Quantos litros de gasolina você deseja adicionar?   ");
            double gasolina = scanner.nextDouble();
            car.adicionarGasolina(gasolina);

            System.out.print("Você deseja ligar o Carro? (s / n)   ");
            String ligar = scanner.next();

            if (ligar.equals("n")) {
                return;
            }

            if (ligar.equals("s")) {

                car.girarChaveIgnicao();

                System.out.print("Deseja acelerar o carro? (s / n)   ");
                String acelerar = scanner.next();

                if (acelerar.equals("n")) {
                    return;
                }

                if (acelerar.equals("s")) {
                    car.acelerar();

                    System.out.println("O carro acelerou." + car.getVelocidade());

                    while (car.getVelocidade() > 0) {
                        System.out.println("1- Frear");
                        System.out.println("2- Acelerar");
                        System.out.println("3- Desligar");
                        System.out.print("O que você deseja fazer?"   );

                        int opcao = scanner.nextInt();

                        switch (opcao) {
                            case 1:
                                car.frear();
                                if (car.getVelocidade() <= 0) {
                                    System.out.println("O carro está totalmente parado.  ");
                                    break;
                                } else {
                                    System.out.println("O carro freou.  " + car.getVelocidade());
                                    break;
                                }                            
                            case 2:
                                car.acelerar();
                                System.out.println("O carro acelerou.  " + car.getVelocidade());
                                break;
                            case 3:
                                car.girarChaveIgnicao();
                                break;
                        }
                    }
                }
            }
        }
    }
}