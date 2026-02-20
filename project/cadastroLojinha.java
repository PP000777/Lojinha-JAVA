package project;

import java.util.Scanner;

public class cadastroLojinha {
    public static void cadastro(Scanner entrada_dados_main) {
        menusLojinha.menu_cadastro(entrada_dados_main);
        int opcao3 = entrada_dados_main.nextInt();
        entrada_dados_main.nextLine();

        if (opcao3 == 1) {
            menusLojinha.opcao_Slots(entrada_dados_main);
            int opcao4 = entrada_dados_main.nextInt();
            entrada_dados_main.nextLine();

            if (dadosLojinha.nome_Produto[(opcao4 - 1)] == null) {
                System.out.println("Qual o nome do produto? ");
                dadosLojinha.nome_Produto[(opcao4 - 1)] = entrada_dados_main.nextLine();
                System.out.println("Qual o valor desse produto? ");
                dadosLojinha.valor_Produto[(opcao4 - 1)] = entrada_dados_main.nextInt();
                System.out.println("PRODUTO CADASTRADO COM SUCESSO!!!");
                System.out.println("Voltando para a página inicial...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException error) {
                    System.out.println("Deu erro nessa bagaça");
                }
            }else{
                System.out.println("Ta cheio este slot");
            }

        } else if(opcao3 == 2) {
            System.out.println("Vou dar uma olhadinha se tem espaço pra colocar mais item aqui :D");
            System.out.println("Verificando...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException error) {
                System.out.println("Deu erro nessa bagaça");
            }
        
        for (int i = 0; i < dadosLojinha.nome_Produto.length; i++) {
            if (dadosLojinha.nome_Produto[i] == null) {
                System.out.println("Qual o nome do produto? ");
                dadosLojinha.nome_Produto[i] = entrada_dados_main.nextLine();
                System.out.println("Qual o valor desse produto? ");
                dadosLojinha.valor_Produto[i] = entrada_dados_main.nextInt();
                System.out.println("verificaçãaaoooo");
                System.out.println(dadosLojinha.valor_Produto[i]);
                System.out.println(dadosLojinha.nome_Produto[i]);
                System.out.println("PRODUTO CADASTRADO COM SUCESSO NO SLOT "+ i + "!!!");
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
        }

    }
}
