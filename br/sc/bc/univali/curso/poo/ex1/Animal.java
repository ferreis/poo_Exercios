package br.sc.bc.univali.curso.poo.ex1;

public abstract class Animal {
    String nome;
    int idade;
    String fazer;
    public Animal(String nome, int idade){this.nome = nome; this.idade = idade;}
    public abstract String emitirSom();
    public abstract String deve();
}
