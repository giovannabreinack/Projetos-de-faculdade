package beneficios;

public class CalculoVA {

    int TaxaVA = 2;
    double TSM = 3636.00;
    double descontova;

    public double calculoVa(double x) {
        if (x <= TSM) {
            descontova = 0;

        } else {
            descontova = (x * (double) TaxaVA) / 100;
        }
        return descontova;
    }
}
