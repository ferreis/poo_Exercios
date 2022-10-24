package br.sc.bc.univali.curso.poo.ex2;

public class Caminhao {
    int peso;
    private int capacidadeTotal;
    public int capacidadeUsada;
    String tipoCarga;

    public Caminhao(int peso, int capacidadeTotal, String tipoCarga){
        this.peso = peso;
        this.tipoCarga = tipoCarga;
        this.capacidadeTotal = capacidadeTotal;
    }
    public void inserePluviomentro(Pluvimetro pluvimetro){
        capacidadeUsada+=pluvimetro.capacidade;
        if (capacidadeTotal >= capacidadeUsada){
            System.out.println("Capacidade usada: "+capacidadeUsada);
            System.out.println("Tipo de Pluvimetro: "+pluvimetro.tipo+", "+pluvimetro.peso+" Kg, "+pluvimetro.capacidade+" Capacidade, Levando carga;");
        }
    }
}
