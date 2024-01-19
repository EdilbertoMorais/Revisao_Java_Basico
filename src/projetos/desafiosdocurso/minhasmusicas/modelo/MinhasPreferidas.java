package projetos.desafiosdocurso.minhasmusicas.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " É considerado sucesso absoluto de preferência por todos.");
        }else {
            System.out.println(audio.getTitulo() + " Também é um dos que todos estão curtindo");
        }
    }
}
