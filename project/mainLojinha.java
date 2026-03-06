package project;

import java.util.Scanner;

import project.functions.fimDaCompraLojinha;
import project.functions.menusLojinha;


public class mainLojinha {
    public static void main(String[] args) {
        Scanner entrada_dados_main = new Scanner(System.in);
        produtos.todos_produtoss.add(new produtos("Camisa", 40.60));
        produtos.todos_produtoss.add(new produtos("Calça", 80.00));


        while(true){
        menusLojinha.menu(entrada_dados_main);
        int opcao = entrada_dados_main.nextInt();
        entrada_dados_main.nextLine();

        if(opcao == 1){
            while (true) {
            menusLojinha.compras(entrada_dados_main);
            int opcao2 = entrada_dados_main.nextInt();
            int opcaof = (opcao2 - 1);
            if (opcao2<= produtos.todos_produtoss.size() && produtos.todos_produtoss.get(opcaof) != null) {
                System.out.println("Produto Adicionado");
                carrinho.todos_produtossCarrinho.add(produtos.todos_produtoss.get(opcaof));
                break;
            }else{
                System.out.println("Produto não cadastrado");
                break;
            }
            }

        }else if(opcao == 2){
            menusLojinha.menuEstoque(entrada_dados_main);
        }else if(opcao == 3){
            menusLojinha.carrinho(args);
        }else if(opcao == 4){
           fimDaCompraLojinha.fimdesconto(args);
            break;
        }else if(opcao == 5){
            System.out.println("Até mais, volte logo :( ");
            break;
        }
        }
    
        entrada_dados_main.close();
    }
}