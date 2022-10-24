package br.sc.bc.univali.curso.poo.ex1;

public class Preguica extends Animal{
    public Preguica(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return this.nome+ "faz: ÁAa ÁAa";
    }

    @Override
    public String deve() {
        return this.fazer = "Escalar";
    }
}
