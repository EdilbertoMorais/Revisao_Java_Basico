package exemplos;

import java.util.Scanner;

public class ConversosTemperaturas {

    public static void main(String[] args) {

        double celsius;
        double fahrenheit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = scanner.nextDouble();

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        ConversosTemperaturas conversosTemperaturas = new ConversosTemperaturas();
        conversosTemperaturas.conversorCelsiusParaFahrenheit(celsius);
        conversosTemperaturas.conversorFahrenheitParaCelsius(fahrenheit);

        scanner.close();

    }

    public void conversorCelsiusParaFahrenheit(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }

    public void conversorFahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura em Celsius é: " + celsius);
    }
}
