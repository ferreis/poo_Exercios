import br.sc.bc.univali.curso.poo.ex1.*;
import br.sc.bc.univali.curso.poo.ex2.CaminhaoBeta;
import br.sc.bc.univali.curso.poo.ex2.Caminhao;
import br.sc.bc.univali.curso.poo.ex2.CaminhaoAlfa;
import br.sc.bc.univali.curso.poo.ex2.Pluvimetro;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nExercio 1:\n");
        Animal[] zoologico = new Animal[10];
        zoologico[0] = new Cachorro("toco", 10);
        zoologico[1] = new Cavalo("Pé De Pano", 20);
        zoologico[2] = new Preguica("A Velocidade", 20);
        Veterinario funcionario = new Veterinario();

        for (Animal animal:zoologico){
            if (animal!=null){
                funcionario.examinar(animal);
                if ("Correr".equals(animal.deve()))
                System.out.println(animal.deve());
            }
        }
        System.out.println("\nExercio 2:\n");
        Pluvimetro[] pluv = new Pluvimetro[5];
        pluv[0] = new Pluvimetro("A", 100,200);
        pluv[1] = new Pluvimetro("A", 300,150);
        pluv[2] = new Pluvimetro("B", 50,50);
        pluv[3] = new Pluvimetro("C", 500,400);
        pluv[4] = new Pluvimetro("B", 10,400);

        Caminhao carroAlfa = new CaminhaoAlfa(500, 220,"A");
        Caminhao carroBeta = new CaminhaoBeta(500,500, "A");
        Caminhao carroPai = new Caminhao(700, 500,"ABC");

        System.out.println("Caminhão Pai:");
        for (Pluvimetro pluvimetro:pluv ) {
            carroPai.inserePluviomentro(pluvimetro);
        }
        System.out.println("\n");

        System.out.println("Caminhão Alfa:");
        for (Pluvimetro pluvimetro:pluv ) {
            carroAlfa.inserePluviomentro(pluvimetro);
        }
        System.out.println("\n");

        System.out.println("Caminhão Beta:");
        for (Pluvimetro pluvimetro:pluv ) {
            carroBeta.inserePluviomentro(pluvimetro);

        }
        System.out.println("\n");
    }
}