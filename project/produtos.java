package project;
import java.util.ArrayList;

public class produtos {
   public static ArrayList<produtos> todos_produtoss = new ArrayList<>();

    String nome_Produto;
    double valor_Produto;

    public double getValor(){
        return valor_Produto;
    }

       public String getNome(){
        return nome_Produto;
    }

    public void setvalorProduto(double valor){
        this.valor_Produto = valor;
    }

    public void setnameProduto(String nomezin){
        this.nome_Produto = nomezin;
    }

    public produtos(String name, double cost){
        nome_Produto = name;
        valor_Produto = cost;
    } 
}
