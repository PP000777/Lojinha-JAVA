package project;
import java.util.Scanner;   

public class cadastroLojinha {
    public static void cadastro(String[] args) {
        Scanner receber = new Scanner(System.in);
        int contador_produtos = 0;
        
        System.out.println("Bem vindo à aba de cadastros!!");
        System.out.println("Vamos verificar se nao esta cheia a lista");

        while (true) {
        if (contador_produtos == 5 ) {
        break;
        }
        else{
            System.out.println("Qual o nome do produto? ");
            dadosLojinha.nome_Produto[contador_produtos] = receber.nextLine();
            System.out.println("Qual o valor desse produto? ");
            dadosLojinha.valor_Produto[contador_produtos] = receber.nextInt();
            contador_produtos = contador_produtos + 1;
        }
        }

        receber.close();
       
    }
}
