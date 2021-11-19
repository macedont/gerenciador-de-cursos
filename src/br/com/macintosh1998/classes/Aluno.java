package br.com.macintosh1998.classes;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int numMatricula;

    public Aluno(String nome, int numMatricula){
        if(nome == null)
            throw new NullPointerException("nome não pode ser null");
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

    @Override
    public boolean equals(Object obj) {
        Aluno a = (Aluno) obj;

        return this.nome.contains(a.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
