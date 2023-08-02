package org.example;

public abstract class Car {

    protected String marca;
    protected double value;
    protected String color;
    protected String category;
    protected int year;

    public Car(String marca, double value, String color, String category, int year) {
        this.marca = marca;
        this.value = value;
        this.color = color;
        this.category = category;
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
