import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2 {

    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    private int index = 0;
    public void verificarSeNumeroFibonacci(){

        Scanner ler = new Scanner(System.in);
        System.out.println("EXERCICIO 2");

        if (index == 0){
            System.out.println("Insira um numero: ");
            numeros.add(ler.nextInt());
            System.out.println("Insira outro numero: ");
            numeros.add(ler.nextInt());
            index += 1;
        } else{

            int soma = numeros.get(index) + numeros.get(index - 1);
            System.out.println("Insira outro numero: ");
            int numero = ler.nextInt();

            if (numero == soma) {
                numeros.add(numero);
                System.out.println("Esse numero pertence a sequência de Fibonacci!");
                index += 1;
            } else{
                System.out.println("Esse numero NÃO pertence a sequência de Fibonacci");
            }

        }

    }
}
