package desafios.listascolecoes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
 * Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
 */
public class ListasDiversas {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        List<Integer> listaNumeros = new LinkedList<>();

        listaNomes.add("Stephanie");
        listaNomes.add("Isabelle");
        listaNomes.add("Edilberto");
        System.out.println("ArrayList: " + listaNomes);
        Collections.sort(listaNomes);
        System.out.println("ArrayList ordenada: " + listaNomes);

        listaNumeros.add(1);
        listaNumeros.add(4);
        listaNumeros.add(2);
        listaNumeros.add(3);
        System.out.println("LinkedList: " + listaNumeros);
        Collections.sort(listaNumeros);
        System.out.println("LinkedList ordenada: " + listaNumeros);

    }
}
