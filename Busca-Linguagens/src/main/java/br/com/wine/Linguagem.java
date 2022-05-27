package br.com.wine;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Linguagem {
    private int ano;
    private String nome;
    private String desenvolvedorChefe;
    private String predecessores;

    public Linguagem(int ano, String nome, String desenvolvedorChefe, String predecessores) {
        this.ano = ano;
        this.nome = nome;
        this.desenvolvedorChefe = desenvolvedorChefe;
        this.predecessores = predecessores;
    }

    public int getAno() {
        return ano;
    }

    public String getDesenvolvedorChefe() {
        return desenvolvedorChefe;
    }

    public String getPredecessores() {
        return predecessores;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
