public class Principal {
    public static void main(String[] args) {
       Filme meuFilme = new Filme(); // Tipo Referencia
        meuFilme.nome = "O Poderoso Chefinho";
        meuFilme.anoDeLancamento = 2017;
        meuFilme.duracaoEmMinutos = 107;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);

    }
}
