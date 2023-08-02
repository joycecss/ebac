package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio Generico");

        Fiat fiat = new Fiat("FIAT", 53000.00, "Cinza", "SUV", 2023,"Pulse");
        fiat.getCarFiat();
        Chevrolet chevrolet = new Chevrolet("CHEVROLET", 83080.99, "Preto", "Sedan", 2022,"Cruze");
        chevrolet.getCarChevrolet();

        List<Car> carList = new ArrayList<>();
        carList.add(fiat);
        carList.add(chevrolet);

        System.out.println( "\n");

        System.out.println("Carros cadastrados na lista: \n" + carList);
    }
}