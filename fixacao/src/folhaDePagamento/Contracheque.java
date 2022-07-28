package folhaDePagamento;

public class Contracheque {

    


    
    public String nome;    
    public double salarioBruto;
    public double taxa;
    public double porcentagem;

    public double valorLiquido(){
        return salarioBruto - taxa ;
    }
    
    public double almento(double porcentagem){
        double taxaDeAlmento = salarioBruto / 100 * porcentagem;
        return valorLiquido() + taxaDeAlmento;
    }
    
    public String toString(){
        return "Empregado: "+ nome + ", R$"+ String.format("%.2f",valorLiquido());
        
    }
    
    
 

}
