package desafios.orientacaoobjeto.aula1Sintaxe;
public class Aluno {
    String nome;
    int idade;

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Edilberto";
        aluno1.idade = 37;

        System.out.println(aluno1.toString());
    }
}
