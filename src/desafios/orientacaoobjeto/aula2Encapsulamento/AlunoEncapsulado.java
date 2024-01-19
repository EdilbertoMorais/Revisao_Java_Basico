package desafios.orientacaoobjeto.aula2Encapsulamento;
/*
Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e
modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno
 */

import java.text.DecimalFormat;

public class AlunoEncapsulado {
    private String nome;
    private double nota;

    public void calcularMedia(double ... notas){
        double resultado = 0.0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println((i+1) + "ª nota= " + notas[i]);
            resultado += notas[i];
        }
        double media = resultado / notas.length;

        DecimalFormat mediaFormatada = new DecimalFormat("#.##");
        System.out.println("A média do aluno é: " + mediaFormatada.format(media));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public static void main(String[] args) {
        AlunoEncapsulado alunoEncapsulado = new AlunoEncapsulado();
        alunoEncapsulado.calcularMedia(10, 8.5, 7);

    }
}

