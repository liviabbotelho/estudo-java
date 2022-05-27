package wine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Linguagens {

    private List<Linguagem> listLinguagens;
    //private Stream<Linguagem> stream = listLinguagens.stream();

    public Linguagens() {
        this.listLinguagens= new ArrayList<>();
    }

    public void adicionarLinguagem(Linguagem l) {
        listLinguagens.add(l);
    } //adiciona um linguagem à lista de linguagens

    public void removerLinguagem(Linguagem l) {
        listLinguagens.remove(l);
    } //remove uma linguagem da lista de linguagens

    public Linguagem buscarLinguagemPorNome(String nome) {
        return listLinguagens.stream()
                .filter(x -> x.getNome().startsWith(nome))
                .findFirst()
                .orElse(null);
    } //busca uma linguagem pelo nome utilizando o método startsWith() da String como método de comparação

    public Linguagem buscarPorAno(int ano) {
        return listLinguagens.stream()
                .filter(x -> x.getAno()==ano)
                .findFirst()
                .orElse(null);
    } //busca uma linguagem pelo ano de criação utilizando o operador de igualdade como método de comparação

    public Linguagem buscarPorDesenvolvedorChefe(String nomeDesenvolvedorChefe) {
        return listLinguagens.stream()
                .filter(x -> x.getDesenvolvedorChefe().contains(nomeDesenvolvedorChefe))
                .findFirst()
                .orElse(null);
    } //busca uma linguagem pelo nome do desenvolvedor chefe utilizando o método contains() da String como método de comparação

    public List<Linguagem> buscarPorPredecessor(String nomePredecessor) {
        return listLinguagens.stream()
                .filter(x -> x.getPredecessores().contains(nomePredecessor))
                .collect(Collectors.toList());
    } //busca uma linguagem pelo nome de um predecessor utilizando o método contains() da String como método de comparação

    public void imprimirLinguagens() {
        listLinguagens.stream().forEach(x -> System.out.println(x.toString()));
    } //imprime na tela todas as linguagens cadastradas em JSON
}
