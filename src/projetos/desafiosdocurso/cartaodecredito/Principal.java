package projetos.desafiosdocurso.cartaodecredito;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Instancia o scanner para pegarmos a entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        //Atribui a variavel limite o valor digitado pelo usuário
        double limite = scanner.nextDouble();
        //Instancia o objeto CartaoCredito com o valor do limite informado
        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite a descrição da compra:");
            String descricao = scanner.next();

            System.out.println("Digite o valor da compra:");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.adicionaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso.");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = scanner.nextInt();
            }else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("*****************************************");
        System.out.println("Compras Realizadas: \n");

        Collections.sort(cartao.getCompras());

        for (Compra c : cartao.getCompras()){
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n*****************************************");

        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
    }
}
