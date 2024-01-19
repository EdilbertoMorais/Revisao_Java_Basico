package desafios.orientacaoobjeto.aula1Sintaxe;

import java.time.LocalDate;

public class Carro {

    String modelo;
    int ano;
    String cor;

    int idadeCarro(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Carro cruze = new Carro();
        System.out.println("O ano atual é: " + LocalDate.now().getYear());

        cruze.ano = 2013;
        cruze.cor = "Prata";
        cruze.modelo = "Cruze LT";

        System.out.println(cruze.toString());

        System.out.println("A idade do carro é: " + cruze.idadeCarro());
    }
}
