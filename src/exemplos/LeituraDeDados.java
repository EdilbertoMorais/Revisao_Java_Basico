package exemplos;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do filme");

        String filme = scanner.nextLine();

        System.out.println(filme);
    }
}
