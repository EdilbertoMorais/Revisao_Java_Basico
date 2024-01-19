package desafios.orientacaoobjeto.aula1Sintaxe;

/**
 * Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da
 * classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão
 * sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o
 * Cachorro e arranharMoveis() para o Gato.
 */
public class Animal {
    public void emitirSom() {
        System.out.println("Som do animal");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");

    }
}

class Gato extends Animal {

    public void arranharMoveis() {
        System.out.println("Arranhando os móveis");
    }

    public void emitirSom(){
        System.out.println("Miau");
    }
}

class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
