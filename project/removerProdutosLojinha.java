package project;

import java.util.Scanner;

public class removerProdutosLojinha {
    public static void remover(Scanner entrada_dados_main) {
        menusLojinha.remover();
        int opcaoo = entrada_dados_main.nextInt();
        entrada_dados_main.nextLine(); // Limpar buffer

        if (opcaoo <= 0) {
            System.out.println("Preencha com uma opção válida, deve ser maior que 0!!");
        }else{
            while (true) {
                int opcaoRemover = opcaoo - 1;
                if (dadosLojinha.nome_Produto[opcaoRemover] != null && dadosLojinha.valor_Produto[opcaoRemover] != 0){
                    dadosLojinha.nome_Produto[opcaoRemover] = null;
                    dadosLojinha.valor_Produto[opcaoRemover] = 0;
                    System.out.println("Produto removido com sucesso!!");
                    break;
                }else{
                    System.out.println("Esse produto não existe");
                    break;
                }        
            }
        }
        
    }
    
}