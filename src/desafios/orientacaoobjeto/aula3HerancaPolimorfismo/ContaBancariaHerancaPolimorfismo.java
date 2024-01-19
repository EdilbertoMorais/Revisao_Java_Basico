package desafios.orientacaoobjeto.aula3HerancaPolimorfismo;

/**
 * Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
 * consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um
 * método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
 */
public class ContaBancariaHerancaPolimorfismo {

    protected double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de " + valor + " realizado com sucesso. Saldo atual " + saldo);
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de "+ valor +" realizado com sucesso. Saldo atual " + saldo);
        } else {
            System.out.println("Saldo insuficiente. Saldo Atual " + saldo);
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual " + saldo);
    }
}

class ContaCorrente extends ContaBancariaHerancaPolimorfismo{
    private double tarifaMensal = 10.0;
    public void cobrarTarifaMensal(){
        System.out.println("Cobrando taxa mensal da Conta");
        saldo -= tarifaMensal;
    }
}

class TesteContaBancariaHerancaPolimorfismo {
    public static void main(String[] args) {
        ContaCorrente cc = new  ContaCorrente();
        cc.depositar(1000);
        cc.cobrarTarifaMensal();
        cc.consultarSaldo();
        cc.sacar(500);
    }
}