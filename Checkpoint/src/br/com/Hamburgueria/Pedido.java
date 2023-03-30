package br.com.Hamburgueria;

public class Pedido {

    private Long idPedido;

    private Cliente cliente;

    private Burguer[] burguersPedido;


public Pedido(Long idPedido, Cliente cliente, Burguer[] burguersPedido){

    this . idPedido = idPedido;
    this. cliente = cliente;
    this . burguersPedido = burguersPedido;

}

public Double valorTotal(){

    Double valorTotal = 0.0;

    for (Burguer burguer:this.burguersPedido){

        valorTotal += burguer.preco();
    }

  Double taxaDeEntrega = 10.0;

    return valorTotal + taxaDeEntrega;
}

}
