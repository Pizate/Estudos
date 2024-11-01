import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Tipo Referencia
        meuFilme.setNome("O Poderoso Chefinho");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(107);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setEpisodiosPorTemporada(16);
        lost.setTemporadas(6);
        lost.exibeFichaTecnica();
    }
}
