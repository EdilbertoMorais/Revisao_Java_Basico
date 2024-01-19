package exemplos;

import java.util.Scanner;

public class LoopComWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota > -1) {
            System.out.print("Digite sua avaliação para o Filme ou -1 para encerrar: ");
            nota = scanner.nextDouble();

            if (nota > -1){
            mediaAvaliacao += nota;
            totalNotas++;
            }
        }

        System.out.print("Média de avaliação = " + mediaAvaliacao / totalNotas );

    }
}
