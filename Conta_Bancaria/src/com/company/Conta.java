package com.company;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    void setNum(int numero) {
        this.numero = numero;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    int getNumero() {
        return this.numero;
    }

    double getSaldo() {
        return this.saldo;
    }

    Cliente getCliente() {
        return this.cliente;
    }
}