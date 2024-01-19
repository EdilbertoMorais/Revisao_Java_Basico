package projetos.principaldocurso.screenmatch.principal;

import projetos.principaldocurso.screenmatch.modelos.Filme;
import projetos.principaldocurso.screenmatch.modelos.Serie;
import projetos.principaldocurso.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {

        //Instanciando Filme e Serie com uso dos construtores criados
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avaliaFilme(9);
        Filme meuFilme2 = new Filme("Avatar", 2023);
        meuFilme2.avaliaFilme(6);
        Serie lost = new Serie("Lost", 2000);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avaliaFilme(10);

        //Instanciando um array de Títulos onde estamos add Filme e Serie a variável ListaAssistidos.
        List<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(filmeDoPaulo);
        listaAssistidos.add(meuFilme);
        listaAssistidos.add(meuFilme2);
        listaAssistidos.add(lost);

        //Para cada item da listaAssistidos do tipo Titulo, faça System.out.println(item)
        //com isso será impresso os itens da listaAssistidos
        for (Titulo item : listaAssistidos){
//            System.out.println(item);
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }else {
                System.out.println("Não possui Classificação");
            }
        }

        System.out.println("_____________________________________________________");
        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Paulo");
        buscaPorArtistas.add("Jacqueline");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Busca depois da ordenação: " + buscaPorArtistas);

        Collections.sort(listaAssistidos);
        System.out.println("Lista de Títulos Assistidos ordenados: " + listaAssistidos);

        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + listaAssistidos);
    }
}
