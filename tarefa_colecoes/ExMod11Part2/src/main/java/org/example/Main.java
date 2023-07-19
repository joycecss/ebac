package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Pessoa> generoMasc =  new HashSet<>();
        Set<Pessoa> generoFem =  new HashSet<>();
        List<String> listPessoas = new ArrayList<String>();

        System.out.println("Digite nome e o sexo usando a travessão para separar e virgula para adicionar uma nova pessoa(Exemplo: alex-m,carla-f)");
        Scanner scanner = new Scanner(System.in);
        String pessoas = scanner.nextLine();

        String[] pessoasSeparadas = pessoas.split(",");
        Collections.addAll(listPessoas, pessoasSeparadas);

        for (String listPessoa : listPessoas) {
            String[] nomeSexo = listPessoa.split("-");
            Pessoa pessoa = new Pessoa(nomeSexo[0], nomeSexo[1]);
            if (pessoa.compareGenero("m")) {
                generoMasc.add(pessoa);
            } else {
                generoFem.add(pessoa);
            }
        }

        System.out.println("Pessoas do Sexo masculino: ");
        System.out.println(generoMasc);

        System.out.println("Pessoas do Sexo feminino: ");
        System.out.println(generoFem);
    }
}