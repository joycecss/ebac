package org.example;

public class CalculoMedia {
    public static void main(String[] args) {
        calcularMedia();
    }

    public static void calcularMedia(){
        double nota1 = 5.5;
        double nota2 = 7.8;
        double nota3 = 0.6;
        double nota4 = 3.4;

        double somaNota = nota1 + nota2 + nota3 + nota4;
        double media = somaNota / 4;

        System.out.println("A média é: " + media);
    }
}