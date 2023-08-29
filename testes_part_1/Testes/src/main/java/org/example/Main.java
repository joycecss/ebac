package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite nome e o sexo usando a travessão para separar e virgula para adicionar uma nova pessoa(Exemplo: alex-m,carla-f)");
        Scanner scanner = new Scanner(System.in);
        String peoples = scanner.nextLine();

        String[] separatePeoples = peoples.split(",");

        Stream<String> womenStream = Arrays.stream(separatePeoples)
                .filter(people -> {
                    var peopleFormatted = people.toLowerCase().toCharArray();
                    return peopleFormatted[peopleFormatted.length-1] == 'f';
                });

        womenStream.forEach(System.out::println);
    }
}