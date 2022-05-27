package wine;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        Linguagens lista = new Linguagens();

        Linguagem amosBasic = new Linguagem(1990, "AMOS Basic", "François Lionet", "STO Basic");
        Linguagem visualBasic = new Linguagem(1991, "Visual Basic", "Alan Cooper", "QuickBasic");
        Linguagem ruby = new Linguagem(1995, "Ruby", "Yukihiro Matsumoto", "SmallTalk;Pearl");
        Linguagem go = new Linguagem(2009, "Go", "Google", "C;Oberon;Limbo;SmallTalk");

        lista.adicionarLinguagem(amosBasic);
        lista.adicionarLinguagem(visualBasic);
        lista.adicionarLinguagem(ruby);
        lista.adicionarLinguagem(go);

        //System.out.println(lista.buscarPorDesenvolvedorChefe("François Lionet").getNome());
        //System.out.println(lista.buscarPorPredecessor("SmallTalk"));

    }
}

