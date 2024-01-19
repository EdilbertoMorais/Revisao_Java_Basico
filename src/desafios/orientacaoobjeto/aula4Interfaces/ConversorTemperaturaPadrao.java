package desafios.orientacaoobjeto.aula4Interfaces;

/**
 *Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
 * Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e
 * exibe os resultados.
 */
public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        double fahrenheit = (temperatura * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double temperatura) {
        double celsius = (temperatura - 32) * 5/9;
        System.out.println("A temperatura em Celsius é: " + celsius);
    }
}
interface ConversorTemperatura{
    void celsiusParaFahrenheit(double temperatura);
    void fahrenheitParaCelsius(double temperatura);
}

class TesteConversorTemperaturaPadrao{
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(25);
        conversor.fahrenheitParaCelsius(98.6);
    }
}