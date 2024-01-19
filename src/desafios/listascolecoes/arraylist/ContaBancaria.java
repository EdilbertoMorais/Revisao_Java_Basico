package desafios.listascolecoes.arraylist;

import java.util.ArrayList;

/**
 * Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas
 * bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
 */
public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
class TesteContasBancarias {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        ContaBancaria conta1 = new ContaBancaria(1, 100);
        ContaBancaria conta2 = new ContaBancaria(2, 200);
        ContaBancaria conta3 = new ContaBancaria(3, 900);
        ContaBancaria conta4 = new ContaBancaria(4, 400);
        ContaBancaria conta5 = new ContaBancaria(5, 500);

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

        ContaBancaria contaComMaiorSaldo = contas.get(0);
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > contaComMaiorSaldo.getSaldo()) {
                contaComMaiorSaldo = conta;
            }
        }

        System.out.println("A conta com o maior saldo é: " + contaComMaiorSaldo.getNumeroConta());
    }
}
