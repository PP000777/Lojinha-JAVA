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
        System.out.println("3- Verificar valor");
        System.out.println("4- Concluir compra");
        System.out.println("5- Sair");
    }
    public static void compras(Scanner entrada_dados_main) {
        //MENU DA LOJINHA
        System.out.println("-------------------------------");
        System.out.println("------ SETOR DE COMPRAS -------");
        System.out.println("-------------------------------");
        System.out.println("Oque você quer comprar?");
        System.out.println("1- "+  dadosLojinha.nome_Produto[0]+ ": R$"+ dadosLojinha.valor_Produto[0]);
        System.out.println("2- "+  dadosLojinha.nome_Produto[1]+ ": R$"+ dadosLojinha.valor_Produto[1]);
        System.out.println("3- "+  dadosLojinha.nome_Produto[2]+ ": R$"+ dadosLojinha.valor_Produto[2]);
        System.out.println("4- "+  dadosLojinha.nome_Produto[3]+ ": R$"+ dadosLojinha.valor_Produto[3]);
        System.out.println("5- Voltar ao menu para concluir sua compra");
    }

    public static void menu_cadastro(Scanner entrada_dados_main){
        System.out.println("-------------------------------");
        System.out.println("---------- CADASTROS ----------");
        System.out.println("-------------------------------");
        System.out.println("Vamos cadastrar alguns produtos!!");
        System.out.println("Escolha como quer realizar seu cadastro: ");
        System.out.println("1- Quero utilizar o slot que eu quiser");
        System.out.println("2- Quero utilizar um slot vazio sequencial");
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
