package desafios.orientacaoobjeto.aula1Sintaxe;
/*
Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e
modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
 */
public class IdadePessoa {
    private String nome;
    private int idade;

    public void verificaIdade(IdadePessoa pessoa){
        if (pessoa.getIdade() < 18) {
            System.out.println(pessoa.getNome() + " é MENOR de idade");
        }else {
            System.out.println(pessoa.getNome() + " é MAIOR de idade");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        IdadePessoa edilberto = new IdadePessoa();
        IdadePessoa isabelle = new IdadePessoa();

        edilberto.setIdade(37);
        edilberto.setNome("Edilberto");
        edilberto.verificaIdade(edilberto);

        isabelle.setIdade(4);
        isabelle.setNome("Isabelle");
        isabelle.verificaIdade(isabelle);

    }


}
