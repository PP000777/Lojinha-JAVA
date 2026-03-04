package project.functions;
import java.util.Scanner;

import project.dadosLojinha;

public class fimDaCompraLojinha {
    public static void fimdesconto(String[] args) {
        boolean isPremium = false;
        Scanner entrada_dados = new Scanner(System.in);
        
        System.out.println("Calculando...");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException error){
            System.out.println("Deu erro nessa bagaça");
        }
        
        System.out.println("Você é premium na LOJINHA? ");
        String premium = entrada_dados.nextLine();
        

        if ("sim".equalsIgnoreCase(premium) || "yes".equalsIgnoreCase(premium)) {
            isPremium = true;
        }else if("nao".equalsIgnoreCase(premium) || "no".equalsIgnoreCase(premium)){
            isPremium = false;
        }

        System.out.println("Verificando...");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException error){
            System.out.println("Deu erro nessa bagaça");
        }

        double descontode15 = (dadosLojinha.total * 0.15);
        double descontode5 = (dadosLojinha.total * 0.05);

        if (dadosLojinha.total >= 200 && isPremium) {
            System.out.println("Esse é o seu valor com desconto de 15%, ficou nesse valor:" + "R$" +(dadosLojinha.total - descontode15));
        }else if (dadosLojinha.total >= 200 && isPremium == false){
            System.out.println("Esse é o seu valor com desconto de 5%, ficou nesse valor: " + "R$" +(dadosLojinha.total - descontode5));
        }else{
            System.out.println("nao tem desconto maldito, ficou no valor de " + "R$" + dadosLojinha.total);
        }

        entrada_dados.close();
    }
}
