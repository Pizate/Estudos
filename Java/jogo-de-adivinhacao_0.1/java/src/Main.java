import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leitura = new Scanner(System.in);

        String introducao;
        int tentativas = 1,maxTentativas = 8;
        int numeroAleatorio = random.nextInt(100);
        introducao = """
                ---Bem vindo ao jogo de Adivinhação---
                ---------Você está preparado?---------
                Escolha um numero entre 0 a 100: """;

        System.out.println(introducao);

        System.out.println("O numero aleatorio é: "+numeroAleatorio);

        for (int i = 0; i <maxTentativas; i++) {
            int numeroEscolhido = leitura.nextInt();
            if (tentativas<maxTentativas) {
                    System.out.println("--------------------------------------\n");
                    if (numeroAleatorio>numeroEscolhido){
                    System.out.println("Dica: Tente um numero MAIOR");
                    }
                    else if (numeroAleatorio<numeroEscolhido){
                    System.out.println("Dica: Tente um numero MENOR");
                    }
                    else {
                    System.out.println("Parabens você descobriu que o número aleatorio com: " + tentativas + " tentativas");
                    break;
                    }
                System.out.println("Voce ainda possui (" + (maxTentativas - tentativas) + ") tentativas");
                tentativas++;
                System.out.println("-------Vamos tentar novamente?--------\nEscolha um número entre 0 a 100:");
            }
            else{
                System.out.println("\nSinto muito, você não possui mais tentativas");
            }
        }






    }

}