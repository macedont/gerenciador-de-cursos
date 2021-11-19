package br.com.macintosh1998.testes;

import br.com.macintosh1998.classes.Aluno;
import br.com.macintosh1998.classes.Aula;
import br.com.macintosh1998.classes.Curso;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AlunoTestClass {

    public static void main(String[] args) {
        Curso curso = new Curso("Javadoc", "macedo");

        curso.setAula(new Aula("inicializando com javadoc", 22));
        curso.setAula(new Aula("modelando coleções", 21));
        curso.setAula(new Aula("criando aula", 20));

        Aluno a1 = new Aluno("Marcelo Turin", 2125);
        Aluno a2 = new Aluno("Ana Frida", 2145);
        Aluno a3 = new Aluno("Luffy", 2166);

        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);

        Set<String> nomes = new HashSet<String>();
        nomes.add("oi");
        nomes.add("macedo");
        nomes.add("pal");
        nomes.add("mark");
        nomes.add("amark");
        Set<String> sincronia = Collections.synchronizedSet(nomes);
        System.out.println(sincronia);

        curso.getAlunos().forEach(System.out::println);
    }
}
