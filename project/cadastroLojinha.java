package project;

import java.util.Scanner;

public class cadastroLojinha {
    public static void cadastro(String[] args) {
        Scanner receber = new Scanner(System.in);
        menusLojinha.menu_cadastro(args);
        int opcao = receber.nextInt();

        if (opcao == 1) {
            menusLojinha.opcao_Slots(args);
            int opcao2 = receber.nextInt();
            if (dadosLojinha.nome_Produto[opcao2] != null) {
                System.out.println("Qual o nome do produto? ");
                dadosLojinha.nome_Produto[opcao2] = receber.nextLine();
                System.out.println("Qual o valor desse produto? ");
                dadosLojinha.valor_Produto[opcao2] = receber.nextInt();
                System.out.println("PRODUTO CADASTRADO COM SUCESSO!!!");
                System.out.println("Voltando para a página inicial...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException error) {
                    System.out.println("Deu erro nessa bagaça");
                }

                mainLojinha.main(args);
            }

        } else {
            System.out.println("Vou dar uma olhadinha se tem espaço pra colocar mais item aqui :D");
            System.out.println("Verificando...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException error) {
                System.out.println("Deu erro nessa bagaça");
            }
        }
        for (int i = 0; i < dadosLojinha.nome_Produto.length; i++) {
            if (dadosLojinha.nome_Produto[i] != null) {
                System.out.println("Qual o nome do produto? ");
                dadosLojinha.nome_Produto[i] = receber.nextLine();
                System.out.println("Qual o valor desse produto? ");
                dadosLojinha.valor_Produto[i] = receber.nextInt();
                System.out.println("verificaçãaaoooo");
                System.out.println(dadosLojinha.valor_Produto[i]);
                System.out.println(dadosLojinha.nome_Produto[i]);
                break;
            } else {
                System.out.println("Todos os slots estão cheios parça");
            }

            
        }

        System.out.println("cabo");

        receber.close();

    }
}
