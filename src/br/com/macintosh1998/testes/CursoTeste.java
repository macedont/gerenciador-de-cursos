package br.com.macintosh1998.testes;

import br.com.macintosh1998.classes.Aula;
import br.com.macintosh1998.classes.Curso;

public class CursoTeste {

    public static void main(String[] args) {
        Curso cursos = new Curso("Javadoc", "macedo");

        cursos.setAula(new Aula("inicializando com javadoc", 22));
        cursos.setAula(new Aula("modelando coleções", 21));
        cursos.setAula(new Aula("criando aula", 20));

        System.out.println(cursos.getAulas().get(2));

    }
}
