package Exercicio4;

import Exercicio3.Conta;
import Exercicio3.ContaExcecao;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.getDeposito(2000);

        try {
            conta.saca(2500);
        } catch (ContaExcecao e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
            System.out.println("Saldo disponível: " + e.getSaldoConta());
        }
    }
}