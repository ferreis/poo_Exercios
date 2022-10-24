package br.sc.bc.univali.curso.poo.ex2;

public class CaminhaoAlfa extends Caminhao{
    int pesoTotal;
        public CaminhaoAlfa(int pesoTotal, int capacidadeTotal,String tipoCarga){
            super(pesoTotal = 500, capacidadeTotal ,tipoCarga);
        }

    @Override
    public void inserePluviomentro(Pluvimetro pluvimetro) {
        if (pluvimetro.peso <= peso) {
            pesoTotal += pluvimetro.peso;
            if (pesoTotal <= peso) {
                System.out.println("Tipo de Pluvimetro: "+pluvimetro.tipo+", "+pluvimetro.peso+" Kg, "+pluvimetro.capacidade+" Capacidade, Levando carga;");
                System.out.println("O caminhão peso Total "+pesoTotal);
            }else{
                System.out.println("Não levando carga pois ultrapassa o valor Maximos 500KG esta passando:"+(pesoTotal-500));
            }
        }
    }
}
