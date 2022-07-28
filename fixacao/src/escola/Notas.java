package escola;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        Aluno avaliacao = new Aluno();

        System.out.println("Digite o Nome e as Notas do Aluno: ");
        avaliacao.nome = tec.nextLine();
        avaliacao.bimestre1 = tec.nextDouble();
        avaliacao.bimestre2 = tec.nextDouble();
        avaliacao.bimestre3 = tec.nextDouble();
        avaliacao.bimestre4 = tec.nextDouble();
        tec.close();

        System.out.printf("Média final: %.1f%n", avaliacao.media());

        if(avaliacao.media() < 6.0){
            System.out.println("Reprovado");
            System.out.printf("Falta %.1f pontos", avaliacao.missingPoint());
        }else{
            System.out.println("Aprovado");
        }

    }
}
