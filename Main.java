import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        //Exercicio 1
        Exercicio_1 ex1 = new Exercicio_1();

        //O valor é 78
        ex1.calcularExercicio1();

        //Exercicio 2
        Exercicio_2 ex2 = new Exercicio_2();

        String resposta = "s";

        while(resposta.equals("s")) {
            ex2.verificarSeNumeroFibonacci();

            System.out.println("Deseja inserir outro numero? (s/n)");
            resposta = ler.next();
        }

        //Exercicio 3

        //A) 9
        //B) 128
        //C) 49
        //D) 100
        //E) 13
        //F) 200


        //Exercicio 4

        // Ligo um dos interruptores e espero uns 10 minutos que deve ser tempo suficiente pra uma lampada esquentar,
        // após isso ligo outro interruptor e vou a uma das salas. Caso a luz esteja desligada, associo isso ao
        // interruptor que eu não liguei, caso esteja acesa, vejo se a lampada está quente, o que associaria ao
        // interruptor que liguei há 10 minutos atrás, caso esteja acesa, porém não esteja quente, associo ao segundo
        // interruptor que liguei. Nisso vou para uma segunda sala, faço a mesma verificação e mato a charada.


        //Exercicio 5
        Exercicio_5 ex5 = new Exercicio_5();

        ex5.inverterString();
    }
}
