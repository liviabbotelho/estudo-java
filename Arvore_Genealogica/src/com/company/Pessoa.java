package com.company;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Pessoa conjuge;
    private List<Pessoa> filhos;

    Pessoa(String nome) {
        this.nome = nome;
        filhos = new ArrayList<>();
    }

    Pessoa(String nome, Pessoa pai) {
        this(nome);
        pai.adicionarFilho(this);
    }

    public void conjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public void adicionarFilho(Pessoa filho) {
        filhos.add(filho);
    }

    public void imprimeArvore(int nivel) {
        for(int i=0; i<=nivel; i++){
            System.out.print("\t");
        }
        if (conjuge == null) {
            System.out.println("-->"+nome+ " é solteiro(a)");
        }
        else if (filhos!=null && !filhos.isEmpty()){
            System.out.println("-->"+nome + " é casado(a) com " + conjuge.nome + " filhos:");
            for (Pessoa filho:this.filhos) {
                filho.imprimeArvore(nivel+1);
            }
        }
        else{
            System.out.println("-->"+nome + " é casado(a) com " + conjuge.nome + " e não tem filhos");
        }
    }
}