package escola;

public class Aluno {
    
    public String nome;
    public double bimestre1;
    public double bimestre2;
    public double bimestre3;
    public double bimestre4;

    public double media(){
        return (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
    
        }
        
        public double missingPoint(){
            if(media() < 6.0){
                return 6.0 - media();
            }
            else{
                return 0.0;
            }
        }
    

}
