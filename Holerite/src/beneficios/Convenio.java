package beneficios;

public class Convenio {

    int TaxaConvenio = 2;
    double SalarioMinimo = 1212;
    double DescontoConvenio;

    public double CalculoDescontoConvenio(double x) {

        if (x <= SalarioMinimo) {
            DescontoConvenio = 0;
        } else {
            DescontoConvenio = (x * (double) TaxaConvenio) / 100;

        }
        return DescontoConvenio;

    }

}
    

