package com.company;

public class Main {
    public static void main(String[] args) {
        Pessoa Lily = new Pessoa("Lily");
        Lily.conjuge(new Pessoa("Wilhelm"));

        // Patriarcas
        Pessoa Opa = new Pessoa("Opa", Lily);
        Opa.conjuge(new Pessoa("Oma"));

        // Filhos de Oma e Opa
        Pessoa Reinhold = new Pessoa("Reinhold", Opa);
        Pessoa Wilma = new Pessoa("Wilma", Opa);
        Pessoa Sigrid = new Pessoa("Sigrid", Opa);

        // Filhos e esposa de Reinhold
        Reinhold.conjuge(new Pessoa("Sonia"));
        Pessoa Christian = new Pessoa("Christian", Reinhold);
        Pessoa Gabrielle = new Pessoa("Gabrielle", Reinhold);
        Pessoa Sabine = new Pessoa("Sabine", Reinhold);

        // Filhos e marido de Wilma
        Wilma.conjuge(new Pessoa("Rodolfo"));
        Pessoa Ricardo = new Pessoa("Ricardo", Wilma);
        Pessoa Rodrigo = new Pessoa("Rodrigo", Wilma);

        // Ricardo e esposa
        Ricardo.conjuge(new Pessoa("Debora"));

        // Filhos e esposa de Christian
        Christian.conjuge(new Pessoa("Mônica"));
        Pessoa Oscar = new Pessoa("Oscar", Christian);
        Pessoa Lorena = new Pessoa("Lorena", Christian);

        // Filhos e marido Sigrid
        Sigrid.conjuge(new Pessoa("Peter"));
        Pessoa Martin = new Pessoa("Martin", Sigrid);
        Pessoa Thomas = new Pessoa("Thomas", Sigrid);
        Pessoa Claudia = new Pessoa("Claudia", Sigrid);
        Martin.conjuge(new Pessoa("Carla"));
        Martin.adicionarFilho(new Pessoa("Nicolas"));

        Lily.imprimeArvore(0);
    }
}
