package holerite;

public class CalculoVT {
    
int TaxaVt = 6;
double DescontoVt;
//double Salario2;

public double CalculoDescontoVt(double x){

DescontoVt = (x * (double)TaxaVt)/100;
return DescontoVt;
    
}
    
}
