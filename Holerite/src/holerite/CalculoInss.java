package holerite;

public class CalculoInss {

    double DescontoInss;

    double Aliquota1 = 7.5;
    double Aliquota2 = 9;
    double Aliquota3 = 12;
    double Aliquota4 = 14;
    

    public double CalculoDescontoInss(double x) {
        if (x <= 1212.00) {
            DescontoInss = (Aliquota1 * x) / 100;
        } else if (x >= 1212.01 & x <= 2427.35) {
            DescontoInss = ((Aliquota2 * x) / 100) - 18.18;
        } else if (x >= 2427.36 & x <= 3641.03) {
            DescontoInss = ((Aliquota3 * x) / 100) - 91.00;
        } else if (x >= 3641.04 & x <= 7087.22 ) {
            DescontoInss = ((Aliquota4 * x) / 100) - 163.82;

        }else if(x >= 7087.23){
            DescontoInss = 828.39;
        }

        return DescontoInss;
    }

}
    


