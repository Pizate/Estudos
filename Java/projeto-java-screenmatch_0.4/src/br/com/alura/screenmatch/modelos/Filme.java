//Pacotes
package br.com.alura.screenmatch.modelos;

//Importações
import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //Classes
    private String diretor;

    //Constructor
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
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

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + getAnoDeLancamento() + ")";
    }
}
