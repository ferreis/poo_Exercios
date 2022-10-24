package br.sc.bc.univali.curso.poo.ex2;

public class CaminhaoBeta extends Caminhao{
    int pesoTotal;
    public CaminhaoBeta(int pesoTotal, int capacidadeTotal,String tipoCarga){
        super(pesoTotal = 500, capacidadeTotal ,tipoCarga);
    }
    @Override
    public void inserePluviomentro(Pluvimetro pluvimetro) {
        if (pluvimetro.tipo == this.tipoCarga) {
            pesoTotal += pluvimetro.peso;
            System.out.println("Tipo de Pluvimetro: "+pluvimetro.tipo+", "+pluvimetro.peso+" Kg, "+pluvimetro.capacidade+" Capacidade, Levando carga;");
            System.out.println("O caminhão peso Total "+pesoTotal);
        }
    }
}
