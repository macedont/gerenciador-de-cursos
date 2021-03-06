package br.com.macintosh1998.classes;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> aluno = new LinkedHashSet<Aluno>();
    private Map<Integer, Aluno> matriculaAluno = new LinkedHashMap<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setAula(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso: " + this.nome + "\ninstrutor: " + this.instrutor + "\nnum Aulas: " + getAulas().size() + "\ntempo total: " + getTempoTotal();
    }

    public void matricula(Aluno aluno){
        this.aluno.add(aluno);
        this.matriculaAluno.put(aluno.getNumMatricula(), aluno);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(this.aluno);
    }

    public boolean alunoEstaMatriculado(Aluno aluno){
        return this.aluno.contains(aluno);
    }

    public Aluno getAlunoMatricula(int numero) {
        if(!matriculaAluno.containsKey(numero))
            throw new NoSuchElementException("não existe esse aluno com essa matricula");
        return matriculaAluno.get(numero);
    }
}
