package br.com.macintosh1998;

import java.util.ArrayList;
import java.util.Collections;

public class TestListas {

    public static void main(String[] args) {
        String aula1 = "Listas";
        String aula2 = "Modelando classe aula";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
//        aulas.remove(1);

        System.out.println(aulas);

        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        aulas.forEach(aula -> {
            System.out.println("percorrendo aula: " + aula);
        });

        aulas.add("Aumentando o nosso conhecimento");

        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
