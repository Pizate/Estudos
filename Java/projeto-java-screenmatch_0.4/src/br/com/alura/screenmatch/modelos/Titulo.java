//Pacotes
package br.com.alura.screenmatch.modelos;

public class Titulo {
    //Classes
    public String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos = 0;

    //Plano
    private boolean incluidoNoPlano;

    //Avaliações
    private double somaDasAvaliacoes = 0;
    private int totalDeAvaliacoes = 0;


    //Constructor


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // Gettters - Classes
    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    //Getter - Plano
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }


    //Getters - Avaliações
    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


    //Setters - Classes
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    // Setter - Plano
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    //void's
    public void exibeFichaTecnica(){ //metodo
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }
    //Void - Avaliações
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}












