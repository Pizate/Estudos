package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefinho", 2017); // Tipo Referencia
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(10);
        var filmeTeste = new Filme("Teste",2003); //Constructor
        filmeTeste.avalia(1);
        Serie lost = new Serie("Lost",2004);

        Filme f1 = filmeTeste;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeTeste);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Teste");
        buscaPorArtista.add("Fernanda Montenegro");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Lista de artistas ordenados: ");
        System.out.println(buscaPorArtista);
        Collections.sort(lista);
        System.out.println(lista);

    }
}
