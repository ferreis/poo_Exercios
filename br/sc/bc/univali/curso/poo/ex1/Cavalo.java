package br.sc.bc.univali.curso.poo.ex1;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return this.nome+" faz: iiirrrrí, rilinchin";
    }

    @Override
    public String deve() {
        return this.fazer = "Correr";
    }
}
