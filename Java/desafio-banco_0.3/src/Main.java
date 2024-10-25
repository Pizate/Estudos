import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*4-2 Primeira aplicação ALURA
        ---Inicializar dados do cliente
        ---Menu de opções
        Visualização do saldo
        Enviar valor
        Receber valor
        teste*/
        Scanner leitura = new Scanner(System.in);
        double saldoConta = 0;
        String tipoConta = "";


        System.out.println("Seja bem vindo ao Xbank");

        System.out.println("Digite o seu nome completo:");
        String nomeCliente = leitura.nextLine();

        System.out.println("Para prosseguirmos é necessario que você escolha um tipo de conta bancaria.\n");
        System.out.println("1-Conta Corrente\n");
        System.out.println("2-Poupança");
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
                    return;
                }
        System.out.println("Digite o saldo iniciail:");
        saldoConta = leitura.nextDouble();

        //string nomeCliente, tipoConta
        String dadosCliente;
        dadosCliente = "***********************\n" +
                "Dados iniciais do cliente:\n" +
                "Nome: " + nomeCliente + "\n" +
                "Conta: " + tipoConta + "\n" +
                "Saldo inicial: R$ " + saldoConta + "\n" +
                "***********************\n";
        System.out.println(dadosCliente);



        boolean continuar = true;
        while (continuar){
            String menuOpcoes;
                    menuOpcoes = "***********************\n" +
                    "1- Consultar saldos\n" +
                    "2- Receber valor\n" +
                    "3- Transferir valor\n" +
                    "4- Sair\n" +
                    "Digite a opção desejada:";
            System.out.println(menuOpcoes);
            int op = leitura.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Seu saldo atual e de: R$ " + saldoConta);
                    break;
                case 2:
                    double valorReceber = 0;
                    System.out.println("Informe o valor a receber: ");
                    valorReceber = leitura.nextDouble();
                    saldoConta += valorReceber;
                    System.out.println("Saldo atualizado: R$ " + saldoConta);
                    break;
                case 3:
                    double valorTranferir=0;
                    System.out.println("Informe o valor que deseja transferir:");
                    valorTranferir = leitura.nextDouble();
                    if (saldoConta<valorTranferir){
                        System.out.println("Saldo atual é menor que a quantia de transferencia, deposite um valor maior e tente novamente.");
                    } else {
                        saldoConta -= valorTranferir;
                        System.out.println("Saldo atualizado: R$ " + saldoConta);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar o XBank!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;


            }
        }

    }
}