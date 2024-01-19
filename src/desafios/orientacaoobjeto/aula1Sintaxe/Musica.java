package desafios.orientacaoobjeto.aula1Sintaxe;

public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                '}';
    }

    void avaliar(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double pegaMedia(){
        return avaliacao / numAvaliacoes;
    }

    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Sertão Brabo";
        musica.artista = "joão Carrero";
        musica.anoLancamento = 2024;

        musica.avaliar(10);
        musica.avaliar(5);
        musica.avaliar(8);

        System.out.println("Avaliação: " + musica.avaliacao);
        System.out.println("Total de Avaliações: " + musica.numAvaliacoes);

        System.out.println(musica.toString());

        System.out.println("Média de Avaliações: " + musica.pegaMedia());;
    }
}
