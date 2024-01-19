package desafios.orientacaoobjeto.aula1Sintaxe;

/*
Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e
modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço
do produto.
 */

public class Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto(int percentualDesconto){
        if (percentualDesconto >= 0 && percentualDesconto <= 100) {
            double desconto = (percentualDesconto / 100.0);
            double valorComDesconto = desconto  * this.preco;
            this.preco -= valorComDesconto;
            System.out.println("Desconto aplicado de " + percentualDesconto + "%");
            System.out.println("Desconto aplicado com sucesso! Novo preço: R$" + this.preco);
        } else {
            System.out.println("O percentual de desconto deve estar entre 0 e 100.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("TENIS");
        produto.setPreco(100.0);

        produto.aplicarDesconto(20);
    }
}
