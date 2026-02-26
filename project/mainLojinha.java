package project;

import java.util.Scanner;

public class mainLojinha {
    public static void main(String[] args) {
        Scanner entrada_dados_main = new Scanner(System.in);

        while(true){
        menusLojinha.menu(entrada_dados_main);
        int opcao = entrada_dados_main.nextInt();
        entrada_dados_main.nextLine();

        if(opcao == 1){
            while (true) {
            menusLojinha.compras(entrada_dados_main);
            int opcao2 = entrada_dados_main.nextInt();
            if (opcao2<= dadosLojinha.valor_Produto.length && dadosLojinha.nome_Produto[opcao2-1] != null) {
                System.out.println("Produto Adicionado");
                dadosLojinha.total += dadosLojinha.valor_Produto[opcao2-1];
                dadosLojinha.total_produtos[opcao2-1] = dadosLojinha.nome_Produto[opcao2-1];
                break;
            }else{
                System.out.println("Produto não cadastrado");
                break;
            }
            }

        }else if(opcao == 2){
            cadastroLojinha.cadastro(entrada_dados_main);
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