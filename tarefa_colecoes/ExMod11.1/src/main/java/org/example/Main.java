package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> listNomes = new ArrayList<String>();

        System.out.println("Digite nomes usando a virgula para separar (Exemplo: alex,bruna,caio)");
        Scanner scanner = new Scanner(System.in);
        String nomes = scanner.nextLine();

        String[] nomesSeparados = nomes.split(",");

        for (int i = 0; i < nomesSeparados.length; i++) {
            listNomes.add(nomesSeparados[i]);
        }

        Collections.sort(listNomes);

        System.out.println(listNomes);
    }
}