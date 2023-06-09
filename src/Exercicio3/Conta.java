package Exercicio3;

public class Conta {
    private double deposito;
    private double limite;
    private double saque;
    private double saldoConta;


    public Conta() {
        this.deposito = deposito;
        this.limite = limite;
        this.saque = saque;
        this.saldoConta = saldoConta;
    }

    public double getDeposito(double deposito) {
        return deposito;
    }

    public void saca(double valor) throws ContaExcecao {
        if (valor > saldoConta) {
            throw new ContaExcecao("Saldo insuficiente para realizar o saque.", saldoConta);
        } else {
            saldoConta -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoConta);
        }
    }
}
