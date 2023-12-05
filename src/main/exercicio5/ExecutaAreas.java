package main.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class ExecutaAreas {
    public static void main(String[] args) {


        List<Area> areas = new ArrayList<>();
        areas.add(new Circulo(2.0));
        areas.add(new Triangulo(2,4));
        areas.add(new Retangulo(2,4));
        System.out.println(areas);
        var elemento1 = areas.get(2).calculaArea();
        System.out.println(elemento1);



    }
}