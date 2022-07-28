package dollar;

public class Conversao {
    
 public static final double IOF = 0.06;
 
 public static double dollarParaReal(double valor, double precoDollar){
    return valor * precoDollar * (1.0 + IOF);
 }

}
