package folhaDePagamento;

import java.util.Scanner;
import folhaDePagamento.Contracheque;


public class Pagamento {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        Contracheque folha = new Contracheque();

        System.out.print("Nome do Funcionario: ");
        folha.nome = tec.nextLine();

        System.out.print("Salário Bruto: ");
        folha.salarioBruto = tec.nextDouble();

        System.out.print("Taxa de Impostos: ");
        folha.taxa = tec.nextDouble();
        
        System.out.println(" ");
        System.out.println(folha);
        System.out.println(" ");
        
        System.out.print("Entre com a porcentagem de almento: ");
        double porcentagem = tec.nextDouble();
        folha.almento(porcentagem);


        System.out.println(" ");
        System.out.println("Reajuste do "+ folha);
       
       
       
       
       tec.close();
    }
}
