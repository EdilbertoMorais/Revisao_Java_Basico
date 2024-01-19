package exemplos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite sua avaliação para o Filme: ");
            nota = scanner.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.print("Média de avaliação = " + mediaAvaliacao / 3 );

    }
}
