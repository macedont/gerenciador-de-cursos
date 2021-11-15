package br.com.macintosh1998.testes;

import br.com.macintosh1998.classes.Aula;
import br.com.macintosh1998.classes.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CursoTeste {

    public static void main(String[] args) {
        Curso cursos = new Curso("Javadoc", "macedo");

        cursos.setAula(new Aula("inicializando com javadoc", 22));
        cursos.setAula(new Aula("modelando coleções", 21));
        cursos.setAula(new Aula("criando aula", 20));
        //cursos.getAulas().add(new Aula("teste", 21)); irá disparar um exception por causa do unmodifiableList utilizado no getAulas conceito de imutabilidade

        List<Aula> aulasImutaveis = cursos.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);
        System.out.println(cursos.getTempoTotal());
        System.out.println(cursos);
    }
}
