package br.com.Hamburgueria;

public class Ingrediente {
    private String nome;

    private Double custo;

    public Ingrediente (String nome, Double custo){

        this. nome = nome;
        this. custo = custo;
    }

    public String getNome(){
        return nome;
    }

    public Double getCusto (){
        return custo;
    }
}
