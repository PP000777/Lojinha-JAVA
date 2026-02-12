import java.util.Scanner;

public class study {
    public static void main(String[] args) {
        Scanner robson = new Scanner(System.in); //Scanner sendo "habilitado" 

        // ENTRADA DE DADOS PARA VER QUANTOS NUMEROS O USUARIO QUER 
        System.out.println("Aqui tu escreve a quantidade de numeros que voce vai escrever: "); 
        double quantidade = robson.nextDouble();
       
        //LAÇO DE REPETIÇÃO
        int i = 0; 
        double soma = 0;
       for(i=0; i<quantidade ; i++){
        System.out.println("Fale o seu primeiro numero para somar e calcular media: ");
        double numero = robson.nextDouble();
        soma =+ numero;
       }

       //SAIDA DE DADOS PARA A SOMA E MEDIA
       double media = soma/quantidade;
       System.out.println("Aqui está a sua soma: " + soma);
       System.out.println("Aqui está a sua media: " + media);

        robson.close(); // Fechando Scanner
    }
}