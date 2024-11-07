//Pacotes
package br.com.alura.screenmatch.calculos;

//Importações
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    //Classes
    private int tempoTotal = 0;

    //Getters
    public int getTempoTotal() {
        return this.tempoTotal;
    }
    /*    public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }*/

    //Void's
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
