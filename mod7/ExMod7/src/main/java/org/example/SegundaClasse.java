package org.example;

/**
 * @author joyce.silva
 */
public class SegundaClasse {
    public static void main(String[] args) {
        System.out.println("Informações Xicara");

        Xicara xicara = new Xicara();

        xicara.cadastrarPreco(22.89);
        xicara.mostrarPreco();

        String cor = xicara.mostrarCor();
        System.out.println(cor);
    }
}