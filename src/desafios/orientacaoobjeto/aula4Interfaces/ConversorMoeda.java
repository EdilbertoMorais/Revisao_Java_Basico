package desafios.orientacaoobjeto.aula4Interfaces;

/**
 * Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
 * converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar
 * como parâmetro.
 */

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é R$ " + valorReal);
    }
}

interface ConversaoFinanceira {

    void converterDolarParaReal(double valorDolar);
}

class TesteConversorMoeda {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(100);
    }
}
