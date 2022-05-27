package com.company;

public class Gondola {

    private int numero;
    private Pessoa assento1;
    private Pessoa assento2;

    Gondola(int numero, Pessoa assento1, Pessoa assento2) {
        this.numero = numero;
        this.assento1 = assento1;
        this.assento2 = assento2;
    }

    Gondola(int numero, Pessoa pessoa) {
        this.numero = numero;
        this.assento1 = pessoa;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getAssento1() {
        return assento1;
    }

    public Pessoa getAssento2() {
        return assento2;
    }

}
