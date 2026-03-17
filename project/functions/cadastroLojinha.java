package project.functions;

import java.util.Scanner;

import project.produtos;

public class cadastroLojinha {
    public static void cadastro(Scanner entrada_dados_main) {
        menusLojinha.menu_cadastro(entrada_dados_main);
        int opcao3 = entrada_dados_main.nextInt();
        entrada_dados_main.nextLine();
                
        if (opcao3 == 1) {
            //Função para adicionar um produto no slot escolhido
            menusLojinha.opcao_Slots(entrada_dados_main);
            int opcao4 = entrada_dados_main.nextInt();
            entrada_dados_main.nextLine();
        
            int opcaofinal = opcao4 - 1;
            if (produtos.todos_produtoss.get(opcaofinal) == null && opcaofinal < produtos.todos_produtoss.size()) {
                System.out.println("Qual o nome do produto? ");
                String nomeProdutoCadastro = entrada_dados_main.nextLine();
                System.out.println("Qual o valor desse produto? ");
                double valorProdutoCadastro = entrada_dados_main.nextDouble();
                produtos.todos_produtoss.add(new produtos(nomeProdutoCadastro, valorProdutoCadastro));
                System.out.println("PRODUTO CADASTRADO COM SUCESSO!!!");
                System.out.println("Voltando para a página inicial...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException error) {
                    System.out.println("Deu erro nessa bagaça");
                }
            }else{
                System.out.println("SLOT OCUPADO!");
            }
            
        } else if(opcao3 == 2) {
            //Função para adicionar um produto no slot sequencial
            System.out.println("Vou dar uma olhadinha se tem espaço pra colocar mais item aqui :D");
            System.out.println("Verificando...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException error) {
                System.out.println("Deu erro nessa bagaça");
            }
        
        for (int i = 0; i < produtos.todos_produtoss.size(); i++) {
            if (produtos.todos_produtoss.get(i) == null) {
                System.out.println("Qual o nome do produto? ");
                String nomeProdutoCadastro = entrada_dados_main.nextLine();
                System.out.println("Qual o valor desse produto? ");
                double valorProdutoCadastro = entrada_dados_main.nextDouble();
                produtos.todos_produtoss.add(new produtos(nomeProdutoCadastro, valorProdutoCadastro));
                System.out.println("PRODUTO CADASTRADO COM SUCESSO!!!");
                System.out.println("Voltando para a página inicial...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException error) {
                    System.out.println("Deu erro nessa bagaça");
                }
                break;
            } else {
                System.out.println("Todos os slots estão cheios parça");
            }
        }
        }else if (opcao3 == 3) {
            return;
        }
    }
}
