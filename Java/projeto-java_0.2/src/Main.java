public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Tron o Legado");

        int anoDeLancamento = 2010;
        System.out.println("Ano de Lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println(notaDoFilme);
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        //sem media
        String sinopse;
        sinopse = """
                Kevin e Sam procuram escapar de um universo que, 
                embora magnífico, 
                é muito mais avançado e perigoso do que Kevin tinha imaginado
                """;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}