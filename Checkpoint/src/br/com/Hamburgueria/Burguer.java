package br.com.Hamburgueria;

public class Burguer {

        private Integer idBurguer;
        private String nome;
        private Ingrediente [] ingredientes;

 public Burguer (Integer idBurguer, String nome, Ingrediente[] ingredientes){

         this .idBurguer = idBurguer;
         this . nome = nome;
         this . ingredientes = ingredientes;
 }

public Integer getIdBurguer() {

       return idBurguer;
}

public String getNome() {

       return nome;

}

    public void setIngredientes(Ingrediente[] ingredientes) {

        this.ingredientes = ingredientes;
    }

    public Double preco() {

        Double valorTotal = 0.0;

        for (Ingrediente ingrediente : this.ingredientes) {

            valorTotal += ingrediente.getCusto();
        }

        return valorTotal;
    }

    public void listaIngredientes(){

      System.out.println("Esses são os ingrediented de" + this.nome +":");

      for (Ingrediente ingrediente: this.ingredientes){

       System.out.println(ingrediente.getNome());
      }
    }

}
