package br.com.macintosh1998.testes;

import java.util.*;

public class AlunoTest {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("macedo");
        alunos.add("chan");
        alunos.add("kun");
        alunos.add("arigato");
        alunos.add("arigato");


        /*for (String aux: alunos) {
            System.out.println(aux);
        }*/

        System.out.println(alunos.size());

        alunos.forEach(System.out::println);

        alunos.remove("arigato");
        System.out.println(alunos);

        List<String> alunosOrg = new ArrayList<>(alunos);
        Collections.sort(alunosOrg);
        alunosOrg.forEach(System.out::println);
        System.out.println(alunos.size());
    }
}
