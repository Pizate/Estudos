public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2010;
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if(anoDeLancamento>2023){
            System.out.println("Lançamentos que os clientes estão curtindo!");


        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Gostaria de fazer um upgrade no seu plano agora?");
        }
    }
}
