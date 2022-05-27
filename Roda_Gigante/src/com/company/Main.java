package com.company;

public class Main {

    public static void main(String[] args) {

        RodaGigante roda = new RodaGigante(); // Criando nova roda gigante
        Adulto paulo = new Adulto("Paulo", 42); // Adulto com o nome Paulo
        // Filhos do Paulo
        Crianca joao = new Crianca("Joao", 5, paulo); // Nova criança cujo pai é Paulo
        Crianca maria = new Crianca("Maria", 12, paulo); // Esta é a filha do Paulo
        // Crianca sem pai definido
        Crianca pedro = new Crianca("Pedro", 13);
        Crianca henrique = new Crianca("Henrique", 10);
        /*
         * Agora vem a parte divertida. Foi criada uma regra no parque:
         * - Crianças menores de 12 anos só podem andar acompanhadas do pai!
         *
         */
        roda.embarcar(2, joao, maria); // ERRO: João é menor de 12 e o pai não está junto
        roda.embarcar(2, joao, paulo); // OK: Agora o pai está junto
        roda.embarcar(3, maria); // OK: Maria já tem 12 anos e pode andar sozinha
        roda.embarcar(13, pedro); // OK: O Pedro vai sozinho
        roda.embarcar(16, henrique);//ERRO: henrique é menor de 12 anos e não sabemos quem
        // é o pai (deve ser o Silvio, mas ele não assumiu!)
        roda.status();
        /*
         * Deve imprimir:
         *
         * Gôndola Status
         * ------- -----------------------
         * 1 João e Paulo
         * 2 Somente Maria
         * 3 Somente Pedro
         */
    }
}
