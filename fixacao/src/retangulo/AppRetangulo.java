package retangulo;

import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;
import retangulo.Retangulos;

public class AppRetangulo {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        Retangulos retangulos = new Retangulos(); 

        System.out.println("Entre com a Largura e a Altura do Retângulo");
        retangulos.largura = tec.nextDouble();
        retangulos.altura = tec.nextDouble();
        tec.close();

        System.out.printf("Área: %.2f%n" , retangulos.area() );

        System.out.printf("Perimetro: %.2f%n", retangulos.perimetro());

        System.out.printf("Diagonal: %.2f%n", retangulos.diagonal());
        System.out.println(" ");
    }
}
