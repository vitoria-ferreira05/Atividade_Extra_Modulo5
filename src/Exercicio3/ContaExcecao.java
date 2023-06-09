package Exercicio3;

public class ContaExcecao extends Exception {
    private double saldoConta;

    public ContaExcecao(String message, double saldoConta) {
        super(message);
    }

    public double getSaldoConta() {
        return saldoConta;
    }
}
