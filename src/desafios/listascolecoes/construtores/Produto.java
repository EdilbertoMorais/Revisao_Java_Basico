package desafios.listascolecoes.construtores;

import java.util.ArrayList;

/**
 * 1. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos
 * Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um
 * produto pelo índice
 *
 *Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida,
 * imprima a lista de produtos utilizando o método System.out.println().
 *
 * Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
 * Em seguida, crie objeto Produto utilizando esse novo construtor.
 *
 * Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que
 * utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel
 * e imprima seus valores.
 *
 * Nessa aula, você aprendeu:
 * A passar parâmetros ao instanciar objetos, com a utilização de construtores;
 * Como funciona o construtor default (padrão) no Java;
 * Como declarar construtores em uma classe;
 * A chamar o construtor da classe mãe, com a palavra reservada super.
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return '\n' +
                "nome do produto=' " + nome + '\'' +
                ", preco do produto= " + preco +
                ", quantidade do produto= " + quantidade + '\n';
    }
}

class ProdutoPerecivel extends Produto{

    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "nome do produto= " + getNome() + '\'' +
                ", preco do produto= " + getPreco() +
                ", quantidade do produto= " + getQuantidade() +
                ", dataValidade= " + dataValidade + '\n';
    }
}

class TesteProdutosConstrutor {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto carro = new Produto("Carro", 10000.0, 1);
        Produto moto = new Produto("Moto", 5000.0, 1);
        Produto bicicleta = new Produto("Bicicleta", 1000.0, 1);

        produtos.add(carro);
        produtos.add(moto);
        produtos.add(bicicleta);

        System.out.println("O tamanho da lista é de: " + produtos.size() + " produtos");
        System.out.println("____________________________________________________________");
        System.out.println( "O nome do primeiro produto é: " + produtos.get(0).getNome());
        System.out.println("____________________________________________________________");
        System.out.println(produtos);

        //Imprime usando um for
//        for (Produto produto : produtos){
//            System.out.println(produto);
//        }

        System.out.println("____________________________________________________________");
        ProdutoPerecivel perecivel = new ProdutoPerecivel( "peixe", 10.0, 1,"20/12/2024");
        System.out.println(perecivel);

        System.out.println("____________________________________________________________");
        //Instanciando um objeto do tipo Produto
        Produto produtoTeste = new Produto("teste", 1, 1);
        //Apontando a variavel produtoTeste2 para o mesmo objeto da variavel produtoTeste
        Produto produtoTeste2 = produtoTeste;
        //Quando alteramos o preco da variavel produtoTeste2 também alteramos o do produtoTeste, pois ambas as
        // variáveis apontam para a mesma instancia do objeto
        produtoTeste2.setPreco(2);
        System.out.println(produtoTeste.getPreco());
        System.out.println(produtoTeste2.getPreco());
    }
}