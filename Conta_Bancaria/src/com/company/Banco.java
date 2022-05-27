package com.company;

public class Banco {
    void depositar(Conta conta, double quantia) {
        double saldo = conta.getSaldo();
        saldo += quantia;
        conta.setSaldo(saldo);
    }

    // Todo: Verificar saldo antes das operações
    boolean sacar(Conta conta, double quantia) {

        if (conta.getSaldo() < quantia) {
            System.out.println("Não foi possível realizar a operação, o seu saldo está abaixo de " + quantia);
            return false;
        } else {
            double saldoAtual = conta.getSaldo() - quantia;
            conta.setSaldo(saldoAtual);
        }
        return true;
    }

    void consultarSaldo(Conta conta) {
        System.out.println("Seu saldo atual é: " + conta.getSaldo());
    }

    boolean transferir(Conta c1, Conta c2, double quantia) {
        if (sacar(c1, quantia)) {
            depositar(c2, quantia);
            return true;
        }
        return false;
    }
}
