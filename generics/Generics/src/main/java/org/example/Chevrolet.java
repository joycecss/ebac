package org.example;

public class Chevrolet extends Car {
    private String modelo;

    public Chevrolet(String marca, double value, String color, String category, int year, String modelo) {
        super(marca, value, color, category, year);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void getCarChevrolet(){
        System.out.println("Carro Cadastrado Chevrolet: " + this);
    }

    @Override
    public String toString() {
        return "Chevrolet{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", value=" + value +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                '}';
    }
}
