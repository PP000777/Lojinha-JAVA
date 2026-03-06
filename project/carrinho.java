package project;

import java.util.ArrayList;

public class carrinho {
   public static ArrayList<produtos> todos_produtossCarrinho = new ArrayList<>();

    String nome_Produto;
    double valor_Produto;

    public carrinho(String name, double cost){
        nome_Produto = name;
        valor_Produto = cost;
    } 
}
