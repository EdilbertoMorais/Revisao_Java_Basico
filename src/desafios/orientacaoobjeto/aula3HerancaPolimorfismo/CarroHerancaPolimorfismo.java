package desafios.orientacaoobjeto.aula3HerancaPolimorfismo;

import java.util.Arrays;

/**
 * Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos
 * para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
 * Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir
 * preços e mostrar informações.
 */
public class CarroHerancaPolimorfismo {

    //atributo que receberá o nome do modelo
    private String nomeModelo;
    //atributo que recebe um Array com o preço para cada 1 dos 3 anos solicitados no exercício.
    private double[] precos;

    //método que defini o nome do modelo e instancia o array com 3 posições para representar os 3 anos solicitados
    //o tamanho do array pode ser definido neste método, caso fosse 4 anos, bastaria mudar o array de 3 para 4 posições.
    public CarroHerancaPolimorfismo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
        this.precos = new double[3];
    }

    //método que define o preço do modelo para os anos solicitados
    public void definirPrecos(double preco1, double preco2,
                              double preco3){
        this.precos[0] = preco1;
        this.precos[1] = preco2;
        this.precos[2] = preco3;
    }

    //Converte o array em stream, utiliza o método min que retorna um Optional que pode conter ou não um valor, o
    // método orElse(0) fornece um valor padrão caso o retorno do método min seja null.
    //Portanto, o método calcularMenorPreco converte o array precos em um fluxo stream, calcula o valor mínimo usando a
    //operação min e retorna esse valor. Se o array estiver vazio, o valor padrão 0 será retornado
    private double calcularMenorPreco() {
        return Arrays.stream(precos).min().orElse(0);
    }

    //Mesmo que o método calcularMenorPreco só que calculando o maior valor.
    private double calcularMaiorPreco() {
        return Arrays.stream(precos).max().orElse(0);
    }
    public void exibirInfoPrecos() {
        System.out.println("Informações de preços para o modelo " + nomeModelo + ":");
        System.out.println("Ano 1: R$" + precos[0]);
        System.out.println("Ano 2: R$" + precos[1]);
        System.out.println("Ano 3: R$" + precos[2]);
        System.out.println("Menor preço: R$" + calcularMenorPreco());
        System.out.println("Maior preço: R$" + calcularMaiorPreco());
    }
}

//A classe ModeloCarro utiliza uma classe base CarroHerancaPolimorfismo que possui um nome de modelo e um array
// de preços para os três anos. Ela também é usada na classe Principal para criar uma instância específica e
// definir os preços.
class ModeloCarro extends CarroHerancaPolimorfismo {
    public ModeloCarro(String nomeModelo) {
        super(nomeModelo);
    }
}

class TesteCarroHerancaPolimorfismo {

public static void main(String[] args) {
    ModeloCarro cruze = new ModeloCarro("Cruze LT 1.8 Automático");

    cruze.definirPrecos(50000.0, 60000.0, 30000.0);
    cruze.exibirInfoPrecos();
}
}
