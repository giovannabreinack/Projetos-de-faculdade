package holerite;

public class CalculoInss {

    //double Salario1;
    double DescontoInss;

    double Aliquota1 = 7.5;
    double Aliquota2 = 9.5;
    double Aliquota3 = 12;
    double Aliquota4 = 14;
    double Aliquota5 = 14.5;
    double Aliquota6 = 16.5;
    double Aliquota7 = 19;
    double Aliquota8 = 22;

    public double CalculoDescontoInss(double x) {
        if (x <= 1212.00) {
            DescontoInss = (Aliquota1 * x) / 100;
        } else if (x >= 1212.01 & x <= 2427.35) {
            DescontoInss = (Aliquota2 * x) / 100;
        } else if (x >= 2427.36 & x <= 3641.03 ){
            DescontoInss = (Aliquota3 * x) / 100;
        } else if (x >= 3641.04 & x <= 7087.22){
            DescontoInss = (Aliquota4 * x) / 100;
        } else if (x >= 7087.23 & x <= 12136.79){
            DescontoInss = (Aliquota5 * x) / 100;
        } else if (x >= 12136.80 & x <= 24273.57){
            DescontoInss = (Aliquota6 * x) / 100;
        } else if (x >= 24273.58 & x <= 47333.46){
          DescontoInss = (Aliquota7 * x) / 100;  
        } else if (x > 47333.46){
          DescontoInss = (Aliquota8 * x) / 100;    
        }
        
        return DescontoInss;
    }

    
    
    
    }


    


