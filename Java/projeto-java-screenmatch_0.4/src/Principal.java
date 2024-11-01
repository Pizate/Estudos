public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Tipo Referencia
        meuFilme.nome = "O Poderoso Chefinho";
        meuFilme.anoDeLancamento = 2017;
        meuFilme.duracaoEmMinutos = 107;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

    }
}
