//Pacotes
package br.com.alura.screenmatch.modelos;

//Importações
import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //Classes
    private String diretor;

    //Getters
    public String getDiretor() {
        return diretor;
    }

    //Setters
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //Override - Classificação
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
