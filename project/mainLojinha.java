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
            if (opcao2 == 1) {dadosLojinha.total =+ 200;}
            else if(opcao2 == 2){dadosLojinha.total =+ 50;}
            else if(opcao2 == 3){dadosLojinha.total =+ 190;}
            else if(opcao2 == 4){dadosLojinha.total =+ 450;}
            else if(opcao2 == 5){break;}
            }

        }else if(opcao == 2){
            cadastroLojinha.cadastro(entrada_dados_main);
        }else if(opcao == 3){
            System.out.println("esse é o valor da compra: "+ dadosLojinha.total);
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