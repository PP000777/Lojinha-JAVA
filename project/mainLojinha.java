package project;

import java.util.Scanner;

public class mainLojinha {
    public static void main(String[] args) {
        Scanner entrada_dados_main = new Scanner(System.in);

        while(true){
        menusLojinha.menu(args);
        int opcao = entrada_dados_main.nextInt();

        if(opcao == 1){
            while (true) {
            menusLojinha.compras(args);
            int opcao2 = entrada_dados_main.nextInt();
            if (opcao2 == 1) {dadosLojinha.total =+ 200;}
            else if(opcao2 == 2){dadosLojinha.total =+ 50;}
            else if(opcao2 == 3){dadosLojinha.total =+ 190;}
            else if(opcao2 == 4){dadosLojinha.total =+ 450;}
            else if(opcao2 == 5){break;}
            }

        }else if(opcao == 4){
            System.out.println("Até mais, volte logo :( ");
            break;
        }else if(opcao == 3){
            fimDaCompraLojinha.fimdesconto(args);
            break;
        }else if(opcao == 2){
            System.out.println("esse é o valor da compra: "+ dadosLojinha.total);
        }
        }
    
        entrada_dados_main.close();
    }
}