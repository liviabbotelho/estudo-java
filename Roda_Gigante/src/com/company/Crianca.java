package com.company;

public class Crianca extends Pessoa {

    private Adulto responsavel;

    Crianca(String nome, int idade, Adulto responsavel) {
        super(nome, idade);
        this.responsavel = responsavel;
    }

    Crianca(String nome, int idade) {
        super(nome, idade);
    }

}
