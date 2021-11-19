package br.com.macintosh1998.classes;

public class Aluno {

    private String nome;
    private int numMatricula;

    public Aluno(String nome, int numMatricula){
        this.nome = nome;
        this.numMatricula = numMatricula;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumMatricula(){
        return this.numMatricula;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome + " \nMatricula: " + this.numMatricula;
    }
}
