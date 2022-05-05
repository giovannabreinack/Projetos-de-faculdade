package holerite;

public class CalculoInss {

    double Salario;
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
        if (Salario < 1212.00) {
            DescontoInss = (Aliquota1 * Salario) / 100;
        } else if (Salario >= 1212.01 & Salario <= 2427.35) {
            DescontoInss = (Aliquota2 * Salario) / 100;
        } else if (Salario >= 2427.36 & Salario <= 3641.03 ){
            DescontoInss = (Aliquota3 * Salario) / 100;
        } else if (Salario >= 3641.04 & Salario <= 7087.22){
            DescontoInss = (Aliquota4 * Salario) / 100;
        } else if (Salario >= 7087.23 & Salario <= 12136.79){
            DescontoInss = (Aliquota5 * Salario) / 100;
        } else if (Salario >= 12136.80 & Salario <= 24273.57){
            DescontoInss = (Aliquota6 * Salario) / 100;
        } else if (Salario >= 24273.58 & Salario <= 47333.46){
          DescontoInss = (Aliquota7 * Salario) / 100;  
        } else if (Salario > 47333.46){
          DescontoInss = (Aliquota8 * Salario) / 100;    
        }
        return DescontoInss;
    }

    void CalculoDescontoInss(double SalarioBruto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
