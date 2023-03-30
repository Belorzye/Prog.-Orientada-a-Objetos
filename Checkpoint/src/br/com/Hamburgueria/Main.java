package br.com.Hamburgueria;

public class Main {

    public static void main(String[] args) {

        Ingrediente cheddar = new Ingrediente("Cheddar", 5.0);
        Ingrediente onionRings = new Ingrediente("Onion Rings", 4.50);
        Ingrediente alface = new Ingrediente("Alface", 3.50);
        Ingrediente picles = new Ingrediente("Picles", 4.0);
    }

    Ingrediente[] ingredientesTradicional = new Ingrediente[4];

    IngredientesTradicional[0] = cheddar;
    IngredientesTradicional[1] = onionRings;
    IngredientesTradicional[2] = alface;
    IngredientesTradicional[3] = picles;

    Burguer burguerTradicional = new Burguer(1,"Tradicional",ingredientesTradicional);

     System.out.println("Tradicional" + tradicional.getNome());
     System.out.println("preco:" + tradicional.preco());
     tradicional.listaIngredientes();



  Burguer burguerPicanha = new Burguer(2,"Picanha", ingredientesPicanha);
     Ingrediente cebolaRoxa = new Ingrediente("cebolaRoxa", 5.0);
     Ingrediente bacon = new Ingrediente("bacon", 7.0);
     Ingrediente mussarela = new Ingrediente("mussarela", 10.0);
  Ingrediente[] ingredientesPicanha = new Ingrediente[3];

    IngredientePicanha[0] = cebolaRoxa;
    IngredientePicanha[1] = bacon;
    IngredientePicanha[2] = mussarela;

  System.out.println("burguerPicanha " + burguerPicanha.getNome());
        System.out.println("preço: "+ burguerPicanha.preco());
        burguerPicanha.listaIngredientes();

    Burguer burguerChicken = new Burguer(3,"Chicken", ingredientesChicken);
       Ingrediente frango = new Ingrediente("Frango", 15.0);

       Ingrediente maionese = new Ingrediente("Maionese", 8.0);

     Ingrediente[] ingredientesChicken = new Ingrediente[2];

      IngredienteChicken[0] = frango;
      IngredienteChicken[1] = maionese;


   System.out.println("burguerChicken " + burguerChicken.getNome());
        System.out.println("preço: "+ burguerChicken.preco());
        burguerChicken.listaIngredientes();

Cliente Izabela = new Cliente("Izabela", "21 992565831", "Rua dos Biólogos, 10");

Cliente Leo = new Cliente("Leo", "21 992565830", "Rua dos Médicos, 15");

Cliente Larissa = new Cliente("Larissa", "21 992565835", "Rua da Felicidade, 8");

    Burguer[] burguersPedido = new Burguer[3];

       burguersPedido[0] = burguerTradicional;
       burguersPedido[1] = burguerPicanha;
       burguersPedido[2] = burguerChicken;


Pedido pedido = new Pedido(1, "Izabela", burguersPedido);

   System.out.println("Valor do pedido = " + pedido.valorTotal());

Pedido pedido = new Pedido(2, "Leo", burguersPedido);

   System.out.println("Valor do pedido = " + pedido.valorTotal());
Pedido pedido = new Pedido(3, "Larissa", burguersPedido);

    System.out.println("Valor do pedido = " + pedido.valorTotal());



}