package desafios.orientacaoobjeto.aula1Sintaxe;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Edilberto Cunha";
        String tipoConta = "Corrente";
        Double saldo = 1500.00;
        int opcao = 0;

        System.out.printf("""
                ***********************************
                Nome do Cliente: %s
                Tipo de Conta: %s
                Saldo total: R$ %.2f
                ***********************************

                """, nome, tipoConta, saldo);

        String menu = """
                ***********************************
                O que deseja fazer:
                1 - Consultar Saldo
                2 - Deposito
                3 - Efetuar Saque
                4 - Sair
                ***********************************
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor para deposito: ");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("O saldo atual é: R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("O saldo atual é: R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente. O saldo atual é: R$ " + saldo);
                    }
                    break;
            }
        }
    }
}
