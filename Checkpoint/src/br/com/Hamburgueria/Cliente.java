package br.com.Hamburgueria;

public class Cliente {

    private String nome;

    private String numeroTelefone;

    private String endereco;

public Cliente(String nome, String numeroTelefone, String endereco) {

    this . nome = nome;
    this . numeroTelefone = numeroTelefone;
    this . endereco = endereco;

    }

public String getNome() {

    return nome;
}

public String getNumeroTelefone() {

    return numeroTelefone;
}

public String getEndereco() {

    return endereco;
}

public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
