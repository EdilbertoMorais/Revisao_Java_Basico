package projetos.principaldocurso.screenmatch.principal;

import projetos.principaldocurso.screenmatch.calculo.CalculadoraDeTempo;
import projetos.principaldocurso.screenmatch.calculo.FiltroRecomendacao;
import projetos.principaldocurso.screenmatch.modelos.Episodio;
import projetos.principaldocurso.screenmatch.modelos.Filme;
import projetos.principaldocurso.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(10);
        System.out.println("Total das Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das Avaliações sem formatação: " + meuFilme.pegaMedia());
        System.out.println("Média das Avaliações formatada: " + meuFilme.pegaMediaFormatada());

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Minutos da Serie " + lost.getMinutosPorEpisodio());
        lost.exibeFichaTecnica();
        System.out.println("Duração para Maratonar Lost " + lost.getDuracaoEmMinutos() + " min");

        Filme meuFilme2 = new Filme("Avatar", 2023);
        meuFilme2.setDuracaoEmMinutos(200);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(lost);
        System.out.println("Tempo total do Filme: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avaliaFilme(10);
        System.out.println("____________________________________");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());

    }
}
