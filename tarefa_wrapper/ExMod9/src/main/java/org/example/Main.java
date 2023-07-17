package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int num = scanner.nextInt();

        Integer numWrapper = num;
        System.out.println("Número após wrapper:" + numWrapper);
    }
}