package holerite;

public class Irrf {

    double DescontoIrrf;

    double Aliquota1 = 7.5;
    double Aliquota2 = 15;
    double Aliquota3 = 22.5;
    double Aliquota4 = 27.5;

    public double CalculoDescontoIrrf(double x) {
        if (x <= 1903.98) {
            DescontoIrrf = 0;
        } else if (x >= 1903.99 & x <= 2826.65) {
            DescontoIrrf = ((Aliquota1 * x) / 100) - 142.80;
        } else if (x >= 2826.66 & x <= 3751.05) {
            DescontoIrrf = ((Aliquota2 * x) / 100) - 354.80;
        } else if (x >= 3751.06 & x <= 4664.68) {
            DescontoIrrf = ((Aliquota3 * x) / 100) - 636.13;
        } else if (x >= 4664.69) {
            DescontoIrrf = ((Aliquota4 * x) / 100) - 869.36;

            return DescontoIrrf;
        }
