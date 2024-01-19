package desafios.listascolecoes.arraylist;

/**
 * Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo,
 * Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para
 * calcular e imprimir a área de cada forma.
 */
public interface Forma {
    double calcularArea();
}

class Circulo implements Forma {
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

class Quadrado implements Forma {
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class TesteForma {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        System.out.println("A área do circulo é de: " + circulo.calcularArea());
        System.out.println("A área do quadrado é de: " + quadrado.calcularArea());


    }
}