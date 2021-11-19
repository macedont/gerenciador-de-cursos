package br.com.macintosh1998.testes;

import java.util.Collection;
import java.util.HashSet;

public class TestPerformaceHashset {

    public static void main(String[] args) {
        Collection<Integer> numeros = new HashSet<Integer>();


        for(int x = 0; x <= 50000; x++){
            numeros.add(x);
        }

        long inicio = System.currentTimeMillis();
        for (int y: numeros) {
            numeros.contains(y);
        }
        long fim = System.currentTimeMillis();

        long tempo = fim - inicio;
        System.out.println("O tempo de execução foi de: " + tempo + "s");
    }
}
