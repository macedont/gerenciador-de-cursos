package br.com.macintosh1998.testes;

import br.com.macintosh1998.classes.Aluno;
import br.com.macintosh1998.classes.Aula;
import br.com.macintosh1998.classes.Curso;

public class TestBuscaAlunos {

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


        System.out.println("Quem é o aluno 2145?");
        Aluno aluno = curso.getAlunoMatricula(211);
        System.out.println(aluno);
    }
}
