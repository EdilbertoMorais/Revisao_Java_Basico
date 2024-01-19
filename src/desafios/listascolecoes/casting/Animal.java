package desafios.listascolecoes.casting;

/**
 * Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe
 * Cachorro e faça o casting para a classe Animal.
 * <p>
 * Modifique o Exercício para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo
 * correto antes de fazer o casting.
 */
public class Animal {
    void emitirSom() {
        System.out.println("Som do Animal");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("Latindo...");
    }
}

class TesteCasting {
    public static void main(String[] args) {
        // Criando um objeto da classe Cachorro
        Cachorro cachorro = new Cachorro();
        // Chamando um método específico da classe Cachorro
        cachorro.latir();
        // Fazendo o casting para a classe Animal, com verificação usando instanceof
        if (cachorro instanceof Animal) {
            Animal animal = (Animal) cachorro;
            // Chamando um método da classe Animal
            animal.emitirSom();
            // Note que, após o casting, você não pode chamar métodos específicos da classe Cachorro
            // Isso resultaria em um erro de compilação
//         animal.latir();

            // Mas você pode fazer o downcasting para acessar métodos específicos da classe Cachorro novamente
            if (animal instanceof Cachorro) {
                Cachorro cachorroNovamente = (Cachorro) animal;
                cachorroNovamente.latir();

            }
        }
    }
}
