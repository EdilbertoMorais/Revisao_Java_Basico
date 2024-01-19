package desafios.orientacaoobjeto.aula4Interfaces;

/**
 * Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada
 * e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria
 * lógica de cálculo de preço.
 */
public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}

class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
    precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }
}

class Servico implements Vendavel{
    private String descricao;
    private double precoHora;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}

class TesteVendavel {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPrecoUnitario(100);
        System.out.println("O valor unitário do produto é de R$ " + produto.getPrecoUnitario());
        System.out.println("O preço total para os produtos é de R$ " + produto.calcularPrecoTotal(10));
        produto.aplicarDesconto(10);
        System.out.println("O valor unitário do produto APOS DESCONTO é de R$ " + produto.getPrecoUnitario());
        System.out.println("O preço total para os produtos APOS DESCONTO é de R$ " + produto.calcularPrecoTotal(10));

        System.out.println("___________________________________________");

        Servico servico = new Servico();
        servico.setPrecoHora(100);
        System.out.println("O valor por hora de SERVIÇO é de R$ " + servico.getPrecoHora());
        System.out.println("O preço total para o SERVIÇO é de R$ " + servico.calcularPrecoTotal(10));
        servico.aplicarDesconto(10);
        System.out.println("O valor por hora do SERVIÇO APOS DESCONTO é de R$ " + servico.getPrecoHora());
        System.out.println("O preço total do SERVIÇO APOS DESCONTO é de R$ " + servico.calcularPrecoTotal(10));

    }
}