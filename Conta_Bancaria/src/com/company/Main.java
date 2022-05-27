package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Banco banco;
        List<Cliente> clientesList = new ArrayList();

        Cliente cliente1;
        Conta conta1;

        cliente1 = new Cliente();
        conta1 = new Conta();
        banco = new Banco();

        cliente1.setNome("Lívia");
        cliente1.setCpf("1000");
        conta1.setSaldo(200);
        conta1.setNum(1);
        conta1.setCliente(cliente1);

        clientesList.add(cliente1);

        Cliente cliente2;
        Conta conta2;

        cliente2 = new Cliente();
        conta2 = new Conta();

        cliente2.setNome("Leo");
        cliente2.setCpf("2000");
        conta2.setSaldo(10000);
        conta2.setNum(2);
        conta2.setCliente(cliente2);

        for (Cliente c : clientesList) {
            if (c.getCpf() != cliente2.getCpf())
                continue;
            System.out.println("Não é possível cadastrar cliente, CPF já existente no nosso sistema");
            System.exit(0);
        }
        clientesList.add(cliente2);

        Cliente cliente3;
        Conta conta3;

        cliente3 = new Cliente();
        conta3 = new Conta();

        cliente3.setNome("Junior");
        cliente3.setCpf("3000");
        conta3.setSaldo(500);
        conta3.setNum(3);
        conta3.setCliente(cliente3);

        for (Cliente c : clientesList) {
            if (c.getCpf() != cliente3.getCpf())
                continue;
            System.out.println("Não é possível cadastrar cliente, CPF já existente no nosso sistema");
            System.exit(0);
        }

        clientesList.add(cliente3);

        for (Cliente c : clientesList) {
            System.out.println(c.getNome());
        }
    }
}







