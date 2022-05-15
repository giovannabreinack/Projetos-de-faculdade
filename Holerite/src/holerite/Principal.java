package holerite;

import descontosFolha.Irrf;
import descontosFolha.CalculoInss;
import beneficios.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        CalculoInss D1 = new CalculoInss();
        CalculoVT D2 = new CalculoVT();
        Irrf D3 = new Irrf();
        CalculoVR D4 = new CalculoVR();
        CalculoVA D5 = new CalculoVA();
        Convenio D6 = new Convenio();
        double SalarioBruto, SalaarioLiquido, S;
        String Nome;
        System.out.println("Insira o nome do funcionário: ");
        Nome = tc.nextLine();

        System.out.println("Insira o salário do Funcionário: ");
        SalarioBruto = tc.nextDouble();

        D1.CalculoDescontoInss(SalarioBruto);

        S = SalarioBruto - D1.CalculoDescontoInss(SalarioBruto);

        System.out.println(Nome);
        System.out.printf("Inss = %.2f%n", D1.CalculoDescontoInss(SalarioBruto));
        System.out.printf("Vt = %.2f%n", D2.CalculoDescontoVt(SalarioBruto));
        System.out.printf("Ir = %.2f%n", D3.CalculoDescontoIrrf(S));
        System.out.printf("Vr = %.2f%n", D4.CalculoDescontoVr(SalarioBruto));
        System.out.printf("VA = %.2f%n", D5.calculoVa(SalarioBruto));
        System.out.printf("Convenio = %.2f%n", D6.CalculoDescontoConvenio(SalarioBruto));
    }

}
