package br.com.macintosh1998.classes;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula: " + titulo + ", Tempo: " + tempo;
    }

    @Override
    public int compareTo(Aula outrAula) {
        return this.titulo.compareTo(outrAula.titulo);
    }
}
