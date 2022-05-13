package beneficios;

public class CalculoVR {

        int TaxaVt = 3;
        double SalarioMinimo = 1212.00;
        double DescontoVr;

        public double CalculoDescontoVr(double x) {

            if (x <= SalarioMinimo) {
                DescontoVr = 0;
            } else {
                DescontoVr = (x * (double) TaxaVt) / 100;

            }

            return DescontoVr;
    }

}
