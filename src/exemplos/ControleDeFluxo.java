package exemplos;

import javax.swing.*;
import java.math.BigInteger;
import java.util.Formatter;
import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite um numero inteiro qualquer: ");
//        int numeroDigitado = scanner.nextInt();
//        scanner.close();
//
//        if (numeroDigitado > 0) {
//            System.out.println("Número positivo");
//        }else {
//            System.out.println("Número negativo");
//        }

//        System.out.print("Digite dois números inteiros: ");
//        System.out.print("Digite o primeiro número inteiros: ");
//        int numero1 = scanner.nextInt();
//        System.out.print("Digite o segundo número inteiros: ");
//        int numero2 = scanner.nextInt();
//
//        if (numero1 == numero2) {
//            System.out.println("Os números são iguais.");
//        } else if (numero1 > numero2) {
//            System.out.println("O primeiro número é maior.");
//        } else {
//            System.out.println("O segundo número é maior.");
//        }


//        int opcao = 0;
//        do {
//            System.out.println("""
//                    Digite a opção desejada:
//                    1 - calcular a área do quadrado.
//                    2 - calcular a área do círculo.
//                    3 - sair.
//                    """);
//            if (scanner.hasNextInt()) {
//                opcao = scanner.nextInt();
//
//                switch (opcao) {
//                    case 1:
//                        System.out.println("informe uma medida");
//                        double medidaQuadrado = scanner.nextDouble();
//                        double resultadoQuadrado = medidaQuadrado * medidaQuadrado;
//                        System.out.println("A área do quadrado é de: " + resultadoQuadrado + "m²");
//                        break;
//                    case 2:
//                        System.out.println("informe uma medida");
//                        double medidaCirculo = scanner.nextDouble();
//                        double resultadoCirculo = Math.PI * Math.pow(medidaCirculo, 2);
//                        System.out.println("A área do circulo é de: " + resultadoCirculo);
//                        break;
//                    case 3:
//                        System.out.println("Programa encerrado. Obrigado");
//                        break;
//                    default:
//                        System.out.println("Opção inválida. Reiniciando programa.");
//                }
//            } else {
//                scanner.next(); // Limpar a entrada inválida
//                opcao = 0; // Definir opcao para um valor que não afeta o loop
//            }
//
//        } while (opcao != 3);
//
//        scanner.close();
//    }

        System.out.println("Digite um número de 1 a 10 e receba a tabuada desse numero.");
        int numeroDigitado = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numeroDigitado + " x " + i + " = " + (numeroDigitado * i));
        }


//        System.out.println("Digite um número qualquer: ");
//        int numeroDigitado = scanner.nextInt();
//        scanner.close();
//
//        if (numeroDigitado % 2 == 0){
//            System.out.println("Este número é par");
//        }else {
//            System.out.println("Este número é impar");
//        }

//        System.out.println("Digite um número qualquer para calcular o fatorial dele: ");
//        int numero = scanner.nextInt();
//        BigInteger resultado = BigInteger.ONE;//usando o BigInteger porque o valor do resultado não cabe no Long
//
//        for (int i = numero; i >= 1; i--) {
//            resultado = resultado.multiply(BigInteger.valueOf(i));
//            System.out.println(i);
//        }
//
//        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}

