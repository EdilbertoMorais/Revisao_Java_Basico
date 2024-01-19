package projetos.desafiosdocurso.minhasmusicas.principal;
/**
 * Usamos neste exemplo:
 * conceitos de orientação a objetos, encapsulamento, herança e polimorfismo.
 */

import projetos.desafiosdocurso.minhasmusicas.modelo.MinhasPreferidas;
import projetos.desafiosdocurso.minhasmusicas.modelo.Musica;
import projetos.desafiosdocurso.minhasmusicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++){
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha DEV");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++){
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);
    }
}
