package desafios.listascolecoes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para
 * que seja possível ordenar uma lista de objetos Titulo.
 *
 * crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a
 * lista e, em seguida, imprima os títulos ordenados.
 */
public class Titulo implements Comparable<Titulo> {

    private String nome;

    public Titulo(String nomeTitulo) {
        this.nome = nomeTitulo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}

class TesteTitulo {
    public static void main(String[] args) {

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("A"));
        listaTitulos.add(new Titulo("B"));
        listaTitulos.add(new Titulo("C"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }
    }
}
