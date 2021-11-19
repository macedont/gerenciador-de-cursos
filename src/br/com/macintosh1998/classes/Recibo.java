package br.com.macintosh1998.classes;

public class Recibo {

    private int numero;
    private double valor;


    public Recibo(int numero, double valor){
        this.numero = numero;
        this.valor = valor;
    }

    public int getNumero(){
        return this.numero;
    }

    public double getValor(){
        return this.valor;
    }

    @Override
    public String toString() {
        return "Recibo{" +
                "numero=" + numero +
                ", valor=" + valor +
                '}';
    }
}
