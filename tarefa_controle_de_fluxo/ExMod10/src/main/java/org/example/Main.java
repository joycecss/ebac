package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo(a)");

        int numNotas = 0;
        double notas = 0;
        double media = 0;

        do{
            System.out.print("Digite uma nota: ");
            Scanner scanner = new Scanner(System.in);
            double nota = scanner.nextDouble();

            if(nota >= 0 && nota <= 10){
                numNotas++;
                notas = notas + nota;
            } else {
                System.out.println("Digite uma nota válida");
            }
        }while (numNotas < 4);

        media = notas / 4;

        if(media >= 7){
            System.out.println("A média é " + media + "\nAprovado");
        } else if(media >= 5 && media < 7) {
            System.out.println("A média é " + media + "\nRecuperação");
        } else {
            System.out.println("A média é " + media + "\nReprovado");
        }
    }
}