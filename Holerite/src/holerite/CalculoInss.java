package holerite;

public class CalculoInss {

    double Salario1;
    double DescontoInss;

    double Aliquota1 = 7.5;
    double Aliquota2 = 9.5;
    double Aliquota3 = 12;
    double Aliquota4 = 14;
    double Aliquota5 = 14.5;
    double Aliquota6 = 16.5;
    double Aliquota7 = 19;
    double Aliquota8 = 22;

    public double CalculoDescontoInss() {
        if (Salario1 <= 1212.00) {
            DescontoInss = (Aliquota1 * Salario1) / 100;
        } else if (Salario1 >= 1212.01 & Salario1 <= 2427.35) {
            DescontoInss = (Aliquota2 * Salario1) / 100;
        } else if (Salario1 >= 2427.36 & Salario1 <= 3641.03 ){
            DescontoInss = (Aliquota3 * Salario1) / 100;
        } else if (Salario1 >= 3641.04 & Salario1 <= 7087.22){
            DescontoInss = (Aliquota4 * Salario1) / 100;
        } else if (Salario1 >= 7087.23 & Salario1 <= 12136.79){
            DescontoInss = (Aliquota5 * Salario1) / 100;
        } else if (Salario1 >= 12136.80 & Salario1 <= 24273.57){
            DescontoInss = (Aliquota6 * Salario1) / 100;
        } else if (Salario1 >= 24273.58 & Salario1 <= 47333.46){
          DescontoInss = (Aliquota7 * Salario1) / 100;  
        } else if (Salario1 > 47333.46){
          DescontoInss = (Aliquota8 * Salario1) / 100;    
        }
        
        return DescontoInss;
    }
    
    
    }


    


