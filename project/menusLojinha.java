package project;
import java.util.Scanner;
public class menusLojinha {
    public static void menu(String[] args) {
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
    public static void compras(String[] args) {
        //MENU DA LOJINHA
        System.out.println("-------------------------------");
        System.out.println("------ SETOR DE COMPRAS -------");
        System.out.println("-------------------------------");
        System.out.println("Oque você quer comprar?");
        System.out.println("1- Calça: R$200,00");
        System.out.println("2- Chinelo: R$50,00");
        System.out.println("3- Camisa: R$190,00");
        System.out.println("4- Tênis da nike: R$450,00");
        System.out.println("5- Voltar ao menu para concluir sua compra");
    }

    public static void menu_cadastro(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("---------- CADASTROS ----------");
        System.out.println("-------------------------------");
        System.out.println("Vamos cadastrar alguns produtos!!");
        System.out.println("Escolha como quer realizar seu cadastro: ");
        System.out.println("1- Quero utilizar o slot que eu quiser");
        System.out.println("2- Quero utilizar um slot vazio sequencial");
        int opcao = leitor.nextInt();

        if(opcao == 1){
        int opcao2 = leitor.nextInt();
        if (dadosLojinha.nome_Produto[opcao2] != null) {
            
        }
        }else{
        System.out.println("Vou dar uma olhadinha se tem espaço pra colocar mais item aqui :D");
        System.out.println("Verificando...");

        try{
            Thread.sleep(1000);
        }catch(InterruptedException error){
            System.out.println("Deu erro nessa bagaça");
        }
        }
       
        leitor.close();
        
    }

    public static void opcao_Slots(String[] args){
        System.out.println("Qual slot quer usar?");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }
}
