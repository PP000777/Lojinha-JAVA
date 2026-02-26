package project;

import java.util.Scanner;

public class edicaoDeProdutosLojinha {
    public static void editor(Scanner entrada_dados_main) {
        menusLojinha.edicao();
        int opcao_slotedi = entrada_dados_main.nextInt();
        entrada_dados_main.nextLine();

        while (true) {
        int opcc = opcao_slotedi - 1;
        
        if (dadosLojinha.nome_Produto[opcc] == null || dadosLojinha.valor_Produto[opcc] == 0) {
            System.out.println("Esse produto não ta cadastrado ou não está completo");
            break;
        }else{
            System.out.println("Quer realizar qual alteração no produto?");
            System.out.println("1- Alterar Nome");
            System.out.println("2- Alterar Preço");
            int opc = entrada_dados_main.nextInt();
            entrada_dados_main.nextLine();

            if (opc == 1) {
                System.out.println("Qual o novo nome do produto? ");
                String novoNome = entrada_dados_main.nextLine();
                dadosLojinha.nome_Produto[opcc] = novoNome;
                System.out.println("Produto alterado com sucesso!!");
                break;
                
            }else if(opc == 2){
                System.out.println("Qual o novo valor do produto? ");
                dadosLojinha.valor_Produto[opcc] = entrada_dados_main.nextDouble();
                entrada_dados_main.nextLine();
                System.out.println("Produto alterado com sucesso!!");
                break;
            }
        }
        }
        
    }
}
