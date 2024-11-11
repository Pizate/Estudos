package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefinho", 2017); // Tipo Referencia
        Filme outroFilme = new Filme("Avatar",2023);
        var filmeTeste = new Filme("Teste",2003); //Constructor
        Serie lost = new Serie("Lost",2004);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeTeste);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item);
        }

    }
}
