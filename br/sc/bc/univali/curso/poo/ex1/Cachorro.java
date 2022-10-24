package br.sc.bc.univali.curso.poo.ex1;

public final class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return this.nome+" faz: au au";
    }

    @Override
    public String deve() {
       return this.fazer = "Correr";
    }
}
