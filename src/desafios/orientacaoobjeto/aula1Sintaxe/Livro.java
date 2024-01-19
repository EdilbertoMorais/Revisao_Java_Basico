package desafios.orientacaoobjeto.aula1Sintaxe;
/*
Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar
e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

 */
public class Livro {
    private String titulo;
    private String autor;

    public void exibirDetalhes(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setAutor("Edilberto");
        livro.setTitulo("Aprendendo Java");

        livro.exibirDetalhes();
    }
}
