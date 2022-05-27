package com.company;

import java.util.ArrayList;

public class RodaGigante {
    ArrayList<Gondola> listGondolas = new ArrayList();

    public void embarcar(int numero, Pessoa pessoa1, Pessoa pessoa2) {

        if (pessoa1.getIdade() < 12) {

            if (pessoa2 instanceof Adulto) {
                System.out.println(" OK: " + pessoa1.getNome() + " é menor de 12 anos porém está acompanhada de um responsável");
            } else {
                System.out.println("ERRO: " + pessoa1.getNome() + " é menor de 12 e não está com um responsável");
                return;
            }
        }
        if (pessoa2.getIdade() < 12) {
            if (pessoa1 instanceof Adulto) {
                System.out.println(" OK: " + pessoa2.getNome() + " é menor de 12 anos porém está acompanhada de um responsável");
            } else {
                System.out.println("ERRO: " + pessoa2.getNome() + " é menor de 12 e não está acompanhado de um responsável");
                return;
            }
        }

        if (pessoa1.getIdade() >= 12 && pessoa2.getIdade() >= 12) {
            System.out.println(" OK: Ambos são maiores de 12 anos");
        }

        Gondola g = new Gondola(numero, pessoa1, pessoa2);
        adicionaGondola(g);
    }

    // Método auxiliar de embarcar, adiciona a gondola na próxima posição vazia
    private void adicionaGondola(Gondola gondola) {
        int i = 0;

        if (listGondolas.size() == 0) {
            listGondolas.add(gondola);
        } else {
            for (; i < listGondolas.size(); i++) {
                if (listGondolas.get(i) == null)
                    break;
            }
            listGondolas.add(i, gondola);
        }
    }

    public void embarcar(int numero, Pessoa pessoa) {

        if (pessoa.getIdade() < 12) {
            System.out.println("ERRO: " + pessoa.getNome() + " é menor de 12 e o pai não está junto");
            return;
        } else {
            System.out.println(" OK: " + pessoa.getNome() + " tem 12 anos ou mais então pode ir sozinho(a)");
        }
        Gondola g = new Gondola(numero, pessoa);
        adicionaGondola(g);
    }

    public void status() {

        System.out.println("* Gôndola Status\n");
        for (int i = 0; i < listGondolas.size(); i++) {
            int count = i + 1;
            System.out.println("* " + count);

            // Gandola vazia
            if (listGondolas.get(i) == null) {
                System.out.println("(vazia)");
            } else {
                // Apenas o segundo assento ocupado
                if (listGondolas.get(i).getAssento1() == null) {
                    System.out.println("Somente " + listGondolas.get(i).getAssento2().getNome());
                }
                // Apenas o primeiro assento ocupado
                else if (listGondolas.get(i).getAssento2() == null) {
                    System.out.println("Somente " + listGondolas.get(i).getAssento1().getNome());
                }
                // Ambos ocupados
                else {
                    System.out.println(listGondolas.get(i).getAssento1().getNome() + " e " + listGondolas.get(i).getAssento2().getNome());
                }
            }
        }
    }
}
