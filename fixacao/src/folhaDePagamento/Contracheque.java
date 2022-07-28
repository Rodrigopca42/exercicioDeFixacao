package folhaDePagamento;

public class Contracheque {
     
    public String nome;    
    public double salarioBruto;
    public double taxa;
    

    public double valorLiquido(){
        return salarioBruto - taxa ;
    }
    
    public void almento(double porcentagem){
       salarioBruto += salarioBruto * porcentagem / 100;
    }
    
    public String toString(){
        return "Empregado: "+ nome + ", R$"+ String.format("%.2f",valorLiquido());
        
    }
    
    
 

}
