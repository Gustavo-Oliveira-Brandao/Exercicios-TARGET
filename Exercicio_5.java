import java.util.Scanner;

public class Exercicio_5 {

    public void inverterString(){
        Scanner ler = new Scanner(System.in);

        System.out.println("EXERCICIO 5");

        System.out.println("Insira uma palavra");
        String palavra = ler.next();
        String palavraReverse = "";

        String[] caracteres = palavra.split("");

        int indice = caracteres.length;

        for(int i = 0; i< caracteres.length; i++){
            palavraReverse += caracteres[indice - 1];
            indice -= 1;
            System.out.println(palavraReverse);
        }
    }
}
