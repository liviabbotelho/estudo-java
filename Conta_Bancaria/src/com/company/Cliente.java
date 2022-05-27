package com.company;

public class Cliente {
    private String cpf;
    private String nome;

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCpf(String cpf) {
        this.cpf = cpf;
    }

    String getNome() {
        return this.nome;
    }

    String getCpf() {
        return this.cpf;
    }
}
