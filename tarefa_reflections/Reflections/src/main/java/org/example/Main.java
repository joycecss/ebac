package org.example;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        getAnnotacion();
    }

    private static void getAnnotacion(){
        Reflections reflections = new Reflections();
        Tabela annotationTable = reflections.getClass().getAnnotation(Tabela.class);
        System.out.println("Nome da tabela: " + annotationTable.value());
    }
}