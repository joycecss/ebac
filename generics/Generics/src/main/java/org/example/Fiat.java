package org.example;

public class Fiat extends Car {
    private String modelo;

    public Fiat(String marca, double value, String color, String category, int year, String modelo) {
        super(marca, value, color, category, year);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void getCarFiat(){
       System.out.println("Carro Cadastrado Fiat: " + this);
    }

    @Override
    public String toString() {
        return "Fiat{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", value=" + value +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                '}';
    }
}
