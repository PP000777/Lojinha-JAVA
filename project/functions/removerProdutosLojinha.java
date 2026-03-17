package project.functions;

import java.util.Scanner;

import project.produtos;

public class removerProdutosLojinha {
    public static void remover(Scanner entrada_dados_main) {
        menusLojinha.remover();
        int opcaoo = entrada_dados_main.nextInt();
        entrada_dados_main.nextLine(); // Limpar buffer

        if (opcaoo <= 0) {
            System.out.println("Preencha com uma opção válida, deve ser maior que 0!!");
        }else{
                int opcaoRemover = opcaoo - 1;
                if (produtos.todos_produtoss.get(opcaoRemover) != null){
                    produtos.todos_produtoss.remove(opcaoRemover);
                    System.out.println("Produto removido com sucesso!!");
                }else{
                    System.out.println("Esse produto não existe");
                }        
        }
        
    }
    
}