package holerite;
import beneficios.*;
import descontosTributarios.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        CalculoInss D1 = new CalculoInss();
        CalculoVT D2 = new CalculoVT();
        Irrf D3 = new Irrf();
        double SalarioBruto, SalaarioLiquido, S;
        String Nome;
        System.out.println("Insira o nome do funcionário: ");
        Nome = tc.nextLine();

        System.out.println("Insira o salário do Funcionário: ");
        SalarioBruto = tc.nextDouble();

        D1.CalculoDescontoInss(SalarioBruto);
        
        S = SalarioBruto - D1.CalculoDescontoInss(SalarioBruto);
        

        System.out.println(Nome);
        System.out.printf("%.2f%n", D1.CalculoDescontoInss(SalarioBruto));
        System.out.printf("%.2f%n", D2.CalculoDescontoVt(SalarioBruto));
        System.out.printf("%.2f%n", D3.CalculoDescontoIrrf(S));

    }

}
