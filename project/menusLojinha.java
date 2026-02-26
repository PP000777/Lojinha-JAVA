package project;
import java.util.Scanner;

public class menusLojinha {

    public static void menu(Scanner entrada_dados_main) {

        System.out.println("=================================================");
        System.out.println("                 MENU LOJINHA                  ");
        System.out.println("=================================================");
        System.out.println("O que você quer fazer?");
        System.out.println();
        System.out.println("1 - Quero fazer compras na LOJINHA");
        System.out.println("2 - Menu de alterações do estoque");
        System.out.println("3 - Verificar carrinho");
        System.out.println("4 - Concluir compra");
        System.out.println("5 - Sair");
        System.out.println("=================================================");
        System.out.print("Escolha uma opção: ");
    }

    public static void menuEstoque() {

        System.out.println("=================================================");
        System.out.println("           MENU DE ALTERAÇÕES DE ESTOQUE       ");
        System.out.println("=================================================");
        System.out.println();
        System.out.println("1 - Realizar cadastro");
        System.out.println("2 - Alterar algum produto");
        System.out.println("3 - Remover algum produto");
        System.out.println("0 - Voltar");
        System.out.println("=================================================");
        System.out.print("Escolha uma opção: ");
    }

    public static void carrinho(String[] args) {

        System.out.println("=================================================");
        System.out.println("                  SEU CARRINHO                 ");
        System.out.println("=================================================");
        System.out.printf("Valor total do carrinho: R$ %.2f%n", dadosLojinha.total);
        System.out.println();
        System.out.println("Produtos no carrinho:");
        System.out.println("-------------------------------------------------");

        for(int i = 0; i < dadosLojinha.total_produtos.length; i++){
            if (dadosLojinha.total_produtos[i] != null) {
                System.out.println((i+1) + " - " + dadosLojinha.total_produtos[i]);
            }
        }

        System.out.println("=================================================");
    }

    public static void compras(Scanner entrada_dados_main) {

        System.out.println("=================================================");
        System.out.println("                SETOR DE COMPRAS               ");
        System.out.println("=================================================");
        System.out.println("O que você quer comprar?");
        System.out.println("-------------------------------------------------");

        for(int i = 0; i < dadosLojinha.nome_Produto.length; i++){
            if (dadosLojinha.nome_Produto[i] == null) {
                System.out.printf("%d - %-20s : R$ %.2f%n",
                        (i+1), "Sem cadastro", dadosLojinha.valor_Produto[i]);
            } else {
                System.out.printf("%d - %-20s : R$ %.2f%n",
                        (i+1), dadosLojinha.nome_Produto[i], dadosLojinha.valor_Produto[i]);
            }
        }

        System.out.println("6 - Voltar ao menu para concluir sua compra");
        System.out.println("=================================================");
        System.out.print("Escolha uma opção: ");
    }

    public static void menu_cadastro(Scanner entrada_dados_main){

        System.out.println("=================================================");
        System.out.println("                    CADASTROS                  ");
        System.out.println("=================================================");
        System.out.println("Vamos cadastrar alguns produtos!");
        System.out.println();
        System.out.println("1 - Quero utilizar o slot que eu quiser");
        System.out.println("2 - Quero utilizar um slot vazio sequencial");
        System.out.println("3 - Voltar");
        System.out.println("=================================================");
        System.out.print("Escolha uma opção: ");
    }

    public static void opcao_Slots(Scanner entrada_dados_main){

        System.out.println("=================================================");
        System.out.println("                ESCOLHA UM SLOT                ");
        System.out.println("=================================================");

        for(int i = 1; i <= dadosLojinha.tamanho_Array; i++){
            System.out.println(i + " - Slot disponível");
        }

        System.out.println("=================================================");
        System.out.print("Escolha uma opção: ");
    }
}