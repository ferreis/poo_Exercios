package br.sc.bc.univali.curso.poo.ex2;

public class Pluvimetro {
    String tipo;
    int peso;
    int capacidade;

    public  Pluvimetro(String tipo, int peso, int capacidade){
        this.tipo = tipo;
        this.peso = peso;
        this.capacidade = capacidade;
    }

    public int getPeso(){
        return peso;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public String getTipo(){
        return tipo;
    }
}
