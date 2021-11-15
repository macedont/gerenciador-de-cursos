package br.com.macintosh1998.testes;

import br.com.macintosh1998.classes.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Arraylist", 22);
        Aula a2 = new Aula("Lista de Referencia", 18);
        Aula a3 = new Aula("Relacionamento com listas de objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        Collections.sort(aulas);

        for (Aula aux: aulas) {
            System.out.println("Titulo: " + aux.getTitulo() + "\nTempo: " + aux.getTempo());
        }

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        for (Aula aux: aulas) {
            System.out.println("Titulo: " + aux.getTitulo() + "\nTempo: " + aux.getTempo());
        }
    }
}
