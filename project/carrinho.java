package project;

import java.util.ArrayList;

public class carrinho {
   public static ArrayList<carrinho> todos_produtossCarrinho = new ArrayList<>();

    String nome_Produto;
    double valor_Produto;

    public carrinho(String name, double cost){
        nome_Produto = name;
        valor_Produto = cost;
    } 
    
    public double carrinhoGetValor(){
        return valor_Produto;
    }

    public String carrinhoGetNome(){
        return nome_Produto;
    }

    public static double total_carrinho;

    public static double calcular_valor() {
        double tudao = 0;

        if (todos_produtossCarrinho.size()>0) {
            for(int i = 0; i<todos_produtossCarrinho.size(); i++){
                tudao = todos_produtossCarrinho.get(i).valor_Produto + tudao;
            }
            total_carrinho = tudao;
        }else{
            System.out.println("Você não possui nenhum produto alocado ao carrinho");
        }

        return tudao;
    }

}
