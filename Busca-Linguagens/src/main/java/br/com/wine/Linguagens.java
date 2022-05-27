package br.com.wine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Linguagens {

    private List<Linguagem> listLinguagens;

    public Linguagens() {
        this.listLinguagens = new ArrayList<>();
    }

    public void adicionarLinguagem(Linguagem l) {
        listLinguagens.add(l);
    } //adiciona um linguagem à lista de linguagens

    public void removerLinguagem(Linguagem l) {
        listLinguagens.remove(l);
    } //remove uma linguagem da lista de linguagens

    public Linguagem buscarLinguagemPorNome(String nome) {
        for (Linguagem l : listLinguagens) {
            if (l.getNome().startsWith(nome)) {
                return l;
            }
        }
        return null;
    } //busca uma linguagem pelo nome utilizando o método startsWith() da String como método de comparação

    public Linguagem buscarPorAno(int ano) {
        for (Linguagem l : listLinguagens) {
            if (l.getAno() == ano)
                return l;
        }
        return null;
    } //busca uma linguagem pelo ano de criação utilizando o operador de igualdade como método de comparação

    public Linguagem buscarPorDesenvolvedorChefe(String nomeDesenvolvedorChefe) {
        for (Linguagem l : listLinguagens) {
            if (l.getDesenvolvedorChefe().contains(nomeDesenvolvedorChefe))
                return l;
        }
        return null;
    } //busca uma linguagem pelo nome do desenvolvedor chefe utilizando o método contains() da String como método de comparação

    public List<Linguagem> buscarPorPredecessor(String nomePredecessor) {
        List<Linguagem> lista = new ArrayList<>();
        for (Linguagem l : listLinguagens) {
            if (l.getPredecessores().contains(nomePredecessor)) {
                lista.add(l);
            }
        }
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    } //busca uma linguagem pelo nome de um predecessor utilizando o método contains() da String como método de comparação

    public void imprimirLinguagens() {
        for (Linguagem l : listLinguagens) {
            System.out.println(l.toString());
        }
    } //imprime na tela todas as linguagens cadastradas em JSON
}
