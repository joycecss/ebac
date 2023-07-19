package org.example;

public class Pessoa {

    private String nome;
    private String genero;

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public boolean compareGenero(String genero){
        return this.genero.equals(genero);
    }
}
