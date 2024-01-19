package desafios.listascolecoes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
 * Em seguida, imprima a lista ordenada.
 */
public class ListaDeNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(7);
        numeros.add(9);
        numeros.add(10);
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(6);
        numeros.add(8);

        System.out.println("Números não ordenados" + numeros);
        Collections.sort(numeros);
        System.out.println("Números ordenados" + numeros);
    }
}
