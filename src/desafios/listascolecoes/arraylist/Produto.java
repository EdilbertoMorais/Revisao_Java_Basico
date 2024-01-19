package desafios.listascolecoes.arraylist;

import java.util.ArrayList;

/**
 * Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize
 * um loop para calcular e imprimir o preço médio dos produtos.
 */
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}

class TesteProdutoLoop{
    public static void main(String[] args) {
        // Criando uma lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto vassoura = new Produto("vassoura", 15.5);
        Produto rodo = new Produto("rodo", 5.5);
        Produto pa = new Produto("pa", 3.5);
        Produto balde = new Produto("balde", 11);

        produtos.add(vassoura);
        produtos.add(rodo);
        produtos.add(pa);
        produtos.add(balde);
        // Calculando o preço médio usando um loop
        double precoTotal = 0;
        for (Produto produto : produtos){
            precoTotal += produto.getPreco();
        }
        // Calculando o valor médio dos produtos com base no tamanho do array
        double precoMedio = precoTotal / produtos.size();
        // Imprimindo o preço médio
        System.out.println("Preço médio dos produtos: " + precoMedio);

    }
}
