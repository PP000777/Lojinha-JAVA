package project;
import java.util.ArrayList;

public class produtos {
   public static ArrayList<produtos> todos_produtoss = new ArrayList<>();

    String nome_Produto;
    double valor_Produto;

    public produtos(String name, double cost){
        nome_Produto = name;
        valor_Produto = cost;
    } 
}
