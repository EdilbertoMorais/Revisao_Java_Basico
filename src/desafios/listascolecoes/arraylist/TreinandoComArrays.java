package desafios.listascolecoes.arraylist;
/**
 * Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
 */

import java.util.ArrayList;

public class TreinandoComArrays {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("teste1");
        nomes.add("teste2");
        nomes.add("teste3");
        nomes.add("teste4");

        for (String nome : nomes){
            System.out.println(nome);
        }
    }

}
