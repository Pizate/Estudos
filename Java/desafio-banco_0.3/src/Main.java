import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4-2 Primeira aplicação ALURA
        System.out.println("Seja bem vindo ao Xbank");
        Scanner leitura = new Scanner(System.in);
        double saldoInicial = 0;
        String tipoConta = "";
        System.out.println("Digite o seu nome completo:");
        String nomeCliente = leitura.nextLine();

        System.out.println("Para prosseguirmos é necessario que você escolha um tipo de conta bancaria.\n");
        System.out.println("1-Conta Corrente: É uma conta bancária usada para transações diárias, como depósitos,\n saques e pagamentos, com fácil acesso aos fundos, mas geralmente sem rendimento sobre o saldo.\n");
        System.out.println("2-Poupança: É uma conta bancária destinada a acumular economias, oferecendo rendimentos sobre o saldo,\ncom acesso mais limitado comparado à conta corrente.");
        System.out.println("Escolha entre as opções 1 e 2:");
        int opcoes = leitura.nextInt();

        if (opcoes == 1){
            tipoConta = "Conta Corrente";
            System.out.println("Tipo de conta escolhida: "+ tipoConta + "\n");
        } else if (opcoes == 2) {
            tipoConta = "Conta Poupança";
            System.out.println("Tipo de conta escolhida: "+ tipoConta + "\n");
        }else {
            System.out.println("Opção invalida!");
        }

        //string nomeCliente, tipoConta
    String dadosCliente;
    dadosCliente = "***********************\n" +
    "Dados iniciais do cliente:\n" +
    "Nome: " + nomeCliente + "\n" +
    "Conta: " + tipoConta + "\n" +
    "Saldo inicial: R$ " + saldoInicial + "\n" +
    "***********************\n";

    System.out.println(dadosCliente);

    }
}