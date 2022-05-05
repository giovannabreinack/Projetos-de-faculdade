package holerite;

public class CalculoVT {
    
int TaxaVt = 6;
double DescontoVt;
double Salario2;

public double CalculoDescontoVt(){

DescontoVt = (Salario2 * TaxaVt)/100;
return DescontoVt;
    
}
    
}
