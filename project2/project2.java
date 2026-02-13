package project2;
import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        boolean isPremium = false;

        Scanner entrada_dados = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("-ENTRADA DE DADOS LOJJOAO-");
        System.out.println("--------------------------");

        System.out.println("Qual foi o valor total da sua compra? ");
        double valor = entrada_dados.nextDouble();
        entrada_dados.nextLine();

        System.out.println("Calculando...");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException error){
            System.out.println("Deu erro nessa bagaça");
        }
        
        System.out.println("Você é premium na LOJJOAO? ");
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

        double descontode15 = (valor * 0.15);
        double descontode5 = (valor * 0.05);

        if (valor >= 200 && isPremium) {
            System.out.println("Esse é o seu valor com desconto de 15%, ficou nesse valor:" + "R$" +(valor - descontode15));
        }else if (valor >= 200 && isPremium == false){
            System.out.println("Esse é o seu valor com desconto de 5%, ficou nesse valor: " + "R$" +(valor - descontode5));
        }else{
            System.out.println("nao tem desconto maldito, ficou no valor de " + "R$" + valor);
        }

        entrada_dados.close();
    }
}
