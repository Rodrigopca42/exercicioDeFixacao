package dollar;

import java.util.Scanner;
import dollar.Conversao;

public class AppConversao {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.print("Qual o preço do dollar? ");
        double precoDollar = tec.nextDouble();

        System.out.print("Quantos dollares você vai comprar? ");
        double valor = tec.nextDouble();

        double result = Conversao.dollarParaReal(valor, precoDollar);
        System.out.printf("O total a pagar em Reais, R$%.2f%n", result);


        tec.close();
    }
}
