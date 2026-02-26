package project;
import java.util.Scanner;
public class menusLojinha {
    public static void menu(Scanner entrada_dados_main) {
        //MENU DA LOJINHA
        System.out.println("---------------------------");
        System.out.println("------ MENU LOJINHA -------");
        System.out.println("---------------------------");
        System.out.println("Oque você quer fazer?");
        System.out.println("1- Quero fazer compras na LOJINHA");
        System.out.println("2- Realizar cadastro de produtos");
        System.out.println("3- Verificar carrinho");
        System.out.println("4- Concluir compra");
        System.out.println("5- Sair");
    }

    public static void carrinho(String[] args) {
        System.out.println("----------------------------");
        System.out.println("------- SEU CARRINHO -------");
        System.out.println("----------------------------");
        System.out.println("Esse é o valor total atribuído ao carrinho: R$"+ dadosLojinha.total);
        System.out.println("");
        System.out.println("Produtos no carrinho:");
        for(int i=0; i<dadosLojinha.total_produtos.length; i++){
            if (dadosLojinha.total_produtos[i] != null) {
                System.out.println((i+1)+"- "+  dadosLojinha.total_produtos[i]);
            }
        }
    }

    public static void compras(Scanner entrada_dados_main) {
        //MENU DA LOJINHA
        System.out.println("-------------------------------");
        System.out.println("------ SETOR DE COMPRAS -------");
        System.out.println("-------------------------------");
        System.out.println("Oque você quer comprar?");
         //Colocando produtos só para teste
        //Produto 1
        dadosLojinha.nome_Produto[0] = "Arroz";
        dadosLojinha.valor_Produto[0] = 25.90;
        //Produto 2
        dadosLojinha.nome_Produto[1] = "Feijão";
        dadosLojinha.valor_Produto[1] = 12.55;
        
        //Laço de repetição para aparecer produtos sem o nome de NULL e sem aquelas listas enormes de (if)
        for(int i=0; i<dadosLojinha.nome_Produto.length; i++){
            if (dadosLojinha.nome_Produto[i] == null) {
                System.out.println((i+1)+"- "+  "Sem cadastro"+ ": R$"+ dadosLojinha.valor_Produto[i]);
            }else{
                System.out.println((i+1)+"- "+  dadosLojinha.nome_Produto[i]+ ": R$"+ dadosLojinha.valor_Produto[i]);
            }
        }

        System.out.println("6- Voltar ao menu para concluir sua compra");
    }

    public static void menu_cadastro(Scanner entrada_dados_main){
        System.out.println("-------------------------------");
        System.out.println("---------- CADASTROS ----------");
        System.out.println("-------------------------------");
        System.out.println("Vamos cadastrar alguns produtos!!");
        System.out.println("Escolha como quer realizar seu cadastro: ");
        System.out.println("1- Quero utilizar o slot que eu quiser");
        System.out.println("2- Quero utilizar um slot vazio sequencial");
        System.out.println("3- Voltar");
    }

    public static void opcao_Slots(Scanner entrada_dados_main){
        System.out.println("Qual slot quer usar?");
        System.out.println("1 - Slot");
        System.out.println("2 - Slot");
        System.out.println("3 - Slot");
        System.out.println("4 - Slot");
        System.out.println("5 - Slot");
    }
}
