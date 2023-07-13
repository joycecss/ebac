package org.example;

public class Xicara {
    private String marca;
    private int capacidade;
    private String cor;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     *
     * @param preco
     */
    public void cadastrarPreco(double preco) {
        setPreco(preco);
    }

    public void mostrarPreco() {
        System.out.println(this.preco);
    }

    /**
     *
     * @return cor da xicara
     */
    public String mostrarCor(){
        return "Vermelha";
    }
}
