package exemplos;

/*
Seu amigo Caio está trabalhando numa aplicação Java de uma loja e precisa implementar uma nova funcionalidade de
tributação de impostos. Até então, a aplicação possui as seguintes classes:
 */
public class HerancaInterface {

    public static void main(String[] args) {

    }
}

class Item {
    private String nome;
    private double preco;

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
}

class Produto2 extends Item implements Tributavel{
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calculaImposto() {
        return 0;
    }
}

class Servico extends Item implements Tributavel{
    private int quantidadeHoras;

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double calculaImposto() {
        return 0;
    }
}

class Brinde extends Item {
    private String justificativa;

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }
}

/**
 * E para implementar a nova funcionalidade, Caio criou uma interface chamada Tributavel com o seguinte código:
 */
interface Tributavel {
    double calculaImposto();
}

/**
 * E também criou uma classe para calcular o total de impostos:
 */
class CalculadoraImposto {
    private double totalImposto = 0;

    public void calculaImposto(Tributavel tributavel) {
        totalImposto += tributavel.calculaImposto();
    }
}

/**
 * E para que os Produtos e Serviços da loja sejam tributados, ele alterou o código dessas respectivas
 * classes para implementarem a interface Tributavel:
 *
 * Alterado as classes mencionadas e implementado o método calculaImposto em ambas.
 */
