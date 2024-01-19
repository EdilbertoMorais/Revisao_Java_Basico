package desafios.orientacaoobjeto.aula1Sintaxe;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.dobrarNumero(4));
    }

   int dobrarNumero(int valor){
       return valor * 2;
   }
}
