import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();


        System.out.println("Digite o ano de lançamento:");
        int anoDeLancamento = leitura.nextInt();


        System.out.println("Diga sua avaliaão para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Dados do Filme escolhido: ");
        System.out.println("Nome: " + filme);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avaliacao);

    }
}

